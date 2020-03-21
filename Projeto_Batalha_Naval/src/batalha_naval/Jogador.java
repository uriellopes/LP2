package batalha_naval;

import java.util.Random;

public class Jogador {
	private String nome;
	private Tabuleiro tabuleiro;
	private Random rand = new Random();
	private Navio navios[] = new Navio[] {new Navio("Porta-aviões", 5, rand.nextBoolean()),new Navio("Porta-aviões", 5, rand.nextBoolean()),new Navio("Porta-aviões", 5, rand.nextBoolean()),new Navio("Porta-aviões", 5, rand.nextBoolean()),new Navio("Porta-aviões", 5, rand.nextBoolean())};
	private int qtd_navios = 5;
	
	public Jogador(String n) {
		this.nome = n;
		this.tabuleiro = new Tabuleiro();
		this.tabuleiro.randomizarNavios(navios);
	}
	
	public String getNome() {
		return this.nome;
	}
	
	public void imprimeOponenteTabuleiro(Jogador p) {
		p.tabuleiro.printarTabuleiro();
	}
}
