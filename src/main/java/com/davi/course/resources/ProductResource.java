package com.davi.course.resources;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.davi.course.entities.Product;
import com.davi.course.services.ProductService;

@RestController
@RequestMapping("/products")
public class ProductResource {
	
	@Autowired
	private ProductService productService;

	@GetMapping
	public ResponseEntity<List<Product>> findAll(){
		return ResponseEntity.ok().body(productService.findAll());
	}
	
	@GetMapping("{id}")
	public ResponseEntity<Product> findById(@PathVariable Long id){
		return ResponseEntity.ok().body(productService.findById(id));
	}
}
