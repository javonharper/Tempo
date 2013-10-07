package com.javonharper.tempo;

import java.util.ArrayList;

public class BpmCalculator {
	private static final Long MILLISECONDS_IN_A_MINUTE = Long.valueOf(60000);
	public ArrayList<Long> times;

	public BpmCalculator() {
		times = new ArrayList<Long>();
	}

	public void recordTime() {
		long time = System.currentTimeMillis();
		times.add(Long.valueOf(time));
	}

	public int getBpm() {
		ArrayList<Long> deltas = getDeltas();
		return calculateBpm(deltas);
	}

	public void clearTimes() {
		times.clear();
	}

	private ArrayList<Long> getDeltas() {
		ArrayList<Long> deltas = new ArrayList<Long>();

		for (int i = 0; i < times.size() - 1; i++) {
			Long delta = times.get(i + 1) - times.get(i);
			deltas.add(delta);
		}

		return deltas;
	}

	private int calculateBpm(ArrayList<Long> deltas) {
		Long sum = Long.valueOf(0);

		for (Long delta : deltas) {
			sum = sum + delta;
		}

		Long average = sum / deltas.size();

		return (int) (MILLISECONDS_IN_A_MINUTE / average);
	}
}
