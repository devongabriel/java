package com.codingdojo.productsandcategories.controllers;


import javax.validation.Valid;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;

import com.codingdojo.productsandcategories.models.CategoryProduct;
import com.codingdojo.productsandcategories.services.InventoryService;

@Controller
public class CategoryProductController {
	
	@Autowired
	InventoryService inventoryService;
	
	@PostMapping("/addCategory")
	public String addCategory(@Valid @ModelAttribute("middleTableObject") CategoryProduct categoryProduct, BindingResult results) {
		if(results.hasErrors()) {
			return "products/show.jsp";
		}
		CategoryProduct catProduct = inventoryService.createCategoryProduct(categoryProduct);
		return "redirect:/products/"+ catProduct.getProduct().getId();
	}

	
}
