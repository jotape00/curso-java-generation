package br.com.generation.atividade01;
import java.util.Scanner;
public class exercicio2 {
	public static void main(String[] args) {
		int idade, anos, anosresto, meses, mesesresto;
		Scanner scan = new Scanner(System.in);
		
		System.out.println("Insira sua idade em dias totais: ");
		idade = scan.nextInt();
		
		anos = idade/365;
		System.out.print("Você tem "+ anos + " anos");
		
		anosresto = idade%365;
		meses = anosresto/ 28;
		System.out.print(", "+ meses + " meses");
		
		mesesresto = anosresto%28;
		System.out.print(" e "+ mesesresto +" dias");
	}
}
