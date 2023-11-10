package com.example.factory;

import java.math.BigDecimal;

/**
 * @author ccy
 * @create 2023-11-09 21:46
 */
public class FruitStore {
    /**
     * 计算购买水果价格
     * @param orders 水果和重量
     * @param promotionType 促销类别 1-没有促销 2-草莓8折 3-草莓8折总价满100少10元
     * @return
     */
    public String countFruit(String orders, int promotionType) {
        BigDecimal count = new BigDecimal("0");
        for (String order : orders.split(",")) {
            FruitFactory fruitFactory = new FruitFactory();
            String type = order.split(" ")[0];
            Fruit fruit = fruitFactory.createFruit(type);
            BigDecimal price = fruit.getCount(order.split(" ")[1]);
            if ("Strawberry".equals(type) && promotionType != Constant.NO_PROMOTION) {
                price = price.multiply(new BigDecimal("0.8"));
            }
            count = count.add(price);
            System.out.println(type + "价格为：" + price.toString());
        }
        if (promotionType == Constant.PROMOTION) {
            int promotion = Integer.valueOf(count.divide(new BigDecimal("100"),0, BigDecimal.ROUND_DOWN).toString());
            if (promotion >= 1) {
                count = count.subtract(new BigDecimal(promotion*10));
            }
        }
        count = count.divide(new BigDecimal("1"),2, BigDecimal.ROUND_UP);
        System.out.println("总计为：" + count.toString());
        return count.toString();
    }
}
