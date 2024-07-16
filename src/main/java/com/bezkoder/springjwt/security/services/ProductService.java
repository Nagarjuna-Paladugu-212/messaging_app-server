package com.bezkoder.springjwt.security.services;

import org.springframework.data.domain.Page;

import com.bezkoder.springjwt.models.Product;

public interface ProductService{
	
	 String saveProduct(Product product) ;

	
		 Page<Product> getUsers(int page, int size,String sortField,String sortDirection);


}
