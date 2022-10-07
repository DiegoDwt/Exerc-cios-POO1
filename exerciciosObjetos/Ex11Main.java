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
			System.out.println("Informe a operação desejada: ");
			System.out.println("1 - Abastecer por Valor");
			System.out.println("2 - Abastecer por litro");
			System.out.println("3 - Alterar o preço do combustível");
			System.out.println("4 - Alterar o tipo de combustível");
			System.out.println("5 - Alterar a quantidade de combustível da bomba");
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
				System.out.println("O valor a ser pago é R$ " + String.format("%.2f",bomba.abastacerPorLitro(valor)) );
				System.out.println("Quantidade de litros restante na bomba: " + String.format("%.2f",bomba.getQuantidadeCombustivel()) + "litros");
				break;	
			case 3:
				System.out.println("Qual o novo preço do combustível: ");
				valor = entrada.nextDouble();
				bomba.alteraValor(valor);
				System.out.println("Preço combustível: R$ " + String.format("%.2f",bomba.getValorLitro()) );
				break;
			case 4:
				System.out.println("Qual o novo tipo do combustível: ");
				entrada.nextLine();
				combustivel = entrada.nextLine();
				bomba.alteraCombustivel(combustivel);
				System.out.println("Tipo de combustível: " + bomba.getTipoCombustivel());
				break;
			case 5: 
				System.out.println("Qual a quantidade de combustível na bomba: ");
				valor = entrada.nextDouble();
				bomba.alteraQuantidadeCombustivel(valor);
				System.out.println("Quantidade de combustível na bomba: " + String.format("%.2f", bomba.getQuantidadeCombustivel()) + " litros");
				break;
			case 6:
				sair = true;
				System.out.println("Até logo!");
				break;
			default:
				System.out.println("entrada inválida!");
			}			
		} while (!sair);

		entrada.close();
	}

}
