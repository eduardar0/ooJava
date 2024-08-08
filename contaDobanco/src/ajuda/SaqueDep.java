package ajuda;

public class SaqueDep {
	
	private int numConta;
	private double valor;
	private String nome;
	
	public int getNumConta() {
		return numConta;
	}



	public void setNumConta(int numConta) {
		this.numConta = numConta;
	}



	public double getValor() {
		return valor;
	}



	public void setValor(double valor) {
		this.valor = valor;
	}



	public String getNome() {
		return nome;
	}



	public void setNome(String nome) {
		this.nome = nome;
	}



	public SaqueDep(int numConta, double valor, String nome) {
		this.numConta = numConta;
		this.valor = valor;
		this.nome = nome;
	}
	
	public double deposito(double dinheiro)
	{
		return valor + dinheiro;
	}
	public double saque(double money)
	{
		return valor -(money + 5);
	}
	

}
