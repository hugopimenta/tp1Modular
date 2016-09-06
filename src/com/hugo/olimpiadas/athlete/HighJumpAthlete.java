package com.hugo.olimpiadas.athlete;

/**
 * Atleta de salto em altura.
 * @author Hugo Pimenta
 */
public class HighJumpAthlete extends Athlete{

	@Override
	public double getFinalResult() {
		double max = Athlete.MINVALUE;
		for(double result: this.getResults()) {
			if(result > max) {
				max = result;
			}
		}
		return max;
	}
	
	@Override
	public int compareTo(Athlete o) {
		return this.getFinalResult() > o.getFinalResult() ? 1 : -1;
	}
}
