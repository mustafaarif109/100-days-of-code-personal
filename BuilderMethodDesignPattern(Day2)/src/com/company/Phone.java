package com.company;

public class Phone {
    private String os;
    private int processor;
    private double screenSize;
    private int ram;

    public Phone(String os, int processor, double screenSize, int ram) {
        this.os = os;
        this.processor = processor;
        this.screenSize = screenSize;
        this.ram = ram;
    }
    @Override
    public String toString() {
        return "Phone{" +
                "os='" + os + '\'' +
                ", processor=" + processor +
                ", screenSize=" + screenSize +
                ", ram=" + ram +
                '}';
    }
}
