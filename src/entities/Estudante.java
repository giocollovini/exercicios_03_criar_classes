package entities;

public class Estudante {
	
	public String name;
	public double primeiraNota;
	public double segundaNota; 
	public double terceiraNota; 
	
	public double notaFinal() {
		return (primeiraNota + segundaNota + terceiraNota);
	}
	
	public String parecerFinal() {
		if (notaFinal() >= 60.0) {
			return ("Aprovado");
		}
		else {
			return ("Reprovado");
		}		
	}
	
	public double verificaNota() {
		if (notaFinal() < 60.0) {
			return (60.0 - notaFinal());
		}
		else {
			return (0.0);
		}	
	}
		
	public String toString() {		
		String result;
		
		result = "= " + String.format("%.2f%n", notaFinal()) 
        + parecerFinal(); 
		if (verificaNota() != 0.0) {
			result += "\nFaltou " + String.format("%.2f", verificaNota()) + " Pontos";
		} 
		
		return result;		
		
	}

}
