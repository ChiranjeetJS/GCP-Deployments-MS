package com.myself.gcpdeployments.GCP.Deployment.MS.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import java.util.List;

import com.myself.gcpdeployments.GCP.Deployment.MS.model.ProductModel;
import com.myself.gcpdeployments.GCP.Deployment.MS.service.*;

@RestController
@RequestMapping("/product")
public class ProductController {

	
	@Autowired
	ProductService service;
	
	@PostMapping("/addProduct")
	public ProductModel addProduct(@RequestBody ProductModel p) {
		
		service.addProduct(p);
		
		return p;
	}
	
	@GetMapping("/getProducts")
	public List<ProductModel> getProducts(){
		
		return service.getProducts();
	}
	
	

}
