package org.alfonso.application;

import org.alfonso.domain.product.Product;
import org.alfonso.domain.product.ProductId;

import java.util.Optional;

public class ProductUseCase
{
    private final ProductRepository productRepository;

    public ProductUseCase(ProductRepository productRepository)
    {
        this.productRepository = productRepository;
    }

    public void addProduct(Product product)
    {
        productRepository.addProduct(product);
    }

    public Optional<Product> findProductById(ProductId productId)
    {
        return productRepository.findProductById(productId);

    }
}
