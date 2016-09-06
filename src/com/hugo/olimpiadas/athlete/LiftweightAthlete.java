package com.hugo.olimpiadas.athlete;

public class LiftweightAthlete extends Athlete {

	@Override
	public double getFinalResult() {
		double sum = 0;
		for (double result : this.getResults()) {
			sum += result;
		}
		return sum;
	}

	@Override
	public int compareTo(Athlete o) {
		return this.getFinalResult() > o.getFinalResult() ? 1 : -1;
	}
}
