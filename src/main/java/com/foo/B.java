package com.foo;

public class B {

    private A a;

    public B() {
        this.a = new A("a");
    }

    public A getA() {
        return a;
    }

    public void doSomethingWithA() {
        a.doSomething();
    }
}
