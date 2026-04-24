package simuladorCorrida;

class Piloto implements Runnable {
	private Carro carro;
	private Thread t;
	private static final int TOTAL_VOLTAS = 5;
	
	public Piloto(Carro carro) {
		this.carro = carro;
		t = new Thread(this);
		t.start();
	}
	
	public void run() {
		for (int i = 1; i <= TOTAL_VOLTAS; i++) {
			// Gera um tempo aleatório entre 1000ms e 3000ms para cada volta
			long tempoVolta = 1000 + (long) (Math.random() * 2000);
			carro.completarVolta(i, tempoVolta);
		}
	}
	
	public Thread getThread() {
		return t;
	}
}