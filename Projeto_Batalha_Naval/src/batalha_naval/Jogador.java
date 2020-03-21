package batalha_naval;

import java.util.Random;

public class Jogador {
	private String nome;
	private Tabuleiro tabuleiro;
	private Random rand = new Random();
	private int qtd_navios;
	private Navio navios[];
	
	public Jogador(String n) {
		this.nome = n;
		this.tabuleiro = new Tabuleiro();
		this.qtd_navios = 5;
		this.navios = new Navio[]	{
										new Navio("Porta-aviões", 5, this.rand.nextBoolean()),
										new Navio("Navio de guerra", 4, this.rand.nextBoolean()),
										new Navio("Cruzador", 3, this.rand.nextBoolean()),
										new Navio("Submarino", 3, this.rand.nextBoolean()),
										new Navio("Destruidor", 2, this.rand.nextBoolean())
									};
		this.tabuleiro.randomizarNavios(navios);
	}
	
	public String getNome() {
		return this.nome;
	}
	
	public void imprimeOponenteTabuleiro(Jogador p) {
		p.tabuleiro.printarTabuleiro();
	}
}
