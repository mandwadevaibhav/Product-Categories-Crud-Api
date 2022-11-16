package com.prodCat.Repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.prodCat.Entity.ProductEntity;
@Repository
public interface ProductRepo extends JpaRepository<ProductEntity, Integer>{

}
