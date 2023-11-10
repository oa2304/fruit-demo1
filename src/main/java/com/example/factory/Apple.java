package com.example.factory;

import java.math.BigDecimal;

/**
 * @author ccy
 * @create 2023-11-09 17:46
 */
public class Apple extends Fruit {
    public BigDecimal getCount(String weight) {
        BigDecimal bPrice = new BigDecimal("8");
        BigDecimal bWeight = new BigDecimal(weight);
        return bPrice.multiply(bWeight);
    }
}
