package nika.state;

import java.util.Random;

public class PaymentProccessor {
	public boolean process(GateState gateState) {
		if (gateState.canPay()) {
			//Some payment operation
			Random random = new Random();
			return random.nextInt(10) <= 8;
		}
		return false;
	}

}
