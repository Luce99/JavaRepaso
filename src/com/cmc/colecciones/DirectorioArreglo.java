package com.cmc.colecciones;

import java.util.Arrays;

import com.cmc.entidades.Contacto;

public class DirectorioArreglo {

	private Contacto[] contactos;
	private int elementosAgregados;
	private boolean agregar;
	
	
	public DirectorioArreglo(){
		contactos= new Contacto[10];
		agregar = true;
	}
	
	@Override
	public String toString() {
		return "DirectorioArreglo [contactos=" + Arrays.toString(contactos) + ", elementosAgregados="
				+ elementosAgregados + "]";
	}



	public void agregarContacto(Contacto contacto){
		if (contactos[0]!=null){
			int contador = 0;
			for (Contacto c:contactos){
				contador +=1;
				if (contactos[contador-1]!=null){
				if (c.getCedula().equals(contacto.getCedula())){
					agregar=false;
					System.out.println("Tiene un contacto con el mismo número de cédula en su directorio");
				}}
			}
			if(elementosAgregados<contactos.length&& agregar==true){
				contactos[elementosAgregados]=contacto;
				elementosAgregados+=1;
				}
		}else if(elementosAgregados<contactos.length){
				contactos[elementosAgregados]=contacto;
				elementosAgregados+=1;
				}
		
	}
	
	public Contacto buscarContacto(String cedula){
		for (Contacto c: contactos){
			if (c.getCedula().equals(cedula)){
				return c;
			}
		}
		return null;
	}
	
	public Contacto eliminarContacto(String cedula){
		Contacto res = buscarContacto(cedula);
		if (res!= null){
			int contador = 0;
			for (Contacto c: contactos){
				contador+=1;
				if(res==c){
					int casillaEliminar=contador-1;
					for (int i =casillaEliminar; i<9;i++){
						contactos[i] = contactos[i+1];
					}
				}
			}
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
