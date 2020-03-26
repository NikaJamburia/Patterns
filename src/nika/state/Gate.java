package nika.state;

public class Gate {
	private GateState state;
	private LightIndicator lightIndicator;
	private PaymentProccessor paymentProccessor;

	public Gate(GateState state, LightIndicator lightIndicator, PaymentProccessor paymentProccessor) {
		this.state = state;
		this.lightIndicator = lightIndicator;
		this.paymentProccessor = paymentProccessor;
	}

	public void enter() {
		this.state = this.state.enter(lightIndicator);
	}

	public void pay() {
		if (paymentProccessor.process(state)) {
			System.out.println("Payment successful");
			this.state = this.state.payOk(lightIndicator);
		}
		else {
			System.out.println("Payment failed");
			this.state = this.state.payFail(lightIndicator);
		}
	}
}
