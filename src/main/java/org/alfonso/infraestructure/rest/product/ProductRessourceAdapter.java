package org.alfonso.infraestructure.rest.product;

import org.alfonso.application.DateFormatter;
import org.alfonso.domain.price.*;
import org.alfonso.domain.product.Product;
import org.alfonso.domain.product.ProductId;
import org.alfonso.domain.product.ProductName;

import java.util.Date;
import java.util.List;

public class ProductRessourceAdapter
{
    private DateFormatter dateFormatter = new DateFormatter();



    public Product toDomain(CreateProductRequest createProductRequest)
    {
        ProductId productId = new ProductId();
        ProductName productName = new ProductName(createProductRequest.getProductName());
        List<Price> productList = createProductRequest.getPriceDTOList().stream()
                .map(it-> createPriceDTOToDomain(it)).toList();

        return new Product(productId, productName, productList);
    }

    public CreateProductRequest toRessource (Product product)
    {
        return null;
    }

    public Price createPriceDTOToDomain (CreatePriceDTO createPriceDTO)
    {
        PriceId priceId = new PriceId(createPriceDTO.getPriceId());
        Priority priority = new Priority(createPriceDTO.getPriority());
        CurrencyType currencyType = CurrencyType.valueOf(createPriceDTO.getCurrencyType());
        Float value = createPriceDTO.getValue();
        Money money = new Money(currencyType,value);
        BrandId brandId = new BrandId(createPriceDTO.getBrandId());
        Date startDate = dateFormatter.parseDate(createPriceDTO.getStartDate());
        Date endDate = dateFormatter.parseDate(createPriceDTO.getEndDate());
        DateInRange dateInRange = new DateInRange(startDate,endDate);

        return new Price(priceId,priority,money,brandId,dateInRange);
    }

}
