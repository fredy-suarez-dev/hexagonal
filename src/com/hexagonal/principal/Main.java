package com.hexagonal.principal;

import com.hexagonal.adaptador.SqlUsuarioAdapter;
import com.hexagonal.dominio.UsuarioRepository;
import com.hexagonal.dominio.UsuarioService;

public class Main {

	public static void main(String[] args) {
		
		// Enchufamos el adaptador al puerto
		UsuarioRepository miPuerto = new SqlUsuarioAdapter();
		
		// la lógica de negocio recibe el contrato
		UsuarioService app = new UsuarioService(miPuerto);// Click, aquí conectas la pieza externa al interior
		
		app.crearUsuario("Ana");
		app.crearUsuario("Maria");
		app.crearUsuario("Juan");
		app.crearUsuario("Pedro");
		app.crearUsuario("Yudy");
		app.mostrarUsuario("Ana");
	}
}
