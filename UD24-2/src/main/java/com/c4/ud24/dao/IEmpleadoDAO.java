package com.c4.ud24.dao;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;

import com.c4.ud24.dto.Empleado;


public interface IEmpleadoDAO extends JpaRepository<Empleado, Long>{
	//Listar clientes por empleo
	public List<Empleado> findByEmpleo(String empleo);
}
