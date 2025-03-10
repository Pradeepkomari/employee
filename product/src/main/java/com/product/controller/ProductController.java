package com.product.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import com.product.entity.Product;
import com.product.service.ProductService;

@RestController
@RequestMapping("/product")
public class ProductController {
	
	@Autowired 
	ProductService ps;
	
	@PostMapping("/post")
	public String add(@RequestBody List<Product> e) {
		return ps.add(e);
	}
	
	@GetMapping("/getall")
	public List<Product> getAll(){
		return ps.getAll();
	}

}
