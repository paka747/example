package com.basket;

import java.util.Collection;
import org.junit.jupiter.api.Test;

import static java.util.Collections.emptySet;
import static org.assertj.core.api.Assertions.assertThat;

class FruitTest {

  /**
   * Gather letters, which fulfill condition:
   * - both baskets are used
   * - first fruit name letter
   * - fruit amount in basket is odd
   * - are uppercase
   * - are unique
   * - are sorted
   */
  @Test
  void shouldFindLetters() {
    // given
    final Basket left = new Basket(
        new Fruit("apple", 3),
        new Fruit("pineapple", 1),
        new Fruit("mango", 2),
        new Fruit("pear", 9));

    final Basket right = new Basket(
        new Fruit("raspberry", 12),
        new Fruit("blueberry", 4),
        new Fruit("banana", 5),
        new Fruit("blackberry", 7),
        new Fruit("plum", 2));

    // when
    Collection<String> result = emptySet();

    // then
    assertThat(result).containsExactly("A", "B", "P");
  }
}