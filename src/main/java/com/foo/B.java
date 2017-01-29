package com.foo;

public class B {
    public A getA() {
        return new A("a");
    }

    public void doSomethingWithA() {
        getA().doSomething();
    }
}
