package br.com.generation.aula05.atividade05;

public class Cliente {
	
	private String nome;
	private String endereco;
	private String numEndereco;
	private String sexo;
	private int idade;
	private double extrato;
	
	double debitar(double quantidade) {
		double extratoAcumulado = this.extrato + quantidade;
		this.extrato = extratoAcumulado;
		return this.extrato;
	}
	double retirar(double quantidade) {
		double extratoAcumulado = this.extrato - quantidade;
		this.extrato = extratoAcumulado;
		return this.extrato;
	}
	
	public double getExtrato() {
		return extrato;
	}
	void setExtrato(double extrato) {
		this.extrato = extrato;
	}
	public String getNome() {
		return nome;
	}
	public void setNome(String nome) {
		this.nome = nome;
	}
	public String getEndereco() {
		return endereco;
	}
	public void setEndereco(String endereco) {
		this.endereco = endereco;
	}
	public String getNumEndereco() {
		return numEndereco;
	}
	public void setNumEndereco(String numEndereco) {
		this.numEndereco = numEndereco;
	}
	public String getSexo() {
		return sexo;
	}
	public void setSexo(String sexo) {
		this.sexo = sexo;
	}
	public int getIdade() {
		return idade;
	}
	public void setIdade(int idade) {
		this.idade = idade;
	}
}
