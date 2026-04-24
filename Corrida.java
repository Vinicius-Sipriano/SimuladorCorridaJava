package simuladorCorrida;

class Corrida {
	public static void main(String[] args) {
		System.out.println("=== INÍCIO DA CORRIDA DE FÓRMULA 1 ===\n");
		
		Carro carroHamilton = new Carro("Hamilton");
		Carro carroFernando = new Carro("FernandoAlonso");
		
		Piloto hamilton = new Piloto(carroHamilton);
		Piloto fernando = new Piloto(carroFernando);
		
		try {
			hamilton.getThread().join();
			fernando.getThread().join();
		} catch (InterruptedException e) {
			System.out.println("Corrida interrompida: " + e.getMessage());
		}
		
		System.out.println("\n=== RESULTADO FINAL ===");
		System.out.println("Hamilton completou " + carroHamilton.getVoltas() + " voltas");
		System.out.println("Tempo total de Hamilton: " + carroHamilton.getTempoTotal() + "ms");
		System.out.println("\nFernandoAlonso completou " + carroFernando.getVoltas() + " voltas");
		System.out.println("Tempo total de FernandoAlonso: " + carroFernando.getTempoTotal() + "ms");
		
		System.out.println("\n" + "=".repeat(40));
		
		long tempoHamilton = carroHamilton.getTempoTotal();
		long tempoFernando = carroFernando.getTempoTotal();
		
		if (tempoHamilton < tempoFernando) {
			System.out.println("=== VENCEDOR: HAMILTON! ===");
			System.out.println("Diferença: " + (tempoFernando - tempoHamilton) + "ms");
		} else if (tempoFernando < tempoHamilton) {
			System.out.println("=== VENCEDOR: FERNANDOALONSO! ===");
			System.out.println("Diferença: " + (tempoHamilton - tempoFernando) + "ms");
		} else {
			System.out.println("=== EMPATE! ===");
			System.out.println("Ambos completaram em " + tempoHamilton + "ms");
		}
	}
}