package com.proyecto.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import com.proyecto.entidad.Proyecto;
import com.proyecto.entidad.Usuario;

@Repository
public interface ProyectoRepository extends JpaRepository<Proyecto, Long>{
	Proyecto findByNombreProyecto(String nombreProyecto) throws NullPointerException;
	boolean existsByUsuario(Usuario usuario);
		
}
