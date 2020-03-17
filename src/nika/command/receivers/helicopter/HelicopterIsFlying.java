package nika.command.receivers.helicopter;

public class HelicopterIsFlying implements HelicopterFlyingState {
    @Override
    public HelicopterFlyingState getUpOrDown() {
        System.out.println("Helicopter slowly gets down");
        return new HelicopterIsDown();
    }
}
