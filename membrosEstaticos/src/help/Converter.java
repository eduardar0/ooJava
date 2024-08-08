package help;

public class Converter {
	
	public static double ios= 6.0;
	
	public static double dolar(double valor, double cotacao)
	{
		
		return ((valor*cotacao) * ios)/100;
	}


}
