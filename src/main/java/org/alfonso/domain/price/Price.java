package org.alfonso.domain.price;

public class Price
{
    private final PriceId priceId;
    private final Priority priority;
    private final Money money;
    private final BrandId brandId;
    private final DateInRange dateInRange;


    public Price(PriceId priceId,Priority priority, Money money, BrandId brandId, DateInRange dateInRange)
    {
        this.priceId = priceId;
        this.priority = priority;
        this.money = money;
        this.brandId = brandId;
        this.dateInRange = dateInRange;
    }

    public Priority getPriority()
    {   return priority;}

    public Money getMoney()
    {   return money;}

    public BrandId getBrandId()
    {   return brandId;}

    public DateInRange getDateInRange()
    {   return dateInRange;}

    public PriceId getPriceId()
    {   return priceId;}
}
