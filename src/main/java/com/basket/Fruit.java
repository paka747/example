package com.basket;

import java.util.Objects;

class Fruit {

  private final String name;

  private final int amount;

  Fruit(final String name, final int amount) {
    this.name = name;
    this.amount = amount;
  }

  public String getName() {
    return name;
  }

  public int getAmount() {
    return amount;
  }

  @Override
  public boolean equals(final Object o) {
    if (this == o) return true;
    if (o == null || getClass() != o.getClass()) return false;
    final Fruit fruit = (Fruit) o;
    return amount == fruit.amount && Objects.equals(name, fruit.name);
  }

  @Override
  public int hashCode() {
    return Objects.hash(name, amount);
  }
}
