package com.company;

public class Lamp {
    private String style;
    private boolean battery;
    private int globeRaing;

    public Lamp(String style, boolean battery, int globeRaing) {
        this.style = style;
        this.battery = battery;
        this.globeRaing = globeRaing;
    }

    public void turnOn(){
        System.out.println("Lamp -> turning on");
    }
    public String getStyle() {
        return style;
    }

    public boolean isBattery() {
        return battery;
    }

    public int getGlobeRaing() {
        return globeRaing;
    }
}
