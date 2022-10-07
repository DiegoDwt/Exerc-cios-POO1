package exerciciosObjetos;

import java.util.Scanner;

public class Ex3Main {

	public static void main(String[] args) {
		
		Scanner entrada = new Scanner(System.in);
		
		double n1 = 0;
		double n2 = 0;
		
		Calcula ex3 = new Calcula();
		ex3.setNum1(n1);
		ex3.setNum2(n2);
		
		System.out.print("Digite um número: ");
		n1 = entrada.nextInt();
		
		System.out.print("Digite outro número: ");
		n2 = entrada.nextInt();
		
		System.out.println(ex3.saida(n1, n2));
		
		entrada.close();
	}

}
