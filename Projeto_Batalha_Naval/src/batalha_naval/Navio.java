package batalha_naval;

public class Navio {
	private int tamanho;
	private String nome;
	private boolean vertical;
	
	public Navio(String n, int t, boolean v) {
		this.tamanho = t;
		this.nome = n;
		this.vertical = v;
	}
	
	public String getNome() {
		return this.nome;
	}
	
	public int getTamanho() {
		return this.tamanho;
	}
	
	public boolean isVertical() {
		return this.vertical;
	}
}
