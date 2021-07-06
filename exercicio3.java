package br.com.generation.atividade04;
import java.util.Scanner;
import java.util.Arrays;
public class exercicio3 {
	public static void main(String[] args) {
		double n1[][] = new double[4][6], n2[][] = new double[4][6];
		double m1[][] = new double [4][6], m2[][] = new double[4][6];
		int l, c, contador = 1;
		
		Scanner leia = new Scanner(System.in);
		
		System.out.println(" === Escreva os pontos das matrizes N1(4,6) e N2(4,6), simultaneamente === ");
	    for(l = 0; l < 4; l++) {
	    	for(c = 0; c < 6; c++) {
	                System.out.print("Digite o " + contador + "º número da matriz N1: ");
	                n1[l][c] = leia.nextDouble();
	                System.out.print("Digite o " + contador + "º número da matriz N2: ");
	                n2[l][c] = leia.nextDouble();
	                contador++;
	                
	                m1[l][c] = n1[l][c] + n2[l][c];
	                m2[l][c] = n1[l][c] - n2[l][c];
	        }
	    }
	    
	    System.out.println("\nMatriz m1 (soma de N1 e N2): ");
	    for(l = 0; l < 4; l++) {
	    	for(c = 0; c < 6; c++) {
	    		System.out.print(m1[l][c] + " | ");
	        }
	    	System.out.println("\n");
	    }
	    
	    System.out.println("\nMatriz m2 (diferença de N1 e N2): ");
	    for(l = 0; l < 4; l++) {
	    	for(c = 0; c < 6; c++) {
	    		System.out.print(m2[l][c] + " | ");
	        }
	    	System.out.println("\n");
	    }
	}
}
