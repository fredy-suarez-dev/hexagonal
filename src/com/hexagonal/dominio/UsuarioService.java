package com.hexagonal.dominio;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public class UsuarioService {
	
	private static final Logger logger = LoggerFactory.getLogger(UsuarioService.class);	
	private final UsuarioRepository repository;

	public UsuarioService(UsuarioRepository repository) {
		super();
		this.repository = repository;
	}
	
	public void crearUsuario(String nombre) {
		
		Usuario usuario = new Usuario(nombre);
		
		repository.guardar(usuario);
	}
	
	public void mostrarUsuario(String nombre) {
		
		Usuario usuario = repository.buscarPorNombre(nombre);
		
		if(usuario == null) {
			logger.info("Búsqueda finalizada: Usuario no encontrado.");
			return; 
		}
		
		logger.info("Usuario encontrado: {}", usuario.getNombre());
	}	
}
