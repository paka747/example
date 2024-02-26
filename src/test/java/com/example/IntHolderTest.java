package com.example;

import org.junit.jupiter.api.Test;

import java.util.*;

import static org.assertj.core.api.Assertions.assertThat;
import static org.assertj.core.api.Assumptions.assumeThat;

class IntHolderTest {

    @Test
    void shouldBeInSet() {
        // given
        final var intHolder = new IntHolder(1);
        final var set = new HashSet<>();
        set.add(intHolder);
        assumeThat(set.contains(intHolder)).isTrue();

        // when
        intHolder.setValue(4);

        // then
        assertThat(set.contains(intHolder)).isTrue();
    }
}
