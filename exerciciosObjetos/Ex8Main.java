package exerciciosObjetos;

import java.util.Scanner;

public class Ex8Main {

	public static void main(String[] args) {
		
		Scanner entrada = new Scanner(System.in);
		
		String nome = "";
		int opcao = 0;
		double valor = 0;
		boolean sair = false;
		
		Conta nova = new Conta(111, "", 0);

		System.out.print("Nome de cadastro para nova conta:");
		nome = entrada.nextLine();
		nova.setNome(nome);
		
		
		System.out.println();
		System.out.println("Número da conta: " + nova.getNumeroConta());
		System.out.println("Nome: " + nova.getNome());
		System.out.println("Saldo: R$" + String.format("%.2f",nova.getSaldo()));
		System.out.println();
		
		do {
			System.out.println("Qual operação deseja realizar");
			System.out.println("1 - Alterar nome");
			System.out.println("2 - Depósito");
			System.out.println("3 - Saque");
			System.out.println("4 - Sair");
			opcao = entrada.nextInt();
			
			switch(opcao) {
				case 1:
					System.out.print("Digite o nome correto: ");
					entrada.nextLine();
					nome = entrada.nextLine();
					nova.AlteraNome(nome);
					break;
				case 2:
					System.out.print("Informe o valor a ser depositado: ");
					valor = entrada.nextDouble();
					nova.deposito(valor);
					break;
				case 3:
					System.out.print("Informe o valor do saque: ");
					valor = entrada.nextDouble();
					nova.saque(valor);
					break;
				case 4:
					sair = true;
					System.out.println("Até logo!");
					break;
				default:
					System.out.println("Entrada inválida!");
			}
		} while (!sair);
				

		System.out.println();
		System.out.println("Número da conta: " + nova.getNumeroConta());
		System.out.println("Nome: " + nova.getNome());
		System.out.println("Saldo: R$" + String.format("%.2f",nova.getSaldo()));
		System.out.println();
		
		entrada.close();
	}

}
