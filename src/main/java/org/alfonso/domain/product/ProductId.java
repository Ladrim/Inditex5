package org.alfonso.domain.product;

import java.util.UUID;

public class ProductId
{
    private final UUID value;

    public ProductId()
    {
        this.value = UUID.randomUUID();
    }
}
