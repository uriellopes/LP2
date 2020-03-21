package batalha_naval;

import java.util.Random;

public class Tabuleiro {
	private static int linhas = 10;
	private static int colunas = 10;
	private Posicao grid[][] = new Posicao[linhas][colunas];
	private Navio navios[] = new Navio[5];
	private Random rand = new Random();
	private int qtd_navios;
	
	public Tabuleiro() {		
		
		this.navios[0] = new Navio("Porta-aviões", 5, this.rand.nextBoolean());
		this.navios[1] = new Navio("Navio de guerra",4, this.rand.nextBoolean());
		this.navios[2] = new Navio("Cruzador",3, this.rand.nextBoolean());
		this.navios[3] = new Navio("Submarino",3, this.rand.nextBoolean());
		this.navios[4] = new Navio("Destruidor",2, this.rand.nextBoolean());		
		this.qtd_navios = 5;
		
		for(int i = 0; i < linhas; i++) {
			for(int j = 0; j < colunas; j++) {
				this.grid[i][j] = new Posicao();
			}
		}
		
		int x,y,tamanhoNavio;
		
		for(int i = 0; i < this.navios.length; i++) {
			while(true) {
				x = this.rand.nextInt(10);
				y = this.rand.nextInt(10);
				if( !this.grid[x][y].temNavio() ) {
					if( this.navios[i].isVertical() ) {
						if( x + this.navios[i].getTamanho() <= linhas ) {
							tamanhoNavio = 0;
							for(int j = x; j < x + this.navios[i].getTamanho(); j++) {
								if( this.grid[j][y].temNavio() ) {
									break;
								} else {
									tamanhoNavio++;
								}
							}
							if( tamanhoNavio == this.navios[i].getTamanho() ) {
								for(int j = x; j < x + this.navios[i].getTamanho(); j++) {
									this.grid[j][y].addNavio(this.navios[i]);
								}
								break;
							}
						}
					} else {
						if( y + this.navios[i].getTamanho() <= colunas ) {
							tamanhoNavio = 0;
							for(int j = y; j < y + this.navios[i].getTamanho(); j++) {
								if( this.grid[x][j].temNavio() ) {
									break;
								} else {
									tamanhoNavio++;
								}
							}
							if( tamanhoNavio == this.navios[i].getTamanho() ) {
								for(int j = y; j < y + this.navios[i].getTamanho(); j++) {
									this.grid[x][j].addNavio(this.navios[i]);
								}
								break;
							}
						}
					}
				}
			}
		}
	}
	
	public void printarTabuleiro() {
		System.out.print("  ");
		for(int k = 0; k < colunas; k++) {
			System.out.print(k + " ");
		}
		System.out.println(" ");
		for(int i = 0; i < linhas; i++) {
			System.out.print(i + " ");
			for(int j = 0; j < colunas; j++) {
				if( this.grid[i][j].temNavio() ) {
					if( this.grid[i][j].getStatus()) {
						System.out.print("X ");
					} else {
						System.out.print("? ");
					}
				} else {
					if( this.grid[i][j].getStatus()) {
						System.out.print("A ");
					} else {
						System.out.print("? ");
					}
				}
			}
			System.out.println(" ");
		}
		System.out.println(" ");
	}
}
