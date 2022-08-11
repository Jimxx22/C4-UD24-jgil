package com.c4.ud24.dto;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name="empleado")
public class Empleado {
	enum Empleo{
		Programador, Administrativo, Disenador, Directivo
	}
	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Long id;
	
	@Column(name="nombre")
	private String nombre;
	
	@Column(name="empleo")
	private String empleo;
	
	@Column(name="salario")
	private double salario;

	public Empleado() {
	}

	public Empleado(String nombre, String empleo) {
		this.nombre = nombre;
		generarEmpleoSalario(empleo);
	}

	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	public String getEmpleo() {
		return empleo;
	}

	public void setEmpleo(String empleo) {
		this.empleo = empleo;
	}

	public double getSalario() {
		return salario;
	}

	public void setSalario(double salario) {
		this.salario = salario;
	}

	@Override
	public String toString() {
		return "Empleado [id=" + id + ", nombre=" + nombre + ", trabajo=" + empleo + ", salario=" + salario + "]";
	}
	
	public void generarEmpleoSalario(String empleo) {
		boolean boo = false;
		System.out.println(empleo);
		for (Empleo e : Empleo.values()) {
			if(empleo.equals(e.name())) {
				switch (e) {
				case Programador:
					boo=true;
					System.out.println("aa");
					setEmpleo(empleo);
					setSalario(28000);
					break;
				case Administrativo:
					boo=true;
					setEmpleo(empleo);
					setSalario(20000);
					break;
				case Disenador:
					boo=true;
					setEmpleo(empleo);
					setSalario(24000);
					break;
				case Directivo:
					boo=true;
					setEmpleo(empleo);
					setSalario(32000);
					break;
				default:
					
					break;
				}
			}else if(!boo){
				this.empleo="Na";
				this.salario=0;
			}
		}		
	}
	
	

}
