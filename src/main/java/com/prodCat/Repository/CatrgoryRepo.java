package com.prodCat.Repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.prodCat.Entity.CategoryEntity;
@Repository
public interface CatrgoryRepo extends JpaRepository<CategoryEntity, Integer>{

}
