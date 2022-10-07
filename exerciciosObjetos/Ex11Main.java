package exerciciosObjetos;

import java.util.Scanner;

public class Ex11Main {

	public static void main(String[] args) {
		
		boolean sair = false;
		int opcao = 0;
		double valor = 0;
		double preco = 0;
		String combustivel = "";
		
		Scanner entrada = new Scanner(System.in);
		
		BombaCombustivel bomba = new BombaCombustivel("Gasolina", 5.49, 5000);
		
		do {
			System.out.println("Informe a opera��o desejada: ");
			System.out.println("1 - Abastecer por Valor");
			System.out.println("2 - Abastecer por litro");
			System.out.println("3 - Alterar o pre�o do combust�vel");
			System.out.println("4 - Alterar o tipo de combust�vel");
			System.out.println("5 - Alterar a quantidade de combust�vel da bomba");
			System.out.println("6 - sair");
			opcao = entrada.nextInt();
			
			switch(opcao) {
			case 1:
				System.out.print("Informe o valor: ");
				valor = entrada.nextDouble();
				System.out.println("Quantidade de litros: " + String.format("%.2f", bomba.abastecerPorValor(valor)) + " litros");
				System.out.println("Quantidade de litros restante na bomba: " + String.format("%.2f",bomba.getQuantidadeCombustivel()) + " litros" );
				break;
			case 2: 	
				System.out.print("Informe a quantidade litros: ");
				valor = entrada.nextDouble();
				System.out.println("O valor a ser pago � R$ " + String.format("%.2f",bomba.abastacerPorLitro(valor)) );
				System.out.println("Quantidade de litros restante na bomba: " + String.format("%.2f",bomba.getQuantidadeCombustivel()) + "litros");
				break;	
			case 3:
				System.out.println("Qual o novo pre�o do combust�vel: ");
				valor = entrada.nextDouble();
				bomba.alteraValor(valor);
				System.out.println("Pre�o combust�vel: R$ " + String.format("%.2f",bomba.getValorLitro()) );
				break;
			case 4:
				System.out.println("Qual o novo tipo do combust�vel: ");
				entrada.nextLine();
				combustivel = entrada.nextLine();
				bomba.alteraCombustivel(combustivel);
				System.out.println("Tipo de combust�vel: " + bomba.getTipoCombustivel());
				break;
			case 5: 
				System.out.println("Qual a quantidade de combust�vel na bomba: ");
				valor = entrada.nextDouble();
				bomba.alteraQuantidadeCombustivel(valor);
				System.out.println("Quantidade de combust�vel na bomba: " + String.format("%.2f", bomba.getQuantidadeCombustivel()) + " litros");
				break;
			case 6:
				sair = true;
				System.out.println("At� logo!");
				break;
			default:
				System.out.println("entrada inv�lida!");
			}			
		} while (!sair);

		entrada.close();
	}

}
