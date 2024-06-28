package com.jpsolutions.controller;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.jpsolutions.dto.ProductDto;
import com.jpsolutions.model.Product;
import com.jpsolutions.service.IProductService;

@RestController
@RequestMapping("/products")
public class ProductController{

	@Autowired
	private IProductService productService;
	
	@PostMapping("/")	
	public Product create(@RequestBody ProductDto productDto) throws Exception{
		Product product = productService.create(productDto);
		return product;
	}
	
	@PutMapping("/")	
	public Product update(@RequestBody Product product) throws Exception{
		Product updatedProduct = productService.update(product);
		return updatedProduct;
	}
	
	@GetMapping("/")
	public List<Product> getAll() throws Exception{
		List<Product> products = productService.getAll();
		return products;
	}
	
	@GetMapping("/{id}")	
	public Optional<Product> getById(@PathVariable long id) throws Exception{
		Optional<Product> product = productService.getById(id);
		return product;
	}
	
	@DeleteMapping("/{id}")	
	public String deleteById(@PathVariable long id) throws Exception{
		productService.delete(id);
		return "Deleted";
	}
}