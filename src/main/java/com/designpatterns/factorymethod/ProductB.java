package com.designpatterns.factorymethod;

public class ProductB implements Product{

    @Override
    public void createProduct() {
        System.out.println("Creating Product B");
    }
}
