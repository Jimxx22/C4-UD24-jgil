package com.c4.ud24.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.c4.ud24.dto.Empleado;
import com.c4.ud24.service.EmpleadoServiceImpl;

@RestController
@RequestMapping("/api")
public class EmpleadoController {

	@Autowired
	EmpleadoServiceImpl empleadoServiceImpl;
	
	@GetMapping("/empleados")
	public List<Empleado> listarEmpleados(){
		return empleadoServiceImpl.listarEmpleados();
	}
	
	@GetMapping ("/empleados/empleo/{empleo}")
	public List<Empleado> listarEmpleadosEmpleo(@PathVariable(name="empleo") String empleo){
		return empleadoServiceImpl.listarEmpleadosEmpleo(empleo);
	}
	
	@PostMapping("/empleados")
	public Empleado saveEmpleado(@RequestBody Empleado empleado) {
		Empleado empleado2 = new Empleado(empleado.getNombre(), empleado.getEmpleo());
		//System.out.println(empleado2.getEmpleo());
		return empleadoServiceImpl.guardarEmpleado(empleado2);
	}
	
	@GetMapping("/empleados/{id}")
	public Empleado empleadoXId(@PathVariable(name="id") Long id) {
		Empleado empleado = new Empleado();
		
		empleado=empleadoServiceImpl.empleadoXId(id);
		
		return empleado;
	}
	
	@PutMapping("/empleados/{id}")
	public Empleado actualizarEmpleado(@PathVariable(name="id") Long id, @RequestBody Empleado empleado) {
		
		Empleado empleadoSel = new Empleado();
		Empleado empleadoAct = new Empleado();
		
		empleadoSel=empleadoServiceImpl.empleadoXId(id);
		
		empleadoSel.setNombre(empleado.getNombre());
		empleadoSel.generarEmpleoSalario(empleado.getEmpleo());
		
		empleadoAct=empleadoServiceImpl.actualizarEmpealdo(empleadoSel);
		
		return empleadoAct;
	}
	
	
	@DeleteMapping("/empleados/{id}")
	public void eliminarEmpleado(@PathVariable(name="id") Long id) {
		empleadoServiceImpl.eliminarEmpleado(id);
	}
}
