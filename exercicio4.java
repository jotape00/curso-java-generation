package br.com.generation.atividade04;
import java.util.Scanner;
public class exercicio4 {

    public static void main(String[] args) {
        Scanner leia = new Scanner(System.in);

        double [][] matriz = new double[3][3];
        double soma=0, diagonal=0;
        int contador=1;

        System.out.println(" == Preencha os valores de uma matrix 3X3 == ");
        for(int l = 0; l < matriz.length; l++) {
            for(int c = 0; c < 3; c++) {
                System.out.print("Digite o " + contador + "º número da matriz: ");
                matriz[l][c] = leia.nextDouble();
                contador++;
                soma += matriz[l][c];
                if(l == c) {
                	diagonal += matriz[l][c];
                }
            }
        }
        System.out.println("A soma dos valores é: " + soma);
        System.out.println("A soma da diagonal principal é: " + diagonal);
    }
}
