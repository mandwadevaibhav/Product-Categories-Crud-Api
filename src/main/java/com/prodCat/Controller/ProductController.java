package com.prodCat.Controller;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.PageRequest;
import org.springframework.data.domain.Pageable;
import org.springframework.data.domain.Sort;
import org.springframework.data.domain.Sort.Direction;
import org.springframework.validation.annotation.Validated;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;
import com.prodCat.Entity.ProductEntity;
import com.prodCat.Service.ProductService;

@RestController
@RequestMapping("/api")
public class ProductController {

	@Autowired
	private ProductService productService;

	// Save operation
	@PostMapping("/products")
	public ProductEntity saveProduct(@Validated @RequestBody ProductEntity product) {
		return productService.saveProduct(product);
	}

	// Read operation
	@GetMapping("/products")
	public List<ProductEntity> getAllProduct() {
		return productService.getAllProduct();
	}
	
	@GetMapping("/productAll")
	public Page<ProductEntity> getAllP(@RequestParam(defaultValue="0") int page,@RequestParam(defaultValue="5") int size) {
		Pageable pageable=PageRequest.of(page, size,Sort.by(Direction.DESC, "productId"));
		return productService.getAll(pageable);
	}

	// Update operation
	@PutMapping("/products/{productId}")
	public ProductEntity updateProduct(@RequestBody ProductEntity product, @PathVariable("productId") Integer productId) {
		return productService.updateProduct(product, productId);
	}

	// Delete operation
	@DeleteMapping("/products/{productId}")
	public String delectProductById(@PathVariable("productId") Integer productId) {
		productService.delectProductById(productId);
		return "Deleted Successfully";
	}
	
	// Update operation
	@GetMapping("/products/{productId}")
		public Optional<ProductEntity> findById(@PathVariable("productId") Integer productId) {
			return productService.findById(productId);
		}

}
