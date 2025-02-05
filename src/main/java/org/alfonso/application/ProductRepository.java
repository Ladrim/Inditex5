package org.alfonso.application;

import org.alfonso.domain.price.Price;
import org.alfonso.domain.product.Product;
import org.alfonso.domain.product.ProductId;
import org.alfonso.infraestructure.repositories.product.ProductEntity;

import java.util.List;
import java.util.Optional;

public interface ProductRepository
{
    void addProduct(Product product);

    Optional<Product> findProductById(ProductId id);

    List<Product> findAll();

}
