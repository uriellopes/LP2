package batalha_naval;

public class Jogador {
	private String nome;
	private Tabuleiro tabuleiro;
	
	public Jogador(String n) {
		this.nome = n;
		this.tabuleiro = new Tabuleiro();
	}
	
	public String getNome() {
		return this.nome;
	}
	
	public void printTabuleiro() {
		this.tabuleiro.printarTabuleiro();
	}
}
