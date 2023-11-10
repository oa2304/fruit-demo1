package com.example.factory;

/**
 * @author ccy
 * @create 2023-11-09 21:38
 */
public class FruitFactory {
    public Fruit createFruit(String type) {
        Fruit fruit = null;
        if ("Apple".equals(type)) {
            fruit = new Apple();
        } else if ("Strawberry".equals(type)) {
            fruit = new Strawberry();
        } else if ("Mango".equals(type)) {
            fruit = new Mango();
        }
        return fruit;
    }
}
