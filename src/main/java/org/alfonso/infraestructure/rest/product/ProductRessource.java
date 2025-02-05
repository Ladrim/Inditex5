package org.alfonso.infraestructure.rest.product;

import org.alfonso.application.PriceUseCase;
import org.alfonso.application.ProductUseCase;
import org.springframework.web.bind.annotation.*;

@RestController
public class ProductRessource
{
    private final ProductUseCase productUseCase;
    private final PriceUseCase priceUseCase;

    public ProductRessource(ProductUseCase productUseCase, PriceUseCase priceUseCase)
    {
        this.productUseCase = productUseCase;
        this.priceUseCase = priceUseCase;
    }

    @PostMapping("Product/")
    public ProductResponse addProduct(@RequestBody CreateProductRequest request)
    {

    }

    @GetMapping("Product/{productId")
    public ProductResponse findByProductById(@PathVariable Integer productId)
    {
        return null;
    }

    @PostMapping("Price/")
    public PriceResponse findPrice(@RequestBody PriceByProductIdBrandIdDateRequest request)
    {
        return null;
    }
}
