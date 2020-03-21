package batalha_naval;

import java.util.Random;

public class Tabuleiro {
	private static int linhas = 10;
	private static int colunas = 10;
	private static Random rand;
	private Posicao grid[][] = new Posicao[linhas][colunas];
	
	public Tabuleiro(Random rand) {
		this.rand = rand;
		for(int i = 0; i < linhas; i++) {
			for(int j = 0; j < colunas; j++) {
				this.grid[i][j] = new Posicao();
			}
		}
	}
	
	public void randomizarNavios(Navio navios[]) {
		int x,y,tamanhoNavio;
		
		for(int i = 0; i < navios.length; i++) {
			while(true) {
				x = rand.nextInt(10);
				y = rand.nextInt(10);
				if( !this.grid[x][y].checar() ) {
					if( navios[i].isVertical() ) {
						if( x + navios[i].getTamanho() <= linhas ) {
							tamanhoNavio = 0;
							for(int j = x; j < x + navios[i].getTamanho(); j++) {
								if( this.grid[j][y].checar() ) {
									break;
								} else {
									tamanhoNavio++;
								}
							}
							if( tamanhoNavio == navios[i].getTamanho() ) {
								for(int j = x; j < x + navios[i].getTamanho(); j++) {
									this.grid[j][y].addNavio(navios[i]);
								}
								break;
							}
						}
					} else {
						if( y + navios[i].getTamanho() <= colunas ) {
							tamanhoNavio = 0;
							for(int j = y; j < y + navios[i].getTamanho(); j++) {
								if( this.grid[x][j].checar() ) {
									break;
								} else {
									tamanhoNavio++;
								}
							}
							if( tamanhoNavio == navios[i].getTamanho() ) {
								for(int j = y; j < y + navios[i].getTamanho(); j++) {
									this.grid[x][j].addNavio(navios[i]);
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
				if( this.grid[i][j].checar() ) {
					if( this.grid[i][j].getStatus()) {
						System.out.print("X ");
					} else {
						System.out.print("? ");
					}
				} else {
					if( this.grid[i][j].getStatus()) {
						System.out.print("  ");
					} else {
						System.out.print("? ");
					}
				}
			}
			System.out.println(" ");
		}
		System.out.println(" ");
	}
	
	public boolean checar(int x, int y) {
		return this.grid[x][y].checar();
	}
	
	public void errou(int x, int y) {
		this.grid[x][y].errou();
	}
}
