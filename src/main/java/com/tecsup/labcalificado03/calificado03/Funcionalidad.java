package com.tecsup.labcalificado03.calificado03;

public class Funcionalidad {

	public class Saludo {

	    public static String saludar(String nombre) {
	        return "Hola, " + nombre + "!";
	    }

	    public static void main(String[] args) {
	        String nombre = "Mundo";
	        String saludo = saludar(nombre);
	        System.out.println(saludo);
	    }
	}
	
}
