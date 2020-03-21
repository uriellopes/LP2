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
		this.tabuleiro.mudarStatus(x, y);
		return this.tabuleiro.checar(x, y);
	}
	
	public void acertou(int x, int y) {
		System.out.println("Jogador "+this.getNome()+": Fogo! " + this.tabuleiro.getNome(x, y) + " foi atingido.");
		this.tabuleiro.acertou(x, y);
		if( this.tabuleiro.destruido(x, y) ) {
			System.out.println("Jogador "+this.getNome()+": O navio "+ this.tabuleiro.getNome(x,y) + " foi afundado!");
			this.qtd_navios--;
		}
	}
	
	public boolean venceu() {
		return this.qtd_navios == 0;
	}
	
	public void agua() {
		System.out.println("Jogador "+this.getNome()+": Água!");
	}
	
	public boolean visivel(int x, int y) {
		return this.tabuleiro.visivel(x, y);
	}
}
