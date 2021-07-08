package br.com.generation.aula05.atividade05;

public class Aviao {

	private String tipo;
	private String tipoCombustivel;
	private String classe;
	private int comportacao;
	private double velocidadeMaxima;
	private double velocidadeDecolagem;
	

	void decolagem(){
		System.out.println("O avião está prestes a decolar!!!");
	}

	public double getVelocidadeMaxima() {
		return velocidadeMaxima;
	}
	public void setVelocidadeMaxima(double velocidadeMaxima) {
		this.velocidadeMaxima = velocidadeMaxima;
	}
	public double getVelocidadeDecolagem() {
		return velocidadeDecolagem;
	}
	public void setVelocidadeDecolagem(double velocidadeDecolagem) {
		this.velocidadeDecolagem = velocidadeDecolagem;
	}
	public String getTipo() {
		return tipo;
	}
	public void setTipo(String tipo) {
		this.tipo = tipo;
	}
	public String getTipoCombustivel() {
		return tipoCombustivel;
	}
	public void setTipoCombustivel(String tipoCombustivel) {
		this.tipoCombustivel = tipoCombustivel;
	}
	public String getClasse() {
		return classe;
	}
	public void setClasse(String classe) {
		this.classe = classe;
	}
	public int getComportacao() {
		return comportacao;
	}
	public void setComportacao(int comportacao) {
		this.comportacao = comportacao;
	}
}
