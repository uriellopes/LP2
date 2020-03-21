package batalha_naval;

public class Posicao {
	private Navio navio;
	private boolean tem_navio = false;
	
	public Posicao() {
		this.navio = null;
	}
	
	public void addNavio(Navio n) {
		this.navio = n;
		this.tem_navio = true;
	}
	
	public boolean temNavio() {
		return this.tem_navio;
	}
	
	public void hit() {
		this.navio.hit();
	}
	
	public int getTamanho() {
		return this.navio.getTamanho();
	}
	
	public String n() {
		return this.navio.n;
	}
}
