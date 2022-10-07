package exerciciosObjetos;

import java.util.Scanner;

public class Ex4Main {

	public static void main(String[] args) {
		
		Scanner entrada = new Scanner(System.in);
				
		double valor = 0;
		double qtdHoras = 0; 
		double bruto = 0;
		double inss = 0;
		double imposto = 0;
		double sindicato = 0;
		double descontos = 0;
		double liquido = 0;
		String resultado = "";
		
		CalculaSalario input = new CalculaSalario();
		input.setValorHora(valor);
		input.setHorasTrabalhadas(qtdHoras);
		
		System.out.print("Qual o valor da hora trabalhada? ");
		valor = entrada.nextDouble();
		
		System.out.print("Quantidade de horas trabalhaads: ");
		qtdHoras = entrada.nextDouble();
		
		bruto = input.salarioBruto(valor, qtdHoras);
		inss = input.inss(bruto);
		imposto = input.impostoRenda(bruto);
		sindicato = input.sindicato(bruto);
		descontos = input.descontos(imposto, inss, sindicato);
		liquido = input.salarioLiquido(bruto, descontos);
		resultado = input.toString(bruto, imposto, inss, sindicato, liquido);
		
		System.out.println(resultado);
		
		entrada.close();
		
	}

}
