package pessoa;

public class Funcionario extends Pessoa {
	private Data admission;
	private double salario;
	
	public Funcionario(){
		
	}

	//OPÇÃO 1
	public Funcionario(String nome, String cpf, Data dataNasc) {
		super(nome, cpf, dataNasc);
		// TODO Auto-generated constructor stub
	}

	//OPÇÃO 2
	public Funcionario(String nome, String cpf, Data dataNasc, Data admission, double salario) {
		super(nome, cpf, dataNasc);
		this.admission = admission;
		this.salario = salario;
	}
	
	//OPÇÃO 3 - Caso a classe pessoa ja exista na main
	public Funcionario(Pessoa p, Data admission, double salario) {
		super(p.getNome(), p.getCpf(), p.getDataNasc());
		this.admission = admission;
		this.salario = salario;
	}

	public Data getAdmission() {
		return admission;
	}

	public void setAdmission(Data admission) {
		this.admission = admission;
	}

	public double getSalario() {
		return salario;
	}

	public void setSalario(double salario) {
		this.salario = salario;
	}

	@Override
	public String toString() {
		return super.toString()+"Funcionario\nData de admissão: "+admission+"\nSalario: "+salario;
	}
}
