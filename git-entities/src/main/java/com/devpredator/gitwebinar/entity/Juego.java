/**
 * 
 */
package com.devpredator.gitwebinar.entity;

import java.util.ArrayList;
import java.util.List;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.JoinColumn;
import javax.persistence.JoinTable;
import javax.persistence.ManyToMany;
import javax.persistence.ManyToOne;
import javax.persistence.Table;

/**
 * @author DevPredator
 * 	
 */
@Entity
@Table(name = "juego")
public class Juego extends Common {

	@Column(name = "nombre", length = 100, nullable = false)
	private String nombre;
	
	@ManyToOne(fetch = FetchType.LAZY)
	@JoinColumn(name = "id_tipo_juego", nullable = false)
	private TipoJuego tipoJuego;
	
	@ManyToOne(fetch = FetchType.LAZY)
	@JoinColumn(name = "id_modo", nullable = false)
	private Modo modo;
	
	@Column(name = "precio", nullable = false)
	private double precio;
	
	@ManyToMany(cascade = {CascadeType.MERGE}, fetch = FetchType.LAZY)
	@JoinTable(
			name = "plataforma_juego", 
			joinColumns = @JoinColumn(name = "juego_id"), 
			inverseJoinColumns = @JoinColumn(name = "plataforma_id"))
	private List<Plataforma> plataformas = new ArrayList<Plataforma>();

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
	 * @return the tipoJuego
	 */
	public TipoJuego getTipoJuego() {
		return tipoJuego;
	}

	/**
	 * @param tipoJuego the tipoJuego to set
	 */
	public void setTipoJuego(TipoJuego tipoJuego) {
		this.tipoJuego = tipoJuego;
	}

	/**
	 * @return the modo
	 */
	public Modo getModo() {
		return modo;
	}

	/**
	 * @param modo the modo to set
	 */
	public void setModo(Modo modo) {
		this.modo = modo;
	}

	/**
	 * @return the precio
	 */
	public double getPrecio() {
		return precio;
	}

	/**
	 * @param precio the precio to set
	 */
	public void setPrecio(double precio) {
		this.precio = precio;
	}

	/**
	 * @return the plataformas
	 */
	public List<Plataforma> getPlataformas() {
		return plataformas;
	}

	/**
	 * @param plataformas the plataformas to set
	 */
	public void setPlataformas(List<Plataforma> plataformas) {
		this.plataformas = plataformas;
	}
}
