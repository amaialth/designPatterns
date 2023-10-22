package com.designpatterns.adbstractfactory;

public class VictorianChair implements Chair{
    @Override
    public void sitOn() {
        System.out.println("Sitting on Victorian Chair");
    }
}
