package com.jpsolutions.model;

import java.math.BigDecimal;

import com.jpsolutions.dto.ProductDto;
import com.jpsolutions.dto.UserDto;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.Id;
import jakarta.persistence.Table;

@Entity
@Table(name = "products")
public class Product{

	@Id
	@GeneratedValue   
	private Long id;
	private String name;
	private BigDecimal value;
	private String description;
	
	public Product() {};
	
	public Product(ProductDto dto) {
		this.name = dto.getName();
		this.value = dto.getValue();
		this.description = dto.getDescription();
	}
	
	public Long getId() {
		return id;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public BigDecimal getValue() {
		return value;
	}

	public void setValue(BigDecimal value) {
		this.value = value;
	}

	public String getDescription() {
		return description;
	}

	public void setDescription(String description) {
		this.description = description;
	}
	
}