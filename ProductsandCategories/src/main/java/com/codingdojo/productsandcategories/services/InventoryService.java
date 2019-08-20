package com.codingdojo.productsandcategories.services;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

import javax.validation.Valid;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.codingdojo.productsandcategories.models.Category;
import com.codingdojo.productsandcategories.models.CategoryProduct;
import com.codingdojo.productsandcategories.models.Product;
import com.codingdojo.productsandcategories.repositories.CategoryProductRepository;
import com.codingdojo.productsandcategories.repositories.CategoryRepository;
import com.codingdojo.productsandcategories.repositories.ProductRepository;

@Service
public class InventoryService {
	
	@Autowired
	private ProductRepository productRepository;
	@Autowired
	private CategoryRepository categoryRepository;
	@Autowired
	private CategoryProductRepository categoryProductRepository;

	public Product createNewProduct(@Valid Product product) {
		return productRepository.save(product);
	}

	public Product findOneProduct(Long id) {
		Optional<Product> optionalProduct = productRepository.findById(id);
		if(optionalProduct.isPresent()) {
			return optionalProduct.get();
		} else {
		 return null;
		}
	}

	public List<Category> getAllCategories() {
		return categoryRepository.findAll();
	}

	public Category createNewCategory(@Valid Category category) {
		return categoryRepository.save(category);
	}

	public CategoryProduct createCategoryProduct(@Valid CategoryProduct categoryProduct) {
		return categoryProductRepository.save(categoryProduct);
	}
	
	public List<Category> getAllCategoriesNotInProducts(Product product) {
		List<String> listInProduct = new ArrayList<String>();
		if(product.getCategories().size() == 0) {
			listInProduct.add("");
		}
		for(Category cat: product.getCategories()) {
			listInProduct.add(cat.getName());
		}
		return categoryRepository.findByNameNotIn(listInProduct);
	}
		
	
}
