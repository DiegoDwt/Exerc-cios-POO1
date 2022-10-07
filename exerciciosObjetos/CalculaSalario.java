package exerciciosObjetos;

public class CalculaSalario {

	private double valorHora;
	private double horasTrabalhadas;
	
	
	public double getValorHora() {
		return valorHora;
	}
	public void setValorHora(double valorHora) {
		this.valorHora = valorHora;
	}
	public double getHorasTrabalhadas() {
		return horasTrabalhadas;
	}
	public void setHorasTrabalhadas(double horasTrabalhadas) {
		this.horasTrabalhadas = horasTrabalhadas;
	}
	
	
	public double salarioBruto(double valor, double horas) {
		double saida = valor * horas;
		return saida;
	}
	
	public double impostoRenda(double bruto) {
		double saida = bruto * 0.11;
		return saida;
	}
	
	public double inss(double bruto) {
		double saida = bruto * 0.08;
		return saida;
	}
	
	public double sindicato(double bruto) {
		double saida = bruto * 0.05;
		return saida;
	}
	
	
	public double descontos(double imposto, double inss, double sindicato) {
		double saida = imposto + inss + sindicato;
		return saida;
	}
		
	public double salarioLiquido(double bruto, double descontos) {
		double saida = bruto - descontos;
		return saida;
	}

	public String toString(double bruto, double imposto, double inss, double sindicato, double salarioLiquido) {
		StringBuilder builder = new StringBuilder();
		builder.append("+ Salário Bruto: R$ ");
		builder.append(bruto);
		builder.append(System.getProperty("line.separator"));
		builder.append("- IR (11%): R$");
		builder.append(imposto);
		builder.append(System.getProperty("line.separator"));
		builder.append("- INSS (8%): R$");
		builder.append(inss);
		builder.append(System.getProperty("line.separator"));
		builder.append("- Sindicato (5%): R$");
		builder.append(sindicato);
		builder.append(System.getProperty("line.separator"));
		builder.append("= Salário Líquido: R$");
		builder.append(salarioLiquido);
		return builder.toString();
	}
	
	
	
	
}
