/**
 * 
 */
package com.devpredator.gitwebinar.entity;

import java.util.ArrayList;
import java.util.List;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.ManyToMany;
import javax.persistence.Table;


/**
 * @author DevPredator
 *
 */
@Entity
@Table(name = "plataforma")
public class Plataforma extends Common {

	@Column(name = "nombre", length = 45, nullable = false)
	private String nombre;
	
	@ManyToMany(mappedBy = "plataformas")
	private List<Juego> juegos = new ArrayList<Juego>();

	/**
	 * @return the nombre
	 */
	public String getNombre() {
		return nombre;
	}

	/**
	 * @param nombre the nombre to set
	 */
	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	/**
	 * @return the juegos
	 */
	public List<Juego> getJuegos() {
		return juegos;
	}

	/**
	 * @param juegos the juegos to set
	 */
	public void setJuegos(List<Juego> juegos) {
		this.juegos = juegos;
	}	
}
