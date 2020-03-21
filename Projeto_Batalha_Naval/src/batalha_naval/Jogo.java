package batalha_naval;

import java.util.Random;
import java.util.Scanner;

public class Jogo {
	private Jogador p1;
	private Jogador p2;
	private Random rand = new Random();
	
	public Jogo(String n1, String n2 ) {
		this.p1 = new Jogador(n1);
		this.p2 = new Jogador(n2);
	}
	
	public void iniciarJogo() {
		Scanner leitor = new Scanner(System.in);
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
		
		System.out.println("O primeiro a jogar será " + turno.getNome());
		
		int x,y;
		while(true) {
			System.out.println("");
			System.out.println("Vez do jogador " + turno.getNome());
			System.out.println("");
			turno.imprimeTabuleiro();
			
			System.out.print("Digite o x: ");
			x = leitor.nextInt();
			System.out.print("Digite o y: ");
			y = leitor.nextInt();
			System.out.println("");
			
			if( turno.checar(x, y) ) {
				turno.acertou(x, y);
				if( turno.venceu() ) {
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
		}
		
		leitor.close();
	}
}
