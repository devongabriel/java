package com.codingdojo.productsandcategories.controllers;

import java.util.List;

import javax.validation.Valid;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;

import com.codingdojo.productsandcategories.models.Category;
import com.codingdojo.productsandcategories.models.CategoryProduct;
import com.codingdojo.productsandcategories.models.Product;
import com.codingdojo.productsandcategories.services.InventoryService;

@Controller
public class ProductController {
	
	@Autowired
	InventoryService inventoryService;
	
	@GetMapping("/products/new")
	public String newProduct(@ModelAttribute("newProductObject") Product product) {
		return "products/new.jsp";
	}
	@PostMapping("/products/new")
	public String createProduct(@Valid @ModelAttribute("newProductObject") Product product, BindingResult results) {
		if(results.hasErrors()) {
			return "products/new.jsp";
		}
		Product prod = inventoryService.createNewProduct(product);
		return "redirect:/products/" + prod.getId();
	}
	@GetMapping("products/{id}")
	public String showProduct(Model model, @PathVariable("id") Long id, @ModelAttribute("middleTableObject") CategoryProduct categoryProduct) {
		Product prod = inventoryService.findOneProduct(id);
//		List<Category> allCategories = inventoryService.getAllCategories(); 
		List<Category> allCategories = inventoryService.getAllCategoriesNotInProducts(prod); 
		
		model.addAttribute("product", prod);
		
		model.addAttribute("allCategories", allCategories);
		
		return "products/show.jsp";
	}
}
