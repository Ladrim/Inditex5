package org.alfonso.domain.price;

public class Money
{
    private final CurrencyType currencyType;
    private final Float value;

    public Money(CurrencyType currencyType, Float value)
    {
        this.currencyType = currencyType;
        this.value = value;
    }
}
