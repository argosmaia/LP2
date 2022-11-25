package paciente;

public class Paciente {
	public int codigo;
	public String nome;
	public int cpf;
	public int telefone;
	
	public Paciente() {
		
	}

	public Paciente(int codigo, String nome, int cpf, int telefone) {
		this.codigo = codigo;
		this.nome = nome;
		this.cpf = cpf;
		this.telefone = telefone;
	}

	public int getCodigo() {
		return codigo;
	}

	public void setCodigo(int codigo) {
		this.codigo = codigo;
	}

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public int getCpf() {
		return cpf;
	}

	public void setCpf(int cpf) {
		this.cpf = cpf;
	}

	public int getTelefone() {
		return telefone;
	}

	public void setTelefone(int telefone) {
		this.telefone = telefone;
	}
	
	public boolean igual(int code) {
		if(getCodigo() == code) {
			return true;
		}else{
			return false;
		}
	}
	
	public String toString() {
		return "Paciente [codigo = "+codigo +", nome = " + nome + ", cpf = " + cpf + ", telefone = " + telefone
				+"]";
	}
	
}
