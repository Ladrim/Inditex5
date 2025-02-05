package org.alfonso.domain.product;

import org.alfonso.domain.price.BrandId;
import org.alfonso.domain.price.Price;

import java.util.Comparator;
import java.util.Date;
import java.util.List;
import java.util.Optional;

public class Product
{
    private final ProductId productId;
    private final ProductName productName;
    private final List<Price> priceList;

    public Product(ProductId productId, ProductName productName, List<Price> priceList)
    {
        this.productId = productId;
        this.productName = productName;
        this.priceList = priceList;
    }

    public Optional<Price> findBy(BrandId brandId, Date date)
    {
        return priceList.stream()
                .filter(it->it.getBrandId().equals(brandId))
                .filter(it->it.getDateInRange().isInRange(date))
                .max(Comparator.comparing(it->it.getPriority().getValue()));
    }

    public ProductId getProductId()
    {   return productId;}
}

