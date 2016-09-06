package com.modular.olimpiadas.sports;

import java.util.Collections;
import java.util.List;

import com.modular.olimpiadas.athlete.Athlete;

/**
 * Esporte.
 * @author Hugo Pimenta
 */
public class Sport {

	/** Identificador. */
	private int id;
	/** Nome. */
	private String name;

	/**
	 * Gera lista de coloca��o do esporte.
	 * 
	 * @param atletas
	 *            Atletas da competi��o
	 * @return Lista de coloca��o
	 */
	public List<Athlete> getStandings(List<Athlete> atletas) {
		Collections.sort(atletas);
		Collections.reverse(atletas);
		return atletas;
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

}
