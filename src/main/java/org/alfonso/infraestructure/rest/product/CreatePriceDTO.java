package org.alfonso.infraestructure.rest.product;

import org.alfonso.domain.price.PriceId;

public class CreatePriceDTO
{
    private final Integer priority;
    private final Integer priceId;
    private final String currencyType;
    private final Float value;
    private final Integer brandId;
    private final String startDate;
    private final String endDate;

    public CreatePriceDTO(Integer priority, Integer priceId, String currencyType, Float value, Integer brandId, String startDate, String endDate)
    {
        this.priority = priority;
        this.priceId = priceId;
        this.currencyType = currencyType;
        this.value = value;
        this.brandId = brandId;
        this.startDate = startDate;
        this.endDate = endDate;
    }

    public Integer getPriority()
    {   return priority;}

    public Integer getPriceId()
    {   return priceId;}

    public String getCurrencyType()
    {   return currencyType;}

    public Float getValue()
    {   return value;}

    public Integer getBrandId()
    {   return brandId;}

    public String getStartDate()
    {   return startDate;}

    public String getEndDate()
    {   return endDate;}
}
