package application;

import java.util.Locale;
import java.util.Scanner;

import entities.Estudante;
import entities.Funcionario;
import entities.Retangle;


public class Program {	
	
	public static void main(String[] args) {
		
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		
		System.out.println("=====================================================================");
		System.out.println("Programa para Ler Altura e Largura de um Retangulo e calcular �rea, Per�metro e Diagonal.");
		System.out.println();
		Retangle retangle = new Retangle();
		System.out.println("Entre com Largura e Altura do Ret�ngulo: ");
		System.out.print("Largura: ");
		retangle.largura = sc.nextDouble();
		System.out.print("Altura: ");
		retangle.altura = sc.nextDouble();
		System.out.println();		
		retangle.local = "area";		
		System.out.println(retangle);
		retangle.local = "perimetro";		
		System.out.println(retangle);
		retangle.local = "diagonal";		
		System.out.println(retangle);
	
		//--------------------------------------------------------------------------------------------
		
		System.out.println();
		System.out.println("=====================================================================");
		System.out.println("Programa para Ler Nome, Salario Bruto e Imposto e mostrar os dados.");
		System.out.println("Apos ler um % para aumento do Salario e mostrar novamente os dados.");
		System.out.println();
		sc.nextLine();
		Funcionario funcionario = new Funcionario();		
		System.out.println("Entre com Nome do Funcion�rio: ");
		funcionario.name = sc.nextLine();
		System.out.println("Entre com Sal�rio do Funcion�rio: ");
		funcionario.salarioBruto = sc.nextDouble();
		System.out.println("Entre com Imposto a ser descontado do Funcion�rio: ");
		funcionario.imposto = sc.nextDouble();
		System.out.println();	
		System.out.println("Funcionario: " + funcionario);
		System.out.println();	
		System.out.println("Qual Percentual de aumento do Sal�rio do Funcion�rio? ");
		double percentual = sc.nextDouble();
		funcionario.percentualAumentoSalario(percentual);		
		System.out.println();	
		System.out.println("Dados atualizados do Funcionario: " + funcionario); 
		
		//--------------------------------------------------------------------------------------------
		
		System.out.println();
		System.out.println("=====================================================================");
		System.out.println("Programa para Ler Nome de Aluno e tres notas (Notas m�ximas: 1� � 30, 2� e 3� � 35.");
		System.out.println("Apos mostrar nota do aluno, dizer se passou ou reprovou, se reprovou qtos pontos");
		System.out.println("faltaram para atingir a m�dia que � 60 pontos.");
		System.out.println();
		sc.nextLine();
		Estudante estudante = new Estudante();
		System.out.println("Entre com Nome do Aluno: ");
		estudante.name = sc.nextLine();
		System.out.println("Entre com a 1� Nota do aluno: ");
		estudante.primeiraNota = sc.nextDouble();
		System.out.println("Entre com a 2� Nota do aluno: ");
		estudante.segundaNota = sc.nextDouble();
		System.out.println("Entre com a 3� Nota do aluno: ");
		estudante.terceiraNota = sc.nextDouble();
		System.out.println();	
		System.out.println("Grade Final: " + estudante);
		System.out.println();	
	}

}
