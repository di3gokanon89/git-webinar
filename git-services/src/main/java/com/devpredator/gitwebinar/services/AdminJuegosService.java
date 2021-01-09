/**
 * 
 */
package com.devpredator.gitwebinar.services;

import java.util.List;

import com.devpredator.gitwebinar.entity.Juego;

/**
 * @author DevPredator
 * Interface que contiene la logica de negocio para la administracion de juegos
 */
public interface AdminJuegosService {
	/**
	 * Permite consultar un listado de juegos de la base de datos.
	 * @return {@link List} lista de juegos consultados.
	 */
	List<Juego> consultarJuegos();
}
