package agenda;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Agenda a1 = new Agenda();
		
		a1.armazenaPessoa("Uriel", 3, 180F);
		a1.armazenaPessoa("Pedro", 5, 15F);
		a1.armazenaPessoa("Jao", 5, 15F);
		a1.armazenaPessoa("Lu", 5, 15F);
		a1.armazenaPessoa("Ana", 5, 15F);
		
		a1.imprimePessoa(4);
		
	}

}
