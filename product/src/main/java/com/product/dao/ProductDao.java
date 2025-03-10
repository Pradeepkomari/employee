package com.product.dao;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;
import com.product.entity.Product;
import com.product.repository.ProductRepository;

@Repository
public class ProductDao {
	@Autowired
	ProductRepository pr;

	public String add(List<Product> e) {
		pr.saveAll(e);
		return "Stored";
	}

	public List<Product> getAll() {
		return pr.findAll();
	}

}
