package com.example.factory;

import java.math.BigDecimal;

/**
 * @author ccy
 * @create 2023-11-09 21:10
 */
public class Mango extends Fruit {
    public BigDecimal getCount(String weight) {
        BigDecimal bPrice = new BigDecimal("20");
        BigDecimal bWeight = new BigDecimal(weight);
        return bPrice.multiply(bWeight);
    }
}
