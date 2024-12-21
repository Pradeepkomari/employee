package com.product.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import com.product.dao.ProductDao;
import com.product.entity.Product;

@Service
public class ProductService {

	@Autowired
	ProductDao pd;

	public String add(List<Product> e) {
		return pd.add(e);
	}

	public List<Product> getAll() {
		return pd.getAll();
	}
	


}
