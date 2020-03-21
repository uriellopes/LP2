package batalha_naval;

import java.util.Random;

public class Jogador {
	private String nome;
	private Tabuleiro tabuleiro;
	private static Random rand = new Random();
	private int qtd_navios;
	private Navio navios[];
	
	public Jogador(String n) {
		this.nome = n;
		this.tabuleiro = new Tabuleiro(rand);
		this.qtd_navios = 5;
		this.navios = new Navio[]	{
										new Navio("Porta-aviões", 5, rand.nextBoolean()),
										new Navio("Navio de guerra", 4, rand.nextBoolean()),
										new Navio("Cruzador", 3, rand.nextBoolean()),
										new Navio("Submarino", 3, rand.nextBoolean()),
										new Navio("Destruidor", 2, rand.nextBoolean())
									};
		this.tabuleiro.randomizarNavios(navios);
	}
	
	public String getNome() {
		return this.nome;
	}
	
	public void imprimeTabuleiro() {
		this.tabuleiro.printarTabuleiro();
	}
	
	public boolean checar(int x, int y) {
		return this.tabuleiro.checar(x, y);
	}
	
	public void errou(int x, int y) {
		this.tabuleiro.errou(x, y);
	}
}
