package nika.command.receivers.helicopter;

import nika.command.receivers.RcToy;

public class Helicopter extends RcToy {
    private HelicopterFlyingState flyingState;
    public Helicopter(Integer serial, String color) {
        this.serialNumber = serial;
        this.color = color;
        flyingState = new HelicopterIsDown();
    }

    public void moveForward() {
        System.out.println(color + " helicopter tilts forward for 2 sec.");
    }

    public void moveBack() {
        System.out.println(color + " helicopter tilts backwards up for 2 sec.");
    }

    public void moveLeft() {
        System.out.println(color + " helicopter tilts left for 2 sec.");
    }

    public void moveRight() {
        System.out.println(color + " helicopter tilts right for 2 sec.");
    }

    public void special() {
        flyingState = flyingState.getUpOrDown();
    }
}
