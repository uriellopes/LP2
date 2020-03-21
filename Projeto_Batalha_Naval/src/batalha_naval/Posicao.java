package batalha_naval;

public class Posicao {
	private Navio navio;
	private boolean tem_navio;
	private boolean status;
	
	public Posicao() {
		this.navio = null;
		this.tem_navio = false;
		this.status = false;
	}
	
	public void addNavio(Navio n) {
		this.navio = n;
		this.tem_navio = true;
	}
	
	public boolean temNavio() {
		return this.tem_navio;
	}
	
	public int getTamanho() {
		return this.navio.getTamanho();
	}
	
	public boolean getStatus() {
		return this.status;
	}
}
