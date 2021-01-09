/**
 * 
 */
package com.devpredator.gitwebinar.entity;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Table;

/**
 * @author DevPredator
 *
 */
@Entity
@Table(name = "modo")
public class Modo extends Common {

	@Column(name = "descripcion", length = 45, nullable = false)
	private String descripcion;

	/**
	 * @return the descripcion
	 */
	public String getDescripcion() {
		return descripcion;
	}

	/**
	 * @param descripcion the descripcion to set
	 */
	public void setDescripcion(String descripcion) {
		this.descripcion = descripcion;
	}
	
}
