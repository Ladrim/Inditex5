package org.alfonso.domain.price;

import java.util.Objects;

public class BrandId
{
    private final Integer brandId;

    public BrandId(Integer brandId)
    {
        this.brandId = brandId;
    }

    @Override
    public boolean equals(Object o) {
        if (o == null || getClass() != o.getClass()) return false;
        BrandId brandId1 = (BrandId) o;
        return Objects.equals(brandId, brandId1.brandId);
    }

    @Override
    public int hashCode() {
        return Objects.hashCode(brandId);
    }
}
