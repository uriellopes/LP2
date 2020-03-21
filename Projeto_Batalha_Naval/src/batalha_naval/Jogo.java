package batalha_naval;

public class Jogo {
	private Jogador p1;
	private Jogador p2;
	
	public Jogo(String n1, String n2 ) {
		this.p1 = new Jogador(n1);
		this.p2 = new Jogador(n2);
	}
	
	public void printJogadores() {
		this.p1.printTabuleiro();
		System.out.println(" ");
		this.p2.printTabuleiro();
	}
}
