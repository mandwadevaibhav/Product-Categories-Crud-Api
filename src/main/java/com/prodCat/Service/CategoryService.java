package com.prodCat.Service;

import java.util.List;
import java.util.Optional;

import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;

import com.prodCat.Entity.CategoryEntity;
import com.prodCat.Entity.ProductEntity;

public interface CategoryService {
	
	    //save category
	
		CategoryEntity saveCategory(CategoryEntity category);
		
		//Get All category

		List<CategoryEntity> getAllCategory();
		
		//Update By Id
		
		CategoryEntity updateCategory(CategoryEntity category, Integer categoryId);
		
		//Delete category By Id

		void delectCategoryById(Integer categoryId);
		
		//get by Id
		
		Optional<CategoryEntity> findById(Integer categoryId);
		

		Page<CategoryEntity> getAll(Pageable pageable);


}
