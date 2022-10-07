package exerciciosObjetos;

import java.util.Scanner;

public class Ex5Main {

	public static void main(String[] args) {
		
		Scanner entrada = new Scanner(System.in);
		
		int codigo = 0;
		int qtd = 0;
		double preco = 0;
		boolean sair = false;
		boolean valida = false;
		double total = 0;
		
		Cardapio input = new Cardapio();
		input.setCodItem(codigo);
		input.setQtdItem(qtd);
		
		System.out.println(input.toString());
		
		do {
			System.out.print("Informe o código do item ou 0(zero) para encerrar o pedido: ");
			codigo = entrada.nextInt();
			if (codigo != 100 && codigo != 101 && codigo != 102 && codigo != 103
					&& codigo != 104 && codigo != 105 && codigo != 0) {
				System.out.println("Entrada inválida!");
			} else if (codigo == 0) {
				sair = true;
				continue;
			} else {
				valida = true;
			}
			if (valida) {
			System.out.print("Informe a quantidade desejada: ");
			qtd = entrada.nextInt();
			preco = input.calculaPedido(codigo, qtd);
			total += preco;
			System.out.println("Preço do item: R$" + String.format("%.2f",preco));
			}
			
		} while (!sair);
		
		System.out.println("Total do pedido: R$ " + String.format("%.2f",total));
		
		entrada.close();
	}

}
