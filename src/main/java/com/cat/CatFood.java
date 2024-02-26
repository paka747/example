package com.cat;

import java.util.Objects;

public final class CatFood {
    private final String name;
    private final double price;

    public CatFood(String name, double price) {
        this.name = name;
        this.price = price;
    }

    public String name() {
        return name;
    }

    public double price() {
        return price;
    }

    @Override
    public boolean equals(Object obj) {
        if (obj == this) return true;
        if (obj == null || obj.getClass() != this.getClass()) return false;
        var that = (CatFood) obj;
        return Objects.equals(this.name, that.name) &&
                Double.doubleToLongBits(this.price) == Double.doubleToLongBits(that.price);
    }

    @Override
    public int hashCode() {
        return Objects.hash(name, price);
    }

    @Override
    public String toString() {
        return "CatFood[" +
                "name=" + name + ", " +
                "price=" + price + ']';
    }
}