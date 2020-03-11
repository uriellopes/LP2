package agenda;

public class Pessoa {
	private String nome;
	private int idade;
	private float altura;
	
	public Pessoa(String nome, int idade, float altura) {
		this.nome = nome;
		this.idade = idade;
		this.altura = altura;
	}
	
	public String getNome() {
		return this.nome;
	}
	
	public void imprimePessoa() {
		System.out.println("Nome: " + this.nome);
		System.out.println("Idade: " + this.idade);
		System.out.println("Altura: " + this.altura);
	}
}
