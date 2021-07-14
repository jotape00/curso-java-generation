package br.com.generation.atividade08;

import java.util.*;

//

public class TestaLoja {
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		
		Loja produto1 = new Loja("Celular", 8000);
		Loja produto2 = new Loja("Xícara", 15);
		Loja produto3 = new Loja("Bala Halls", 2.99);
		Loja produto4 = new Loja("Tapete", 50);
		Loja produto5 = new Loja("Cortador de unha", 4);
		Loja produto6 = new Loja("Pulseira de ouro", 10000);
		Loja produto7 = new Loja("Ventilador", 20);
		Loja produto8 = new Loja("Óculos Ray-Ban", 999.99);
		Loja produto9 = new Loja("Fusca", 4999.99);
		Loja produto10 = new Loja("Teclado mecânico", 500);
		
		ArrayList<Loja> produtos = new ArrayList<>();
		char resposta = 'S'; 
		
		produtos.add(produto1);
		produtos.add(produto2);
		produtos.add(produto3);
		produtos.add(produto4);
		produtos.add(produto5);
		produtos.add(produto6);
		produtos.add(produto7);
		produtos.add(produto8);
		produtos.add(produto9);
		produtos.add(produto10);
		
		do {
			System.out.println("_________________Produtos da loja_________________\n");
			for(int i = 0; i < produtos.size(); i++) {
				System.out.println((i+1) + "º "+ produtos.get(i));
			}
			System.out.println("__________________________________________________");
			
			System.out.println("Deseja remover um item? (S/N)");
			resposta = scan.next().charAt(0);
			
			if(resposta == 'S' || resposta == 's') {		
				System.out.println("Selecione um índice da lista que deseja remover: ");
				int x = scan.nextInt();			
				produtos.remove(x-1);
				System.out.println("\n");
			}
			else {
				System.out.println("Verificação finalizada!");
			}
		}while(resposta != 'N' || resposta != 'n');
	}
}
