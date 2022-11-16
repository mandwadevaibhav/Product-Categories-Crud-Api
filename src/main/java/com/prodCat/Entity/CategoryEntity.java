package com.prodCat.Entity;

import java.util.ArrayList;
import java.util.List;

import javax.persistence.CascadeType;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.OneToMany;

@Entity
public class CategoryEntity {
	@Id
    @GeneratedValue(strategy = GenerationType.AUTO)
	private Integer categoryId;
	private String categoryName;
	
	@OneToMany(cascade = CascadeType.ALL)
    @JoinColumn(name = "categoryId", referencedColumnName = "categoryId")
    List <ProductEntity> products = new ArrayList <> ();
	
	public List<ProductEntity> getProducts() {
		return products;
	}

	public void setProducts(List<ProductEntity> products) {
		this.products = products;
	}

	public Integer getCategoryId() {
		return categoryId;
	}
	
	public void setCategoryId(Integer categoryId) {
		this.categoryId = categoryId;
	}
	public String getCategoryName() {
		return categoryName;
	}
	public void setCategoryName(String categoryName) {
		this.categoryName = categoryName;
	}
	@Override
	public String toString() {
		return "CategoryEntity [categoryId=" + categoryId + ", categoryName=" + categoryName + "]";
	}
	public CategoryEntity(String categoryName) {
		super();
		this.categoryName = categoryName;
	}
	public CategoryEntity() {
		super();
		// TODO Auto-generated constructor stub
	}
	
	

}
