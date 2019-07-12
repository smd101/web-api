package com.example.sandbox.controller;

import com.example.sandbox.config.SchemaContextHolder;
import com.example.sandbox.config.SchemaType;
import com.example.sandbox.entity.Product;
import com.example.sandbox.service.ProductService;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.validation.annotation.Validated;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api/products")
public class ProductController {

  @Autowired
	private ProductService productService;

	@RequestMapping(method = RequestMethod.GET)
	public List<Product> getProducts() {
		return productService.findProducts();
	}

	@RequestMapping(method=RequestMethod.GET, value="/{id}")
	public Product getProduct(@PathVariable("id") Long id) {
		return productService.findProduct(id).orElseGet(null);
	}

	@RequestMapping(method=RequestMethod.POST)
	public Product createProduct(@Validated @RequestBody Product product) {
		return productService.save(product);
	}

	@RequestMapping(method=RequestMethod.PUT, value="/{id}")
	public Product updateProduct(@PathVariable("id") Long id, @RequestBody Product product) {
		product.setId(id);
		return productService.save(product);
	}

	@RequestMapping(method=RequestMethod.DELETE, value="/{id}")
	public void deleteProduct(@PathVariable("id") Long id) {
		productService.delete(id);
	}

	@GetMapping("findall")
	public List<Product> findall(@RequestParam("ds") String ds){
			if(ds.equals("ds1")){
					SchemaContextHolder.setSchemaType(SchemaType.DATA1);
			}else{
					SchemaContextHolder.setSchemaType(SchemaType.DATA2);
			}
			return getProducts();
	}	
}