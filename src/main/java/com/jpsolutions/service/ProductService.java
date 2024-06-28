package com.jpsolutions.service;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.jpsolutions.dto.LoginDto;
import com.jpsolutions.dto.ProductDto;
import com.jpsolutions.dto.UserDto;
import com.jpsolutions.model.Product;
import com.jpsolutions.model.User;
import com.jpsolutions.repository.ProductRepository;
import com.jpsolutions.repository.UserRepository;

import jakarta.transaction.Transactional;

@Service
@Transactional
public class ProductService implements IProductService {

	@Autowired
	private ProductRepository repository;

	@Override
	public Product create(ProductDto dto) throws Exception {

		Product product = new Product(dto);
		repository.save(product);		
		return product;
	}

	@Override
	public Product update(Product product) throws Exception {
		repository.save(product);
		return product;
	}

	@Override
	public Optional<Product> getById(long id) throws Exception {
		return repository.findById(id);
	}

	@Override
	public Product getByName(String name) throws Exception {
		return repository.getProductByName(name);
	}

	@Override
	public void delete(long id) throws Exception {
		repository.deleteById(id);
	}

	@Override
	public List<Product> getAll() throws Exception {
		return repository.findAll();
	}


}
