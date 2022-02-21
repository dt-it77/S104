package org.itacademy.javatesting.nivell1_ex2;

public class CalculoDni {
    //https://medium.com/@manuelmato/cómo-validar-un-dni-en-java-6d7ce7d764aa
    public String lletraDNI(String numero){
        int miDNI = Integer.parseInt(numero.substring(0,8));
		int resto = 0;
		String miLetra = "";
		String[] asignacionLetra = {"T", "R", "W", "A", "G", "M", "Y", "F", "P", "D", "X", "B", "N", "J", "Z", "S", "Q", "V", "H", "L", "C", "K", "E"};

		resto = miDNI % 23;

		miLetra = asignacionLetra[resto];

		return miLetra;
    }
}
