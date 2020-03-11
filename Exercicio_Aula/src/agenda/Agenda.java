package agenda;

public class Agenda {
	private Pessoa pessoa[] = new Pessoa[10];
	
	public Agenda() {
		for(int i = 0; i < pessoa.length; i++) {
			pessoa[i] = null;
		}
	}
	
	public void armazenaPessoa(String nome, int idade, float altura) {
		for(int i = 0; i < pessoa.length; i++) {
			if(pessoa[i] == null ) {
				pessoa[i] = new Pessoa(nome, idade, altura);
				break;
			}
		}
	}
	
	public void removePessoa(String nome) {
		for(int i = 0; i < pessoa.length; i++) {
			if(pessoa[i].getNome() == nome ) {
				pessoa[i] = null;
				break;
			}
		}
	}
	
	public int buscaPessoa(String nome) {
		for(int i = 0; i < pessoa.length; i++) {
			if(pessoa[i].getNome() == nome ) {
				return i;
			}
		}
		return -1;
	}
	
	public void imprimeAgenda() {
		for(int i = 0; i < pessoa.length; i++) {
			if(pessoa[i] != null ) {
				pessoa[i].imprimePessoa();
				System.out.println("");
			}
		}
	}
	
	public void imprimePessoa(int index) {
		if( pessoa[index] != null) {
			pessoa[index].imprimePessoa();
		} else {
			System.out.println("Nenhuma pessoa cadastrada nesse index");
		}
	}
}
