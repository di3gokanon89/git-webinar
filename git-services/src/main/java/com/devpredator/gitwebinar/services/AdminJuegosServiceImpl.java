/**
 * 
 */
package com.devpredator.gitwebinar.services;

import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.StreamSupport;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.devpredator.gitrepositories.repository.JuegoRepository;
import com.devpredator.gitwebinar.entity.Juego;

/**
 * @author DevPredator
 * Clase que implementa los metodos de lógica de negocio para la Administración de Juegos
 */
@Service
public class AdminJuegosServiceImpl implements AdminJuegosService {
	/**
	 * Objeto que contiene el CRUD para consultar juegos inyectado con SPRING.
	 */
//	@Autowired
	private JuegoRepository juegoRepository;
	
	@Override
	public List<Juego> consultarJuegos() {

		List<Juego> juegosConsultados = StreamSupport
				  .stream(this.juegoRepository.findAll().spliterator(), false)
				  .collect(Collectors.toList());
		
		return juegosConsultados;
	}

	
}
