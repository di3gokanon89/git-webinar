/**
 * 
 */
package com.devpredator.gitwebinar.controllers;

import java.util.List;

import javax.annotation.PostConstruct;
import javax.faces.bean.ManagedBean;
import javax.faces.bean.ViewScoped;

import com.devpredator.gitwebinar.entity.Juego;
import com.devpredator.gitwebinar.services.AdminJuegosService;

/**
 * @author DevPredator
 *
 */
@ManagedBean
@ViewScoped
public class AdminJuegosController {
	/**
	 * 
	 */
	private List<Juego> juegos;
	/**
	 * Servicio que permite utilizar los metodos de logica de negocio para la administracion de juegos.
	 */
	private AdminJuegosService adminJuegosServiceImpl;
	
	@PostConstruct
	public void init() {
		
	}
	
	public void consultarJuegos() {
		
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

	/**
	 * @return the adminJuegosServiceImpl
	 */
	public AdminJuegosService getAdminJuegosServiceImpl() {
		return adminJuegosServiceImpl;
	}

	/**
	 * @param adminJuegosServiceImpl the adminJuegosServiceImpl to set
	 */
	public void setAdminJuegosServiceImpl(AdminJuegosService adminJuegosServiceImpl) {
		this.adminJuegosServiceImpl = adminJuegosServiceImpl;
	}
}
