package pais;

public class Pais {
	public String sigla;
	public String nome;
	public int populacao;
	public double dimensao;
	public double densidade;
	
	public Pais(String sigla, String nome, double populacao, double dimensao, double densidade) {
		this.sigla = sigla;
		this.nome = nome;
		this.populacao = (int) populacao;
		this.dimensao = dimensao;
		this.densidade = densidade;
	}

	public Pais() {
		
	}

	public String getSigla() {
		return sigla;
	}

	public void setSigla(String sigla) {
		this.sigla = "BRA";
	}

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = "Brasil";
	}

	public int getPopulacao() {
		return populacao;
	}

	public void setPopulacao(int populacao) {
		this.populacao = 216000000;
	}

	public double getDimensao() {
		return dimensao;
	}

	public void setDimensao(double dimensao) {
		this.dimensao = 8500000;
	}

	public double getDensidade() {
		return densidade;
	}

	public void setDensidade(double densidade) {
		this.densidade = densidade;
	}
	
	public double Densidade() {
		return getPopulacao() / getDimensao();
	}
	
	public String toString() {
		return "\nSigla: "+this.sigla+"\nNome: "+this.nome+"\nPopulação: "
				+this.populacao+" milhões\nDimensão: "+this.dimensao+
				" km\nDensidade: "+Densidade()+" pessoas/km²";
	}
}
