package com.cmc.test;

import com.cmc.entidades.Contacto;
import com.cmc.entidades.Telefono;

public class TelefonoTest {
	
	public static void main(String[] args) {

	Telefono telefono = new Telefono("movi", "283492");
	Telefono telefono2 = new Telefono("claro", "3093295");
	Contacto contacto = new Contacto("463464","Alex","Cruz");
	Contacto contacto2 = new Contacto("845873", "David", "Rojas");
	
	
	contacto.agregarTelefono(telefono);
	contacto.agregarTelefono(telefono2);
	
	System.out.println(contacto);
	System.out.println(contacto2);
	}
}
