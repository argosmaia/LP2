package pessoa;

public class Pessoa {
	private String nome;
	private String cpf;
	private Data dataNasc;
	
	public Pessoa(String nome, String cpf, Data dataNasc) {
		this.nome = nome;
		this.cpf = cpf;
		this.dataNasc = dataNasc;
	}
	
	public Pessoa() {
		
	}

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public String getCpf() {
		return cpf;
	}

	public void setCpf(String cpf) {
		this.cpf = cpf;
	}

	public Data getDataNasc() {
		return dataNasc;
	}

	public void setDataNasc(Data dataNasc) {
		this.dataNasc = dataNasc;
	}

	@Override
	public String toString() {
		return "\nNome: " + nome + "\nCPF: " + cpf + "\nData de Nascimento: " + dataNasc;
	}
}
