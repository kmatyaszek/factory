package pl.com.bottega.factory.product.management;

import lombok.Value;

import java.util.List;

@Value
public class ProductDescription {
    String matNum;
    List<String> names;
}
