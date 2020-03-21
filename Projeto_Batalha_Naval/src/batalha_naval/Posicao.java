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
	
	public int getTamanho() {
		return this.navio.getTamanho();
	}
	
	public boolean getStatus() {
		return this.status;
	}
	
	public boolean checar() {
		return this.tem_navio;
	}
	
	public void mudarStatus() {
		this.status = true;
	}
	
	public void acertou() {
		this.navio.acertou();
	}
	
	public String getNome() {
		return this.navio.getNome();
	}
}
