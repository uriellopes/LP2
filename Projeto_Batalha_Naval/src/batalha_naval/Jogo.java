package batalha_naval;

import java.util.Random;
import java.util.Scanner;

public class Jogo {
	private Jogador p1;
	private Jogador p2;
	private Random rand = new Random();
	private Scanner leitor;
	
	public Jogo(String n1, String n2, Scanner l ) {
		this.p1 = new Jogador(n1);
		this.p2 = new Jogador(n2);
		this.leitor = l;
	}
	
	public void iniciarJogo() {
		Jogador turno = null, espera = null, aux = null;
		
		switch(rand.nextInt(2)) {
		case 0:
			turno = p1;
			espera = p2;
			break;
		case 1:
			turno = p2;
			espera = p1;
			break;
		}
		
		System.out.println("");
		System.out.println("O primeiro a jogar será " + turno.getNome());
		
		int x,y;
		char input;
		boolean inputInvalido = false;
		while(true) {
			System.out.println("");
			System.out.println("Vez do jogador " + turno.getNome());
			System.out.println("");
			turno.imprimeTabuleiro();
			
			do {
				if(inputInvalido) {
					System.out.println("Input inválido, digite outro valor!");
				}
				System.out.print("Digite o numero referente a linha: ");
				x = this.leitor.nextInt();
				if( x >= 0 && x <= 9 ) {
					break;
				} else {
					inputInvalido = true;
				}				
			} while (true);
			
			inputInvalido = false;
			do {
				if(inputInvalido) {
					System.out.println("Input inválido, digite outro valor!");
				}
				System.out.print("Digite a letra referente a coluna: ");
				input = this.leitor.next().charAt(0);
				switch(input) {
				case 'a':
				case 'A':
					y = 0;
					break;
				case 'b':
				case 'B':
					y = 1;
					break;
				case 'c':
				case 'C':
					y = 2;
					break;
				case 'd':
				case 'D':
					y = 3;
					break;
				case 'e':
				case 'E':
					y = 4;
					break;
				case 'f':
				case 'F':
					y = 5;
					break;
				case 'g':
				case 'G':
					y = 6;
					break;
				case 'h':
				case 'H':
					y = 7;
					break;
				case 'i':
				case 'I':
					y = 8;
					break;
				case 'j':
				case 'J':
					y = 9;
					break;
				default:
					inputInvalido = true;
					continue;
				}
				inputInvalido = false;
				System.out.println("");
				break;
			} while (true);
			if( !turno.visivel(x,y) ) {
				if( turno.checar(x, y) ) {
					turno.acertou(x, y);
					if( turno.venceu() ) {
						System.out.println("");
						System.out.println("O jogo acabou!");
						System.out.println("O vencedor foi "+ turno.getNome());
						break;
					}
				} else {
					espera.agua();
					
					aux = turno;
					turno = espera;
					espera = aux;
				}
			} else {
				System.out.println("Essa posição já foi atacada, repita a jogada!");
			}
		}
	}
}
