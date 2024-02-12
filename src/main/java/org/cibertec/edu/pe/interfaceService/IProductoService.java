package org.cibertec.edu.pe.interfaceService;

import java.util.Optional;

import org.cibertec.edu.pe.modelo.Producto;

import java.util.List;

public interface IProductoService {
	// Metodos del CRUD para la entidad Producto
	public List<Producto> Listado();
	public Optional<Producto> Buscar(int id);
	public void Insertar(Producto p);
	public void Editar(Producto p);
	public void Suprimir(int id);
}