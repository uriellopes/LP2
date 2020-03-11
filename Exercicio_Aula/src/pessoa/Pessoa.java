package pessoa;

import java.time.LocalDate;
import java.time.Period;
import java.util.Date;

public class Pessoa {
	private String nome;
	private String nascimento;
	private float altura;
	private int idade;
	
	public Pessoa(String nome, int d, int m, int a, float altura) {
		this.nome = nome;
		this.altura = altura;
		this.nascimento = d + "/" + m + "/" + a;
		this.idade = calcularIdade(d, m, a);
	}
	
	public int calcularIdade(int d, int m, int a) {
		int idade;
		Date hoje = new Date();
		LocalDate nascimento = LocalDate.of(a, m, d);		
		idade = Period.between(nascimento, LocalDate.of(hoje.getYear() + 1900, hoje.getMonth(), hoje.getDate())).getYears();
		return idade;
	}
	
	public void imprimePessoa() {
		System.out.println("Nome: " + this.nome);
		System.out.println("Idade: " + this.idade);
		System.out.println("Data de nascimento: " + this.nascimento);
		System.out.println("Altura(cm): " + this.altura);
	}

}
