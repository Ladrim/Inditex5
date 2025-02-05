package org.alfonso.infraestructure.rest.product;

import java.util.List;

public class ProductResponse
{
    private final String productId;
    private final String productName;
    private final List<PriceResponse> priceResponseList;

    public ProductResponse(List<PriceResponse> priceResponseList, String productName, String productId)
    {
        this.priceResponseList = priceResponseList;
        this.productName = productName;
        this.productId = productId;
    }

    public String getProductId()
    {   return productId;}

    public String getProductName()
    {   return productName;}

    public List<PriceResponse> getPriceResponseList()
    {   return priceResponseList;}
}
