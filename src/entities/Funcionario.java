package entities;

public class Funcionario {
	
	public String name;
	public double salarioBruto;
	public double imposto; 
	
	public double salarioLiquido() {
		return (salarioBruto - imposto);
	}
	
	public void percentualAumentoSalario(double percentual) {
		this.salarioBruto =  salarioBruto +  (salarioBruto * percentual/100);
	}

	
	public String toString() {		

		return name + ",  $ " + String.format("%.2f", salarioLiquido());
	}

}
