package com.basket;

import java.util.Arrays;
import java.util.Collection;
import java.util.Objects;
import java.util.stream.Stream;

class Basket {

  private final Collection<Fruit> fruits;

  Basket(final Fruit... fruits) {
    this.fruits = Arrays.asList(fruits);
  }

  public Stream<Fruit> fruits() {
    return fruits.stream();
  }

  @Override
  public boolean equals(final Object o) {
    if (this == o) return true;
    if (o == null || getClass() != o.getClass()) return false;
    final Basket basket = (Basket) o;
    return Objects.equals(fruits, basket.fruits);
  }

  @Override
  public int hashCode() {
    return Objects.hash(fruits);
  }
}
