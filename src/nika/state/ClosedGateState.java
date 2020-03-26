package nika.state;

public class ClosedGateState implements GateState {
	@Override
	public GateState enter(LightIndicator lightIndicator) {
		System.out.println("You can't enter");
		lightIndicator.red();
		return this;
	}

	@Override
	public GateState payOk(LightIndicator lightIndicator) {
		lightIndicator.green();
		return new OpenGateState();
	}

	@Override
	public GateState payFail(LightIndicator lightIndicator) {
		return this;
	}

	@Override
	public boolean canPay() {
		return true;
	}

}
