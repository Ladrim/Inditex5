package org.alfonso.infraestructure.rest.product;

import java.util.List;

public class CreateProductRequest
{
   private final Integer productId;
   private final String productName;
   private final List<CreatePriceDTO> priceDTOList;

   public CreateProductRequest(Integer productId, String productName, List<CreatePriceDTO> priceDTOList)
   {
      this.productId = productId;
      this.productName = productName;
      this.priceDTOList = priceDTOList;
   }

   public Integer getProductId()
   {  return productId;}

   public String getProductName()
   {  return productName;}

   public List<CreatePriceDTO> getPriceDTOList()
   {  return priceDTOList;}
}
