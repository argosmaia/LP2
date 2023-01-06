package modelo;

public class ContaCorrente implements Conta {
	private double saldo;
	private double limite;
	
	public ContaCorrente(double saldo, double limite) {
		this.saldo = saldo;
		this.limite = limite;
	}

	public double getLimite() {
		return limite;
	}

	public void setLimite(double limite) {
		this.limite = limite;
	}

	public void setSaldo(double saldo) {
		this.saldo = saldo;
	}

	@Override
	public void depositar(double valor) {
		// TODO Auto-generated method stub
		saldo += valor;
	}

	@Override
	public void sacar(double sacar) {
		// TODO Auto-generated method stub
		if(limite > 0) {
			saldo -= sacar;
		}
	}

	@Override
	public double getSaldo() {
		// TODO Auto-generated method stub
		return saldo;
	}

	@Override
	public String toString() {
		return "Conta Corrente:\nSaldo R$" + saldo + "\nLimite R$ " + limite;
	}

}
