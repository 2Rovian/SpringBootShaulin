package com.shaulin.springboot.Controllers;

import com.shaulin.springboot.Model.ProductModel;
import com.shaulin.springboot.Repositories.ProductRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping("/products")
public class ProductController {

    @Autowired
    ProductRepository productRepository;

    @GetMapping
    public ResponseEntity getAll(){
        List<ProductModel> listProducts = productRepository.findAll();
        return ResponseEntity.status(HttpStatus.OK).body(listProducts);
    }
}
