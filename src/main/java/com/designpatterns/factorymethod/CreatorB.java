package com.designpatterns.factorymethod;

public class CreatorB implements Creator{
    @Override
    public Product factoryMethod() {
        return new ProductB();
    }
}
