package exerciciosObjetos;

public class Televisor {
	
	private int canal;
	private int volume;
	
	public Televisor (int canal, int volume){
		this.canal = canal;
		this.volume = volume;
	}
	
	public int getCanal() {
		return canal;
	}
	public void setCanal(int canal) {
		this.canal = canal;
	}
	public int getVolume() {
		return volume;
	}
	public void setVolume(int volume) {
		this.volume = volume;
	}
	
	public String mudaCanal(int canal) {
		String saida = "";
		if (canal < 1 || canal > 100) {
			saida = "Canal inexistente";
		} else {
			this.canal = canal;
		}
		return saida;
	}
	
	public String menosVolume() {
		String saida = "";
		if (volume == 0) {
			saida = "O volume está no mínimo!";
		} else {
			this.volume = volume - 5;
		}
		return saida;
	}
	
	public String maisVolume() {
		String saida = "";
		if (volume >= 100) {
			saida = "O volume está no máximo!";
		} else {
			this.volume = volume + 5;
		}
		return saida;
	}

}
