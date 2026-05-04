package com.hexagonal.dominio;

public interface UsuarioRepository {
	
	void guardar(Usuario usuario);
	Usuario buscarPorNombre(String nombre); 

}
