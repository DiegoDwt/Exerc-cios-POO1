package exerciciosObjetos;

import java.util.Scanner;

public class Ex6Main {

	public static void main(String[] args) {
		
		Scanner entrada = new Scanner(System.in);
		
		double lado = 0;
		double novoLado = 0;
		double area = 0;
		
		ModelaQuadrado input = new ModelaQuadrado();
		input.getLado();
		
		System.out.print("Qual a medida do lado do quadrado? ");
		lado = entrada.nextDouble();
		
		novoLado = input.mudaLado(lado);
		System.out.println("O lado do quadrado � igual a: " + novoLado);
		
		area = input.areaQuadrado(novoLado);
		System.out.println("A �rea do quadrado � igual a " + area);
		
		entrada.close();
		
		
		

	}

}
