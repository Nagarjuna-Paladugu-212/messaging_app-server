package com.bezkoder.springjwt.security.services;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.PageRequest;
import org.springframework.data.domain.Sort;
import org.springframework.stereotype.Service;

import com.bezkoder.springjwt.models.Product;
import com.bezkoder.springjwt.repository.ProductRepository;

@Service
public class ProductServiceImpl implements ProductService{

	@Autowired
	private ProductRepository productRepository;
	
	public String saveProduct(Product product) {
		
		Product p=productRepository.save(product);
		
		return "product added successfully "+  p.toString();
		
	}
	
	
	public Page<Product> getUsers(int page, int size,String sortField,String sortDirection){
		Sort sort =Sort.by(Sort.Direction.fromString(sortDirection),sortField);
		return productRepository.findAll(PageRequest.of(page, size,sort));
	}


	
	
}
