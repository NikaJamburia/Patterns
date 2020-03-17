package nika.command.receivers.helicopter;

public class HelicopterIsDown implements HelicopterFlyingState {
    @Override
    public HelicopterFlyingState getUpOrDown() {
        System.out.println("Helicopter flies up");
        return new  HelicopterIsFlying();
    }
}
