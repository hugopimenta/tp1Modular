package com.hugo.olimpiadas.country;

/**
 * País participante.
 * @author Hugo Pimenta
 */
public class Country {
	/** Identificador. */
	private int id;
	/** Nome. */
	private String name;
	
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
	 * @return Nome
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
}
