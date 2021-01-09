/**
 * 
 */
package com.devpredator.gitrepositories.repository;

import org.springframework.data.repository.CrudRepository;

import com.devpredator.gitwebinar.entity.Juego;

/**
 * @author DevPredator
 * Clase que contiene el CRUD para transacciones a la tabla de juego.
 */
public interface JuegoRepository extends CrudRepository<Juego, Long>  {

}
