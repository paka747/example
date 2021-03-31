package com.example;

import org.junit.jupiter.api.Test;

import java.util.Date;
import java.util.HashMap;
import java.util.Map;

import static org.assertj.core.api.Assertions.assertThat;
import static org.assertj.core.api.Assumptions.assumeThat;

class ComponentTest {

    @Test
    void shouldComponentBeAKeyInMap() {
        // given
        final String value = "value";
        final Component component = new Component("s", 1, new Date());
        final Map<Component, String> map = new HashMap<> ();

        map.put(component, value);
        assumeThat(map).containsEntry(component, value);

        component.i = 4;

        // when
        final String actual = map.get(component);

        // then
        assertThat(actual).isEqualTo(value);
    }
}
