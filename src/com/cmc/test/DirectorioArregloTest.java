package com.cmc.test;

import com.cmc.colecciones.DirectorioArreglo;
import com.cmc.colecciones.DirectorioLista;
import com.cmc.entidades.Contacto;
import com.cmc.entidades.Telefono;

public class DirectorioArregloTest {

	public static void main(String[] args) {
		
		Telefono telefono = new Telefono("tigo", "947593");
		Telefono telefono2 = new Telefono("exito", "3048539");
		Contacto contacto = new Contacto("982738","Luis","Alfonso");
		Contacto contacto2 = new Contacto("87654", "Estrella", "Sol");
		DirectorioArreglo dir = new DirectorioArreglo();
		
		
		contacto.agregarTelefono(telefono);
		contacto2.agregarTelefono(telefono2);
		
		
		dir.agregarContacto(contacto2);
		dir.agregarContacto(contacto);
		System.out.println(dir);
		System.out.println("****************");
		Contacto res = dir.buscarContacto("87654");
		System.out.println("Usuario encontrado:"+res);
		System.out.println("****************");
		Contacto res2 = dir.eliminarContacto("87654");
		System.out.println("usuario eliminado:"+res2);
		System.out.println("****************");
		dir.imprimir();
	}

}
