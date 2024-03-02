package com.myself.gcpdeployments.GCP.Deployment.MS.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.myself.gcpdeployments.GCP.Deployment.MS.respository.*;
import com.myself.gcpdeployments.GCP.Deployment.MS.model.ProductModel;

@Service
public class ProductService {

	@Autowired
	 ProductRepository repo;
	
	

	
	public void addProduct(ProductModel p) {
		// TODO Auto-generated method stub

		
		
		
	  
	}

	public List<ProductModel> getProducts() {
		// TODO Auto-generated method stub
		
		return repo.findAll();
	}
	
	public ProductModel findProductById(String pId) {
		
		return repo.findById(pId).get();
	}

}
