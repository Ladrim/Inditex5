package org.alfonso.application;

import org.alfonso.domain.price.BrandId;
import org.alfonso.domain.price.Price;
import org.alfonso.domain.product.Product;
import org.alfonso.domain.product.ProductId;

import java.util.Date;
import java.util.Optional;

public class PriceUseCase
{
    private final ProductRepository productRepository;

    public PriceUseCase(ProductRepository productRepository)
    {
        this.productRepository = productRepository;
    }

    public Optional<Price> findPrice(ProductId productId, BrandId brandId, Date date)
    {
       Optional<Product> product = productRepository.findProductById(productId);

       return product.flatMap(it->it.findBy(brandId,date));
    }
}
