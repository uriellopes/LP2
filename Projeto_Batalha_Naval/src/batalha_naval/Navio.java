package batalha_naval;

public class Navio {
	private int tamanho;
	private String nome;
	private boolean vertical;
	String n;
	
	public Navio(String n, int t, boolean v, String m) {
		this.tamanho = t;
		this.nome = n;
		this.vertical = v;
		this.n = m;
	}
	
	public void printNavio() {
		System.out.println("Nome: "+ this.nome+" Tamanho: " +this.tamanho);
	}
	
	public void setTamanho(int i) {
		this.tamanho = i;
	}
	
	public int getTamanho() {
		return this.tamanho;
	}
	
	public boolean isVertical() {
		return this.vertical;
	}
	
	public void hit() {
		this.tamanho--;
	}
}
