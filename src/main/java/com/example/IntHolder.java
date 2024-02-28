package com.example;

import java.util.Objects;

public class IntHolder {
    public IntHolder(int value) {
        this.setValue(value);
    }

    private int value;

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        IntHolder that = (IntHolder) o;
        return getValue() == that.getValue();
    }

    @Override
    public int hashCode() {
        return Objects.hash(getValue());
    }

    public int getValue() {
        return value;
    }

    public void setValue(int value) {
        this.value = value;
    }
}
