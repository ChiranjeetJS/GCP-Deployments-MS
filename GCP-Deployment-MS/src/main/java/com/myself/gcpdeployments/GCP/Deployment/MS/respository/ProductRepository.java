package com.myself.gcpdeployments.GCP.Deployment.MS.respository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;


import com.myself.gcpdeployments.GCP.Deployment.MS.model.ProductModel;
@Repository
public interface ProductRepository extends JpaRepository<ProductModel, String> {

}
