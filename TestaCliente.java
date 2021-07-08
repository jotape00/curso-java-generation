package br.com.generation.aula05.atividade05;

public class TestaCliente {
	public static void main(String[] args) {
		Cliente cliente1 = new Cliente();
		
		cliente1.setNome("Josefino Pereira");
		cliente1.setIdade(24);
		cliente1.setEndereco("Rua Exemplinho Exemplão");
		cliente1.setNumEndereco("1234");
		cliente1.setSexo("Feminino");
		cliente1.setExtrato(5000);	
		
		cliente1.debitar(200);
		
		System.out.println("Seu nome: " + cliente1.getNome());
		System.out.println("Sua idade: " + cliente1.getIdade());
		System.out.println("Seu sexo: " + cliente1.getSexo());
		System.out.println("Reside em: " + cliente1.getEndereco() + ", " + cliente1.getNumEndereco());
		System.out.println("\nSeu extrato após o debito/retiro ficou: " + cliente1.getExtrato());
	}
}
