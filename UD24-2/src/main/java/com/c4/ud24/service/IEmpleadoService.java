package com.c4.ud24.service;

import java.util.List;

import com.c4.ud24.dto.Empleado;

public interface IEmpleadoService {

	//Metodos CRUD
	
	public List<Empleado> listarEmpleados(); //Listar ALL
	public Empleado guardarEmpleado(Empleado empleado); //Crear Empleado
	public Empleado empleadoXId(Long id); //Listar 1 Empleado
	public List<Empleado> listarEmpleadosEmpleo(String empleo); //Listar Empleados con empleos iguales
	public Empleado actualizarEmpealdo(Empleado empleado); //Actualizar Empleado
	public void eliminarEmpleado(Long id); //Eliminar Empleado
	
}
