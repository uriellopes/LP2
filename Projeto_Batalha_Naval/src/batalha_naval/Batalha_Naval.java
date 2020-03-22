package batalha_naval;

import java.util.Scanner;

public class Batalha_Naval {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String n1, n2;
		Scanner leitor = new Scanner(System.in);
		System.out.print("Digite o nome do primeiro jogador: ");
		n1 = leitor.nextLine();
		System.out.print("Digite o nome do segundo jogador: ");
		n2 = leitor.nextLine();
		
		Jogo jogo = new Jogo(n1, n2, leitor);
		
		jogo.iniciarJogo();
		
		leitor.close();
	}

}
