package com.cmc.colecciones;

import java.util.ArrayList;

import com.cmc.entidades.Contacto;

public class DirectorioLista extends Directorio {

	private ArrayList<Contacto> contactos;
	private boolean agregar;
	
	
	public DirectorioLista(){
		contactos = new ArrayList<Contacto>();
		agregar = true;
	}
	
	
	@Override
	public String toString() {
		return "DirectorioLista [contactos=" + contactos + "]";
	}


	public void agregarContacto(Contacto contacto){
		if (contactos.size()!=0){
			for (Contacto c:contactos){
				if (c.getCedula().equals(contacto.getCedula())){
					System.out.println("Tiene un contacto con el mismo número de cédula en su directorio");
					agregar =false;
				}
			}
			if (agregar==true){
		    contactos.add(contacto);}
		}else 
			{contactos.add(contacto);}
		
	}
	
	public Contacto buscarContacto(String cedula){
		if (contactos.size()!=0){
		for (Contacto c: contactos){
			if (c.getCedula().equals(cedula)){
				return c;
			}
		}
	}
		return null;
	}
	
	public Contacto eliminarContacto(String cedula){
		Contacto res = buscarContacto(cedula);
		if (res!= null){
			contactos.remove(res);
			return res;
		}
		return null;
	}
	
	public void imprimir(){
		System.out.println("Los contactos de su directorio son: ");
		for (Contacto c: contactos){
			System.out.println(c);
		}
	}
	
	}
	

