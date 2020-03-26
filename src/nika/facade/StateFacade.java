package nika.facade;

import nika.state.ClosedGateState;
import nika.state.Gate;
import nika.state.LightIndicator;
import nika.state.PaymentProccessor;

public class StateFacade implements Facade {
	@Override
	public void compose() {
		Gate gate = new Gate(new ClosedGateState(), new LightIndicator(), new PaymentProccessor());

		gate.enter();
		gate.pay();
		gate.enter();

		System.out.println();

		gate.enter();
		gate.pay();
		gate.pay();
		gate.enter();
	}
}
