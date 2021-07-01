package br.com.generation.atividade01;
import java.util.Scanner;
public class exercicio3 {
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		int segundos, minutos, horas, horasresto;
		
		System.out.println("Insira o tempo total, em segundos, do evento: ");
		segundos = scan.nextInt();
		
		horas = segundos / 3600;
		System.out.print("O evento durou "+ horas +" hora(s)");
		
		horasresto = segundos%3600;
		minutos = horasresto / 60;
		System.out.print(", "+ minutos +" minutos");
		
		segundos = horasresto%60;
		System.out.print(" e "+ segundos + " segundos.");
	}
}
