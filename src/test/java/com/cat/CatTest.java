package com.cat;

import org.junit.jupiter.api.Test;

import java.util.List;

import static org.assertj.core.api.Assertions.assertThat;

public class CatTest {

     CatCalculator calculator = new CatCalculator();
//    CatCalculatorKt calculator = new CatCalculatorKt();

    @Test
    public void shouldCalculateTotalFoodCost() {
        // given
        List<Cat> cats = List.of(
                new Cat("Filemon",
                        List.of(
                                new CatFood("Fish", 10.50),
                                new CatFood("Chicken", 12.34),
                                new CatFood("Beef", 1.23)
                        )
                ),
                new Cat("Bonifacy",
                        List.of(
                                new CatFood("Tuna", 42.22),
                                new CatFood("Salmon", 1.00)
                        )
                ),
                new Cat("Kicia Kocia",
                        List.of(
                                new CatFood("Whiskas", 42.22)
                        )
                )
        );

        // when
        double totalCost = calculator.calculateTotalFoodCost(cats);

        // then
        assertThat(totalCost).isEqualTo(2.23);
    }

}
