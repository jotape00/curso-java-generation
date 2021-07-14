package br.com.generation.atividade08;

public class Loja {
	private String nomeProduto;
	private double valor;
	
	public Loja(String nomeProduto, double valor) {
		super();
		this.nomeProduto = nomeProduto;
		this.valor = valor;
	}
	
	public String getNomeProduto() {
		return nomeProduto;
	}
	
	public void setNomeProduto(String nomeProduto) {
		this.nomeProduto = nomeProduto;
	}
	
	public double getValor() {
		return valor;
	}
	
	public void setValor(double valor) {
		this.valor = valor;
	}
	
	public String toString() {
		return "[Produto: " + this.nomeProduto + " | Valor: R$" + this.valor +"]";
	}
}
