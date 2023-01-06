package modelo;

public class Poupanca implements Conta {
	private double saldo;
	
	public Poupanca(double saldo) {
		this.saldo = saldo;
	}

	public void setSaldo(double saldo) {
		this.saldo = saldo;
	}
	
	@Override
	public double getSaldo() {
		// TODO Auto-generated method stub
		return saldo;
	}

	@Override
	public void depositar(double valor) {
		// TODO Auto-generated method stub
		saldo += valor;
	}

	@Override
	public void sacar(double sacar) {
		// TODO Auto-generated method stub
		if(saldo >= sacar) {
			saldo -= sacar;
		}
	}

	@Override
	public String toString() {
		return "Saldo\nR$ "+saldo;
	}

}
