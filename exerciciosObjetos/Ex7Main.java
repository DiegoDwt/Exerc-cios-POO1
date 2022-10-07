package exerciciosObjetos;

import java.util.Scanner;

public class Ex7Main {

	public static void main(String[] args) {
		
		Scanner entrada = new Scanner(System.in);
		
		int opcao = 0;
		double incremento = 0;
		
		Pessoa joao = new Pessoa();
		joao.setNome("João da Silva");
		joao.setIdade(18);
		joao.setAltura(160);
		joao.setPeso(88);
		
		System.out.println("Nome: " + joao.getNome());
		System.out.println("Idade: " + joao.getIdade() + " anos");
		System.out.println("Altura: " + joao.getAltura() + " cm");
		System.out.println("Peso: " + joao.getPeso() + " Kg");
		System.out.println();
		
		System.out.println("Qual função deseja aplicar a pessoa? ");
		System.out.println("1 - Envelhecer");
		System.out.println("2 - Engordar");
		System.out.println("3 - Emagrecer");
		System.out.println("4 - Crescer");
		
		opcao = entrada.nextInt();
		
		switch (opcao) {
			case 1:
				System.out.println("Quantos anos serão incrementados?");
				incremento = entrada.nextDouble();
				joao.envelhecer((int) incremento);
				break;
			case 2:
				System.out.println("Quantos kilos serão incrementados?");
				incremento = entrada.nextDouble();
				joao.engordar((int) incremento);
				break;
			case 3:
				System.out.println("Quantos kilos serão diminuidos?");
				incremento = entrada.nextDouble();
				joao.emagrecer((float) incremento);
				break;
			case 4: 
				System.out.println("Quantos centimetros serão incrementados?");
				incremento = entrada.nextDouble();
				joao.crescer(incremento);
				break;
			default:
				System.out.println("Entrada inválida!");
		
		}
		
		System.out.println();
		System.out.println("Nome: " + joao.getNome());
		System.out.println("Idade: " + joao.getIdade() + " anos");
		System.out.println("Altura: " + joao.getAltura() + " cm");
		System.out.println("Peso: " + joao.getPeso() + " Kg");

		entrada.close();
     }

}