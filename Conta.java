package banco;

public class Conta {
	private int numero;
	private Cliente titular;
	private double saldo;
	private static int totalDeContas;
	
	public Conta(int n, Cliente c) {
		this.numero = n;
		this.titular = c;
		Conta.totalDeContas = Conta.totalDeContas + 1;
	}
	
	boolean saca( double qtd ) {
		if( this.saldo < qtd ) {
			return false;
		} else {
			this.saldo -= qtd;
			return true;
		}
	}
	
	boolean deposita( double qtd ) {
		if( qtd < 0 ) {
			return false;
		} else {
			this.saldo += qtd;
			return true;
		}
	}
	
	Cliente imprimeTitular() {
		return this.titular;
	}
	
	double devolveSaldo() {
		return this.saldo;
	}
	
	boolean transfere( Conta c, double qtd ) {
		if( this.saca(qtd) ) {
			c.deposita(qtd);
			return true;
		} else {
			return false;
		}
	}
}
