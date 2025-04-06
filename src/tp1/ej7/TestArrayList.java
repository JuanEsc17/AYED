package tp1.ej7;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;
import java.util.Scanner;

public class TestArrayList {

	public static void main(String[] args) {
		//Inciso A
		Scanner scan = new Scanner(System.in);
		ArrayList<Integer> array = new ArrayList<>();
		
		System.out.println("Ingrese -1 para terminar de agregar numeros");
		int n;
		while((n = scan.nextInt())!= -1){
			array.add(n);
		}
		
		System.out.println("Elementos insertados: ");
		for (int num : array) {
			System.out.println(num);
		}
		
		
		//Inciso D
		List<Estudiante> listaEst = new LinkedList<>(); 
		Estudiante e1 = new Estudiante("Juan", "Escudero", "juanchiemail", "Informatica");
		listaEst.add(e1);
		Estudiante e2 = new Estudiante("Facundo", "Taddei", "fachutaddeiyahoo","Cs. Exactas");
		listaEst.add(e2);
		Estudiante e3 = new Estudiante("Valentina", "Hansel", "valuhanselemail", "Psicologia");
		listaEst.add(e3);
		
		List<Estudiante> listaEst2 = listaEst;
		System.out.println("Lista original");
		for (Estudiante est : listaEst) {
			System.out.println(est.tusDatos());
		}
		
		System.out.println("-------------------------");
		
		System.out.println("Lista copia");
		for (Estudiante est : listaEst2) {
			System.out.println(est.tusDatos());
		}
		
		e1.setFacultad("Humanidades");
		e2.setEmail("me modifique");
		e3.setNombre("AAAAAAAAA");
		
		System.out.println("-------------------------");
		
		System.out.println("Lista original");
		for (Estudiante est : listaEst) {
			System.out.println(est.tusDatos());
		}
		
		System.out.println("-------------------------");
		
		System.out.println("Lista copia");
		for (Estudiante est : listaEst2) {
			System.out.println(est.tusDatos());
		}
		
		//Inciso 7E
		Estudiante e4 = new Estudiante("Matias", "Correa", "maticorreaemail","Bellas Artes");
		if (!listaEst.contains(e4)) {
			listaEst.add(e4);
			System.out.println("Se agrego bien");
		}
		else {
			System.out.println("No se agrego");
		}
		
		System.out.println("-------------------------");
		
	}

}
