package com.javonharper.tempo;

import java.util.TimerTask;

public class BpmCalculatorResetTimer extends TimerTask {
	
	public static long RESET_DURATION = 3000;
	
	BpmCalculator calculator;
	
	public BpmCalculatorResetTimer(BpmCalculator calculator) {
		this.calculator = calculator;
	}
	
	@Override
	public void run() {
		calculator.clearTimes();
	}
}
