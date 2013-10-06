package com.javonharper.tempo;

import java.util.TimerTask;

public class BpmCalculatorResetTimer extends TimerTask {
	
	public static long RESET_DURATION = 30000;
	
	public BpmCalculatorResetTimer(BpmCalculator calculator) {
		calculator.clearTimes();
	}
	
	@Override
	public void run() {
		// TODO Auto-generated method stub

	}
}
