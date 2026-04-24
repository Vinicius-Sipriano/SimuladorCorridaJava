package simuladorCorrida;

class Carro {
	private String piloto;
	private int voltas = 0;
	private long tempoTotal = 0;
	
	public Carro(String piloto) {
		this.piloto = piloto;
	}
	
	synchronized void completarVolta(int numeroVolta, long tempoVolta) {
		System.out.println("[" + piloto + " iniciando volta " + numeroVolta);
		try {
			// Simula o tempo da volta
			Thread.sleep(tempoVolta);
		} catch (InterruptedException e) {
			System.out.println("Erro na volta: " + e.getMessage());
		}
		voltas++;
		tempoTotal += tempoVolta;
		System.out.println(piloto + " completou a volta " + numeroVolta + " em " + tempoVolta + "ms (Tempo acumulado: " + tempoTotal + "ms)]");
	}
	
	public int getVoltas() {
		return voltas;
	}
	
	public long getTempoTotal() {
		return tempoTotal;
	}
	
	public String getPiloto() {
		return piloto;
	}
}