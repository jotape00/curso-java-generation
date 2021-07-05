package br.com.generation.atividade02;

public class exercicio1 {
	public static void main(String[] args){
		
		System.out.println("Os números de 1000 a 1999 que divididos por 11, temos resto 5 são: ");
		for(int numeros = 1000; numeros < 2000; numeros++) {
			if(numeros%11 == 5)
			System.out.println(numeros);
		}
	}
}
