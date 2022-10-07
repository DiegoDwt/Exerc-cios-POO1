package exerciciosObjetos;

public class Conta {
	
	private int numeroConta;
	private String nome;
	private double saldo;
	
	public Conta(int numeroConta, String nome, double saldo) {
		this.numeroConta = numeroConta;
		this.nome = nome;
		this.saldo = saldo;
	}
	
	public int getNumeroConta() {
		return numeroConta;
	}
	public void setNumeroConta(int numeroConta) {
		this.numeroConta = numeroConta;
	}
	public String getNome() {
		return nome;
	}
	public void setNome(String nome) {
		this.nome = nome;
	}
	public double getSaldo() {
		return saldo;
	}
	public void setSaldo(double saldo) {
		this.saldo = saldo;
	}

	
	public void AlteraNome(String novoNome) {
		this.nome = novoNome;
	}
	
	
	public void deposito(double valor) {
		this.saldo = saldo + valor;
	}
	
	
	public String saque(double valor) {
		String saida;
		if (valor > saldo) {
			saida = "Saldo insuficiente";
		} else {
			saida = "";
		}
		this.saldo = saldo - valor;
		return saida;
	}
}
