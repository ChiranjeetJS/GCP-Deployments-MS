package com.myself.gcpdeployments.GCP.Deployment.MS.model;

import java.util.UUID;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;

@Entity
public class ProductModel {

	@Override
	public String toString() {
		return "productId=" + productId + ", productName=" + productName + ", userId=" + userId + ", cost="
				+ cost;
	}
	@Id
	private String productId = UUID.randomUUID().toString();
	public String getProductId() {
		return productId;
	}
	public void setProductId(String productId) {
		this.productId = productId;
	}
	public String getProductName() {
		return productName;
	}
	public void setProductName(String productName) {
		this.productName = productName;
	}
	public String getUserId() {
		return userId;
	}
	public void setUserId(String userId) {
		this.userId = userId;
	}
	public String getStatus() {
		return status;
	}
	public void setStatus(String status) {
		this.status = status;
	}
	public int getCost() {
		return cost;
	}
	public void setCost(int cost) {
		this.cost = cost;
	}
	private String productName;
	private String userId;
	private int cost;
	private String status;
	
	
}
