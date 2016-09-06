package com.hugo.olimpiadas.athlete;


/**
 * Atleta de corrida.
 * @author Hugo Pimenta
 */
public class RacingAthlete extends Athlete {

	@Override
	public double getFinalResult() {
		double min = Athlete.MAXVALUE;
		for(double result: this.getResults()) {
			if(result < min) {
				min = result;
			}
		}
		return min;
	}
	
	@Override
	public int compareTo(Athlete o) {
		return this.getFinalResult() > o.getFinalResult() ? -1 : 1;
	}
	
}
