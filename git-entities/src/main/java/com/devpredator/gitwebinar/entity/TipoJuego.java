/**
 * 
 */
package com.devpredator.gitwebinar.entity;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Table;

/**
 * @author 4PF28LA_2004
 *
 */
@Entity
@Table(name = "tipo_juego")
public class TipoJuego extends Common {

	@Column(name = "nombre")
	private String nombre;

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
}
