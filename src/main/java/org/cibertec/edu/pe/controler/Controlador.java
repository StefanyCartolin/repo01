package org.cibertec.edu.pe.controler;

import java.util.List;
import java.util.Optional;

import org.cibertec.edu.pe.interfaceService.IProductoService;
import org.cibertec.edu.pe.modelo.Producto;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.annotation.Validated;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@RequestMapping
public class Controlador {
	
	@Autowired
	private IProductoService servicio;
	
	// Accion Listar
	@GetMapping("/listar")
	public String Listar(Model modelo) {
		List<Producto> producto = servicio.Listado();
		modelo.addAttribute("producto", producto);
		return "index";
	}
	
	// Accion Agregar
	@GetMapping("/new")
	public String Agregar(Model modelo) {
		modelo.addAttribute("producto", new Producto());
		return "form";
	}
	
	// Accion Guardar
	@PostMapping("save")
	public String save(@Validated Producto p, Model modelo) {
		servicio.Insertar(p);
		return "redirect:/listar";
	
	}
	
	// Accion Editar
	@GetMapping("editar/{id}")
	public String Editar(@PathVariable int id, Model modelo) {
		Optional<Producto> p = servicio.Buscar(id);
		modelo.addAttribute("producto", p);
		return "form";
	}
	
	// Accion Editar
	@GetMapping("/eliminar/{id}")
	public String Eliminar(@PathVariable int id, Model modelo) {
		servicio.Suprimir(id);
		return "redirect:/listar";
	}
}
