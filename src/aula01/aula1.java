package aula01;

import aula01.model.gato;

public class aula1 {

	public static void main(String[] args) {
		
		gato gato = new gato(null, null, null);
		Livros Livros = new Livros();
		
		System.out.println(gato);
		System.out.println(Livros);
	
		
		int a= 2;
		int b= 5;
		System.out.println("Hello World!" + (a+b));

	}

}

class Livros {
	private String nome;
	private String npag;
	
}
