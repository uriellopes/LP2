package aula2;

public class Banco {

	public static void main(String[] args) {
		
		Conta c = new Conta();
		c.numero = 123123;
		c.titular = "Uriel Lira Lopes";
		c.saldo = 12500;
		
		Conta d = new Conta();
		d.numero = 33232;
		d.titular = "John";
		d.saldo = 0;
		
//		System.out.println("Informacoes da conta");
//		System.out.println("Numero: " + c.numero);
//		System.out.println(c.imprimeTitular());
//		System.out.println("Conta: " + c.saldo);
//		
//		c.saca(250);
//		
//		System.out.println("Conta: " + c.saldo);
//		
//		c.deposita(300);
//		
//		System.out.println("Conta: " + c.saldo);
		
		if( c.transferir(d, 300)) {
			System.out.println("Conta: " + c.saldo);
			System.out.println("Conta: " + d.saldo);
		} else {
			System.out.println("Nao foi possivel transferir");
		}
		
		if( d.transferir(c, 500)) {
			System.out.println("Conta: " + c.saldo);
			System.out.println("Conta: " + d.saldo);
		} else {
			System.out.println("Nao foi possivel transferir");
		}
		
	}

}
