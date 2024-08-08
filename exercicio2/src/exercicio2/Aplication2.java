package exercicio2;

public class Aplication2 {

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
		return salarioBruto += salarioBruto * porcentagem / 100.0;
	}
	public String toString() {
		return nome + ", $ " + String.format("%.2f", netSasary());
		}

}


