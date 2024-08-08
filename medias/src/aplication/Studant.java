package aplication;

public class Studant {
	public String nome;
	public double nota1;
	public double nota2;
	public double nota3;
	
	public double notaFinal()
	{
		return nota1 + nota2 + nota3;
	}
	public double faltantes()
	{
		if(notaFinal()<60.0)
		{
			return 60.0-notaFinal();
		}
		else
		{
			return 0;
		}
	}

}
