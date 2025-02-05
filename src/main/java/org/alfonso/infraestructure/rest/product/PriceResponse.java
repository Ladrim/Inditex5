package org.alfonso.infraestructure.rest.product;

public class PriceResponse
{
    private final Integer priceId;
    private final Integer priority;
    private final String currencyType;
    private final Float value;
    private final Integer brandId;
    private final String startDate;
    private final String endDate;

    public PriceResponse(Integer priceId, Integer priority, String currencyType, Float value, Integer brandId,
                         String startDate, String endDate)
    {
        this.priceId = priceId;
        this.priority = priority;
        this.currencyType = currencyType;
        this.value = value;
        this.brandId = brandId;
        this.startDate = startDate;
        this.endDate = endDate;
    }

    public Integer getPriceId()
    {   return priceId;}

    public Integer getPriority()
    {   return priority;}

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
