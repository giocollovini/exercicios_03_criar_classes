package entities;

public class Retangle { 
	
	public double altura;
	public double largura;
	public String local = "";

	public double area() {
		return altura * largura;
	}

	public double perimetro() {
		return (altura + largura) * 2;
	}

	public double diagonal() {
		return Math.sqrt(Math.pow(altura, 2.0) + Math.pow(largura, 2.0));
	}

	public String toString() {
	
	
	if (local == "area") {

			return local + " = " + String.format("%.2f", area());

		}

		else if (local == "perimetro") {

			return local + " = " + String.format("%.2f", perimetro());

		}

		else {

			return local + " = " + String.format("%.2f", diagonal());

		}	
		
	}
	
}
