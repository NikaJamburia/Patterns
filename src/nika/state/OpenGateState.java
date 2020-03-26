package nika.state;

public class OpenGateState implements GateState {
	@Override
	public GateState enter(LightIndicator lightIndicator) {
		System.out.println("You enter");
		lightIndicator.red();
		return new ClosedGateState();
	}

	@Override
	public GateState payOk(LightIndicator lightIndicator) {
		return this;
	}

	@Override
	public GateState payFail(LightIndicator lightIndicator) {
		return this;
	}

	@Override
	public boolean canPay() {
		System.out.println("Cannot pay right now");
		return false;
	}

}
