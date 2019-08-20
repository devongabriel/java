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
import com.codingdojo.productsandcategories.models.Product;
import com.codingdojo.productsandcategories.services.InventoryService;

@Controller
public class CategoryController {
	
	@Autowired
	InventoryService inventoryService;
	

	@GetMapping("/category/new")
	public String newCategory(@ModelAttribute("newCategoryObject") Category category) {
		return "categories/new.jsp";
	}
	
	@PostMapping("/category/new")
	public String createCategory(@Valid @ModelAttribute("newCategoryObject") Category category, BindingResult results) {
		if(results.hasErrors()) {
			return "categories/new.jsp";
		}
		Category cat = inventoryService.createNewCategory(category);
		return "redirect:/products/new";
	}
	
	@GetMapping("category/{id}")
	public String showCategory(Model model, @PathVariable("id") Long id, @ModelAttribute("middleTableObject") Category category) {
		Product prod = inventoryService.findOneProduct(id);
		List<Category> allCategories = inventoryService.getAllCategories(); 
		model.addAttribute("product", prod);
		model.addAttribute("allCategories", allCategories);
		
		return "products/show.jsp";  
	}
	
}
