package com.useProduct.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.core.ParameterizedTypeReference;
import org.springframework.http.HttpMethod;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.client.RestTemplate;

import com.useProduct.pojo.ProductPojo;

@RestController
@RequestMapping("/useproduct")
public class UseProductController {

	@Autowired
	RestTemplate rt;

	@GetMapping("/GetAllWithTax")
	public List<ProductPojo> getAll() {
		String url1 = "http://localhost:8086/product/getall";
		String url2 = "http://localhost:8085/gst/gethsn/";

		ResponseEntity<List<ProductPojo>> list = rt.exchange(url1, HttpMethod.GET, null,
				                                 new ParameterizedTypeReference<List<ProductPojo>>() {});
		List<ProductPojo> product = list.getBody();

		product.forEach(x -> {
			int hsn = x.getHsnCode();
			ResponseEntity<Integer> val = rt.exchange(url2 + hsn, HttpMethod.GET, null, Integer.class);
			int get = val.getBody();

			x.setPrice(x.getPrice() + (x.getPrice() * get / 100));
		});

		return product;
	}

}
