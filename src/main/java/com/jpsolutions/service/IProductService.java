package com.jpsolutions.service;

import java.util.List;
import java.util.Optional;

import org.springframework.stereotype.Service;

import com.jpsolutions.dto.ProductDto;
import com.jpsolutions.model.Product;

@Service
public interface IProductService {

	public Product create(ProductDto dto) throws Exception;
	public Product update(Product product) throws Exception;
	public List<Product> getAll() throws Exception;
	public Optional<Product> getById(long id)throws Exception;
	public Product getByName(String name)throws Exception;
	public void delete(long id) throws Exception;
}
