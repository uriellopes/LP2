package aula2;

public class Conta {
	int numero;
	String titular;
	double saldo;
	
	boolean saca( double quantidade ) {
		if( this.saldo > quantidade ) {
			this.saldo -= quantidade;
			return true;
		} else {
			return false;
		}
	}
	
	void deposita( double quantidade ) {
		this.saldo += quantidade;
	}
	
	String imprimeTitular() {
		return "Titular da conta: " + this.titular;
	}
	
	boolean transferir( Conta outraConta, double quantidade ) {
		if( this.saca(quantidade) ) {
			outraConta.deposita(quantidade);
			return true;
		} else {
			return false;
		}
	}
}
