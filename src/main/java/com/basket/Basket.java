package com.basket;

import java.util.Arrays;
import java.util.Collection;

public record Basket(Collection<Fruit> fruits) {
    Basket(final Fruit... fruits) {
        this(Arrays.asList(fruits));
    }
}