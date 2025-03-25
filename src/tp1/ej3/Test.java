package tp1.ej3;

public class Test {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Estudiante[] estudiantes = new Estudiante[2];
		Profesor[] profesores = new Profesor[3];
		
		estudiantes[0] = new Estudiante("Juan","Escudero","F","juanescudero@gmail.com","10 y 50");
		estudiantes[1] = new Estudiante("Facundo","Taddei","J","abc@gmail.com","11 y 60");
		
		profesores[0] = new Profesor("Geraldine","Ricart","gericart777@gmail.com","Biologia general","Ciencias Exactas");
		profesores[1] = new Profesor("Julian","Dipierro","jdp@gmail.com","Microbiologia general","Ciencias Exactas");
		profesores[2] = new Profesor("Olivia","Chialva","ochii17bio@yahoo.com.ar","Quimica Inorganica","Ciencias Exactas");
		
		for(int i = 0; i<2; i++) {
			System.out.println(estudiantes[i].tusDatos());
		}
		
		for(int i = 0; i<3; i++) {
			System.out.println(profesores[i].tusDatos());
		}
	}

}
