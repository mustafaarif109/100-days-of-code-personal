package com.company;

public class PhoneBuilder {
    private String os;
    private int processor;
    private double screenSize;
    private int ram;

    public PhoneBuilder setOs(String os) {
        this.os = os;
        return this;
    }

    public PhoneBuilder setProcessor(int processor) {
        this.processor = processor;
        return this;
    }

    public PhoneBuilder setScreenSize(double screenSize) {
        this.screenSize = screenSize;
        return this;
    }

    public PhoneBuilder setRam(int ram) {
        this.ram = ram;
        return this;
    }
    public Phone getPhone(){
        return new Phone(os,processor,screenSize,ram);
    }

}
