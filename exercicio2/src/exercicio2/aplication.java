package exercicio2;

public class aplication {
	
	public String nome;
	public double salarioBruto;
	public double imposto;
	
	public double netSasary()
	{
		return salarioBruto-imposto;
		//retornar o salario liquido
	}
	public double increaseSalary(double porcentagem)
	{
		salarioBruto += salarioBruto * porcentagem / 1000;
	}
	public String toString() {
		return nome + ", $ " + String.format("%.2f", netSasary());
		}

}
