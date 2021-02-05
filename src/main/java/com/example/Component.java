package com.example;

import java.util.Date;
import java.util.Objects;

public class Component {
    public String s;
    public int i;
    public Date d;

    public Component(String s, int i, Date d) {
        this.s = s;
        this.i = i;
        this.d = d;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Component component = (Component) o;
        return i == component.i && Objects.equals(s, component.s) && Objects.equals(d, component.d);
    }

    @Override
    public int hashCode() {
        return Objects.hash(s, i, d);
    }
}
