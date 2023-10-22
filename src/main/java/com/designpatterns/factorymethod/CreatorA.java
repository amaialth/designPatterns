package com.designpatterns.factorymethod;

public class CreatorA implements Creator{
    @Override
    public Product factoryMethod() {
        return new ProductA();
    }
}
