package empresa;

public class Empresa {
	String nome;
	String cnpj;
	String endereco;
	String cidade;
	String estado;
	String telefone;
	int funcionarios;
	
	public Empresa() {
		
	}

	public Empresa(String nome, String cnpj, String endereco, String cidade, String estado, String telefone,
			int funcionarios) {
		this.nome = nome;
		this.cnpj = cnpj;
		this.endereco = endereco;
		this.cidade = cidade;
		this.estado = estado;
		this.telefone = telefone;
		this.funcionarios = funcionarios;
	}

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public String getCnpj() {
		return cnpj;
	}

	public void setCnpj(String cnpj) {
		this.cnpj = cnpj;
	}

	public String getEndereco() {
		return endereco;
	}

	public void setEndereco(String endereco) {
		this.endereco = endereco;
	}

	public String getCidade() {
		return cidade;
	}

	public void setCidade(String cidade) {
		this.cidade = cidade;
	}

	public String getEstado() {
		return estado;
	}

	public void setEstado(String estado) {
		this.estado = estado;
	}

	public String getTelefone() {
		return telefone;
	}

	public void setTelefone(String telefone) {
		this.telefone = telefone;
	}

	public int getFuncionarios() {
		return funcionarios;
	}

	public void setFuncionarios(int funcionarios) {
		this.funcionarios = funcionarios;
	}
	
	public boolean igual(String nome) {
		return this.nome.equalsIgnoreCase(nome);
	}
	
	public int comparaValor(int valor) {
		if(funcionarios > valor) {
			return funcionarios;
		}else {
			return valor;
		}
	}

	@Override
	public String toString() {
		return "Dados da Empresa:\nNome: "+nome+"\nCNPJ: "+cnpj+"\nEndereco: "+endereco+"\nCidade: "+cidade+
				"\nEstado: "+estado+"\nTelefone: "+telefone+"\nFuncionarios: "+funcionarios;
	}
}
