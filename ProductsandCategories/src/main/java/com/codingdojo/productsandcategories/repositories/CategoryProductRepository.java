package com.codingdojo.productsandcategories.repositories;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import com.codingdojo.productsandcategories.models.CategoryProduct;

@Repository
public interface CategoryProductRepository extends CrudRepository<CategoryProduct, Long> {

	
}
