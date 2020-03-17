package nika.command.receivers.car;

import nika.command.receivers.RcToy;

public class MuscleCar extends RcToy implements Car {
    public MuscleCar(Integer serial, String color) {
        this.serialNumber = serial;
        this.color = color;
    }

    @Override
    public void brake() {
        System.out.println(color + " muscle car brakes for 2 sec.");

    }

    @Override
    public void turnLeft() {
        System.out.println(color + " muscle car turn's its wheels left for 2 sec.");

    }

    @Override
    public void turnRight() {
        System.out.println(color + " muscle car turn's its wheels right for 2 sec.");
    }

    @Override
    public void special() {
        System.out.println(color + " muscle car sends many torques to rear wheels and wheelie's");
    }

    @Override
    public void accelerate() {
        System.out.println(color + " muscle car accelerates for 2 sec.");
    }



}
