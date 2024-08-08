package entidades;

public class Conta {
	private String nome;
	private int conta;
	private double depInicial;
	public Conta(String nome, int conta, double depInicial) {
		this.nome = nome;
		this.conta = conta;
		this.depInicial = depInicial;
	}
	public String getNome() {
		return nome;
	}
	public void setNome(String nome) {
		this.nome = nome;
	}
	public int getConta() {
		return conta;
	}
	public void setConta(int conta) {
		this.conta = conta;
	}
	public double getDepInicial() {
		return depInicial;
	}
	public void setDepInicial(double depInicial) {
		this.depInicial = depInicial;
	}
	
	public double deposito (int depo) {
		return depInicial + depo;
	}
	
	public double retirar(int valor) {
		return depInicial - valor;
	}
	
	
	

}
