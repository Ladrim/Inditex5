package org.alfonso.domain.product;

import org.alfonso.application.DateFormatter;
import org.alfonso.domain.price.*;
import org.assertj.core.api.Assertions;
import org.junit.jupiter.api.Nested;
import org.junit.jupiter.api.Test;

import java.util.*;

class ProductTest
{
    private final DateFormatter dateFormatter = new DateFormatter();


    //Price1------------------------------------------------------------------------------------------------------------
    PriceId priceId1 = new PriceId(1);
    Priority priority1 = new Priority(0);
    Money money1 = new Money(CurrencyType.EUR,35.50f);
    BrandId brandId1 = new BrandId(1);
    Date startDate1 =  dateFormatter.parseDate("14-06-2020 00:00:00");
    Date endDate1 = dateFormatter.parseDate("31-12-2020 23:59:59");
    DateInRange dateInRange1 = new DateInRange(startDate1,endDate1);
    Price price1 = new Price(priceId1,priority1,money1,brandId1,dateInRange1);
    //Price2------------------------------------------------------------------------------------------------------------
    PriceId priceId2 = new PriceId(2);
    Priority priority2 = new Priority(1);
    Money money2 = new Money(CurrencyType.EUR,25.45f);
    BrandId brandId2 = new BrandId(1);
    Date startDate2 =  dateFormatter.parseDate("14-06-2020 15:00:00");
    Date endDate2 = dateFormatter.parseDate("14-06-2020 18:30:00");
    DateInRange dateInRange2 = new DateInRange(startDate2,endDate2);
    Price price2 = new Price(priceId2,priority2,money2,brandId2,dateInRange2);
    //Price3------------------------------------------------------------------------------------------------------------
    PriceId priceId3 = new PriceId(3);
    Priority priority3 = new Priority(1);
    Money money3 = new Money(CurrencyType.EUR,30.50f);
    BrandId brandId3 = new BrandId(1);
    Date startDate3 =  dateFormatter.parseDate("15-06-2020 00:00:00");
    Date endDate3 = dateFormatter.parseDate("14-06-2020 11:00:00");
    DateInRange dateInRange3 = new DateInRange(startDate3,endDate3);
    Price price3 = new Price(priceId3,priority3,money3,brandId3,dateInRange3);
    //Price4------------------------------------------------------------------------------------------------------------
    PriceId priceId4 = new PriceId(4);
    Priority priority4 = new Priority(1);
    Money money4 = new Money(CurrencyType.EUR,38.95f);
    BrandId brandId4 = new BrandId(1);
    Date startDate4 =  dateFormatter.parseDate("15-06-2020 16:00:00");
    Date endDate4 = dateFormatter.parseDate("31-12-2020 23:59:59");
    DateInRange dateInRange4 = new DateInRange(startDate4,endDate4);
    Price price4 = new Price(priceId4,priority4,money4,brandId4,dateInRange4);

    //Product1----------------------------------------------------------------------------------------------------------
    ProductId productId1 = new ProductId();
    ProductName productName1 = new ProductName("Camiseta");
    List<Price> priceList1 = Arrays.asList(price1, price2, price3, price4);


    Product undertest = new Product(productId1,productName1,priceList1);


    @Nested
    class BrandOrDateAreNotInPrice
    {
        @Test
        public void whenBrandIdIsNotInPriceListItShouldReturnAnEmptyObject()
        {

            BrandId brandId = new BrandId(2);
            Date date = dateFormatter.parseDate("14-06-2020 15:30:30");

            Optional<Price> result =  undertest.findBy(brandId,date);

            Assertions.assertThat(result).isEmpty();
        }

        @Test
        public void whenDateIsNotInPriceListItShouldReturnAnEmptyObject()
        {
            BrandId brandId = new BrandId(1);
            Date date = dateFormatter.parseDate("14-06-2022 15:30:30");

            Optional<Price> result = undertest.findBy(brandId,date);

            Assertions.assertThat(result).isEmpty();
        }
    }
    @Nested
    class BrandAndDateAreInPrice
    {
        @Test
        public void whenAPriceCoincideIntheDateIntervalItShouldReturnIt()
        {
            BrandId brandId = new BrandId(1);
            Date date = dateFormatter.parseDate("15-06-2020 12:00:00");
            Optional<Price> result = undertest.findBy(brandId,date);
            Optional<Price> expectedResult = Optional.ofNullable(price1);
            Assertions.assertThat(result).usingRecursiveComparison().isEqualTo(expectedResult);
        }
        @Test
        public void whenTwoPricesCoincideInTheSameDateIntervalItShouldReturnThePriceWithHigherPriority()
        {
            BrandId brandId = new BrandId(1);
            Date date = dateFormatter.parseDate("14-06-2020 15:30:30");
            Optional<Price> expectedResult = Optional.ofNullable(price2);
            Optional<Price> result = undertest.findBy(brandId,date);
            Assertions.assertThat(result).usingRecursiveComparison().isEqualTo(expectedResult);
        }
    }
}