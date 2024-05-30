package com.volcengine.ark.runtime.utils;

public class Pair<X, Y> {
    private X name;
    private Y value;

    public Pair(X name, Y value) {
        this.setName(name);
        this.setValue(value);
    }

    private void setName(X name) {
        this.name = name;
    }

    private void setValue(Y value) {
        this.value = value;
    }

    public X getName() {
        return this.name;
    }

    public Y getValue() {
        return this.value;
    }

}
