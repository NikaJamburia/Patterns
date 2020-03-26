package nika.state;

public interface GateState {
	GateState enter(LightIndicator lightIndicator);
	GateState payOk(LightIndicator lightIndicator);
	GateState payFail(LightIndicator lightIndicator);
	boolean canPay();
}
