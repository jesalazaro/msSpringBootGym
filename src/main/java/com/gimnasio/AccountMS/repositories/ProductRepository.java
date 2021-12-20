package com.gimnasio.AccountMS.repositories;
import com.gimnasio.AccountMS.models.Product;
import org.springframework.data.mongodb.repository.MongoRepository;

public interface ProductRepository extends MongoRepository<Product, String> {

}
