package entidade;

public class classeTriangulo {
	
	public double base;
	public double altura;
	
	
	public double area() {
		return (base*altura)/2;
	}
	public double perimetro() {
		
		return (2*base) + (2*altura);
	}
	public double diagonal() {
		return Math.sqrt(altura * altura + base * base);
	}

}




