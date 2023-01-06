package main;

import modelo.Poupanca;

public class Banco {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Poupanca p1 = new Poupanca(0);
		p1.depositar(1000);
		System.out.println(p1);
		p1.sacar(100);
		System.out.println(p1);
	}
}
