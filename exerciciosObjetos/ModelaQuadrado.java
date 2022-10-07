package exerciciosObjetos;

public class ModelaQuadrado {
	
	private double lado;

	public double getLado() {
		return lado;
	}

	public void setLado(double lado) {
		this.lado = lado;
	}
	
	public double mudaLado(double lado) {
		this.lado = lado;
		return lado;
	}
	
	public double areaQuadrado(double lado) {
		double saida = lado * lado;
		return saida;
	}

}
