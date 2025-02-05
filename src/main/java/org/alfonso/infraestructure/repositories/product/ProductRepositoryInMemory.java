package org.alfonso.infraestructure.repositories.product;

import org.alfonso.application.ProductRepository;
import org.alfonso.domain.product.Product;
import org.alfonso.domain.product.ProductId;

import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Optional;

public class ProductRepositoryInMemory implements ProductRepository
{
    private Map<ProductId,ProductEntity> productMap = new HashMap<>();



    @Override
    public void addProduct(Product product)
    {

    }

    @Override
    public Optional<Product> findProductById(ProductId id)
    {
        return Optional.empty();
    }

    @Override
    public List<Product> findAll()
    {
        return List.of();
    }
}
