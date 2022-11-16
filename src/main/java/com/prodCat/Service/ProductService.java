package com.prodCat.Service;

import java.util.List;
import java.util.Optional;

import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;

import com.prodCat.Entity.ProductEntity;

public interface ProductService{
	
	//save Product
	
	ProductEntity saveProduct(ProductEntity product);
	
	//Get All Product

	List<ProductEntity> getAllProduct();
	
	//Update By Id
	
	ProductEntity updateProduct(ProductEntity product, Integer productId);
	
	//Delete Product By Id

	void delectProductById(Integer productId);
	
	//get by Id
	
	Optional<ProductEntity> findById(Integer productId);
	
	Page<ProductEntity> getAll(Pageable pageable);
 	

}
