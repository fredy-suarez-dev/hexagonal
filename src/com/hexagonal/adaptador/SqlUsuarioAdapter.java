package com.hexagonal.adaptador;

import java.util.ArrayList;
import java.util.List;

import com.hexagonal.dominio.Usuario;
import com.hexagonal.dominio.UsuarioRepository;

public class SqlUsuarioAdapter implements UsuarioRepository{
	
	private static final org.slf4j.Logger logger = org.slf4j.LoggerFactory.getLogger(SqlUsuarioAdapter.class);
	// Simulamos una base de datos en memoria
	private List<Usuario> baseDeDatosSimulada = new ArrayList<>();

	@Override
	public void guardar(Usuario usuario) {
				
		logger.info("Ejecutando: INSERT INTO usuarios...");
		// Aquí iría el código real de JPA o JDBC
		
		baseDeDatosSimulada.add(usuario);
		logger.info("Guardado en SQL: {}", usuario.getNombre());
	}

	@Override
	public Usuario buscarPorNombre(String nombre) {
		
		// Buscamos en nuestra "tabla"
		return baseDeDatosSimulada.stream()
				.filter(u -> u.getNombre().equals(nombre))
				.findFirst()
				.orElse(null);
	}

}
