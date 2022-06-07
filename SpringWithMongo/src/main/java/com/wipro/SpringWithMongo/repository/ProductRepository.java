package com.wipro.SpringWithMongo.repository;

import org.springframework.data.mongodb.repository.MongoRepository;

import com.wipro.SpringWithMongo.entity.Product;

public interface ProductRepository extends MongoRepository<Product, String> {

}
