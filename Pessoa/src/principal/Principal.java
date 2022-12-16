package principal;

import pessoa.Data;
import pessoa.Funcionario;
import pessoa.Pessoa;

public class Principal {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Pessoa p1, p2;
		Funcionario f1, f2;
		
		p1 = new Pessoa("Ana", "2225412", new Data(29, 12, 1986));
		System.out.println(p1);
		
		f1 = new Funcionario(p1, new Data(9, 12, 2013), 4000);
		System.out.println(f1);
		
		p2 = new Pessoa("Joana", "2225", new Data(11, 11, 1996));
		System.out.println(p2);
		
		f2 = new Funcionario(p2, new Data(19, 11, 2020), 4000);
		System.out.println(f2);
		
	}

}
