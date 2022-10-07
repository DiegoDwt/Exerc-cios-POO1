package exerciciosObjetos;

public class Calcula {
	
	private double num1;
	private double num2;
	

	public double getNum1() {
		return num1;
	}
	public void setNum1(double num1) {
		this.num1 = num1;
	}
	public double getNum2() {
		return num2;
	}
	public void setNum2(double  num2) {
		this.num2 = num2;
	}

	public String saida(double num1, double num2) {
		StringBuilder builder = new StringBuilder();
		builder.append(num1);
		builder.append(" + ");
		builder.append(num2);
		builder.append(" = ");
		builder.append(num1 + num2);
		builder.append(System.getProperty("line.separator"));
		builder.append(num1);
		builder.append(" - ");
		builder.append(num2);
		builder.append(" = ");
		builder.append(num1 - num2);
		builder.append(System.getProperty("line.separator"));
		builder.append(num1);
		builder.append(" * ");
		builder.append(num2);
		builder.append(" = ");
		builder.append(num1 * num2);
		builder.append(System.getProperty("line.separator"));
		builder.append(num1);
		builder.append(" / ");
		builder.append(num2);
		builder.append(" = ");
		builder.append(num1 / num2);
		return builder.toString();
	}
	
}
