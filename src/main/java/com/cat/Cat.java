package com.cat;

import java.util.List;
import java.util.Objects;

public final class Cat {
    private final String name;
    private final List<CatFood> favoriteFoods;

    public Cat(String name, List<CatFood> favoriteFoods) {
        this.name = name;
        this.favoriteFoods = favoriteFoods;
    }

    public String name() {
        return name;
    }

    public List<CatFood> favoriteFoods() {
        return favoriteFoods;
    }

    @Override
    public boolean equals(Object obj) {
        if (obj == this) return true;
        if (obj == null || obj.getClass() != this.getClass()) return false;
        var that = (Cat) obj;
        return Objects.equals(this.name, that.name) &&
                Objects.equals(this.favoriteFoods, that.favoriteFoods);
    }

    @Override
    public int hashCode() {
        return Objects.hash(name, favoriteFoods);
    }

    @Override
    public String toString() {
        return "Cat[" +
                "name=" + name + ", " +
                "favoriteFoods=" + favoriteFoods + ']';
    }
}