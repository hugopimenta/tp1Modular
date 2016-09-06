package com.modular.olimpiadas.athlete;

import java.util.List;

/**
 * Atleta.
 * @author Hugo Pimenta
 */
public abstract class Athlete implements Comparable<Athlete>{
	
	protected static final double MAXVALUE = 9999999.99;
	protected static final double MINVALUE = 0;
	private String name;
	private int id;
	private int countryId;
	private List<Double> results;
	private int idSport;

	/**
	 * @return Resultado final do atleta.
	 */
	public abstract double getFinalResult();
	protected List<Double> getResults() { 
		return this.results;
	}
	
	/**
	 * @return Identificador.
	 */
	public int getId() {
		return id;
	}
	
	/**
	 * @param id Identificador.
	 */
	public void setId(int id) {
		this.id = id;
	}
	/**
	 * @return Nome.
	 */
	public String getName() {
		return name;
	}
	/**
	 * @param name Nome.
	 */
	public void setName(String name) {
		this.name = name;
	}
	/**
	 * @return Identificador do País.
	 */
	public int getCountry() {
		return countryId;
	}
	/**
	 * @param countryId Identificador do País
	 */
	public void setCountry(int countryId) {
		this.countryId = countryId;
	}
	/**
	 * @param result Resultado parcial do atleta.
	 */
	public void addAllResults(List<Double> results) {
		this.results.addAll(results);
	}
	
	public void setSport(int idSport) {
		this.idSport = idSport;
	}
	
	public int getSport() {
		return this.idSport;
	}
	
	
	
}
