package org.cibertec.edu.pe.modelo;

import javax.persistence.Entity;
import javax.persistence.GenerationType;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table( name = "producto")
public class Producto {
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private int id;
	private int codigo;
	private String descripcion;
	private double preciodecompra;
	private double preciodeventa;
	private double existencia;
	
	
	public Producto(int id, int codigo, String descripcion, double preciodecompra, double preciodeventa,
			double existencia) {
		super();
		this.id = id;
		this.codigo = codigo;
		this.descripcion = descripcion;
		this.preciodecompra = preciodecompra;
		this.preciodeventa = preciodeventa;
		this.existencia = existencia;
	}
	
	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}


	public int getCodigo() {
		return codigo;
	}

	public void setCodigo(int codigo) {
		this.codigo = codigo;
	}


	public String getDescripcion() {
		return descripcion;
	}




	public void setDescripcion(String descripcion) {
		this.descripcion = descripcion;
	}

	public double getPreciodecompra() {
		return preciodecompra;
	}

	public void setPreciodecompra(double preciodecompra) {
		this.preciodecompra = preciodecompra;
	}


	public double getPreciodeventa() {
		return preciodeventa;
	}


	public void setPreciodeventa(double preciodeventa) {
		this.preciodeventa = preciodeventa;
	}


	public double getExistencia() {
		return existencia;
	}

	public void setExistencia(double existencia) {
		this.existencia = existencia;
	}

	public Producto() {
	}
	
}