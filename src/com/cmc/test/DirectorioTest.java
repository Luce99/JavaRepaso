package com.cmc.test;

import com.cmc.colecciones.DirectorioLista;
import com.cmc.entidades.Contacto;
import com.cmc.entidades.Telefono;

public class DirectorioTest {

	public static void main(String[] args) {
	
		Telefono telefono = new Telefono("movi", "283492");
		Telefono telefono2 = new Telefono("claro", "3093295");
		Contacto contacto = new Contacto("463464","Alex","Cruz");
		Contacto contacto2 = new Contacto("845873", "David", "Rojas");
		DirectorioLista dir = new DirectorioLista();
		
		
		contacto.agregarTelefono(telefono);
		contacto2.agregarTelefono(telefono2);
		
		
		dir.agregarContacto(contacto2);
		dir.agregarContacto(contacto);
		System.out.println(dir);
		System.out.println("****************");
		Contacto res = dir.buscarContacto("845873");
		System.out.println("Usuario encontrado:"+res);
		System.out.println("****************");
		Contacto res2 = dir.eliminarContacto("845873");
		System.out.println("usuario eliminado:"+res2);
		System.out.println("****************");
		dir.imprimir();
	}

}
