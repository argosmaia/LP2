package modelo;

public class Filme {
	public String titulo;
	public String descricao;
	public Diretor diretor;
	public int duracaoEmMinutos;
	
	public Filme() {
		
	}

	public Filme(String nome, String tempoExperiencia, String localDeOrigem, String titulo, String descricao, Diretor diretor, int duracaoEmMinutos) {
		this.titulo = titulo;
		this.descricao = descricao;
		diretor = new Diretor(nome, tempoExperiencia, localDeOrigem);
		this.duracaoEmMinutos = duracaoEmMinutos;
	}

	public String getTitulo() {
		return titulo;
	}

	public void setTitulo(String titulo) {
		this.titulo = titulo;
	}

	public String getDescricao() {
		return descricao;
	}

	public void setDescricao(String descricao) {
		this.descricao = descricao;
	}

	public Diretor getDiretor() {
		return diretor;
	}

	public void setDiretor(Diretor diretor) {
		this.diretor = diretor;
	}

	public int getDuracaoEmMinutos() {
		return duracaoEmMinutos;
	}

	public void setDuracaoEmMinutos(int duracaoEmMinutos) {
		this.duracaoEmMinutos = duracaoEmMinutos;
	}

	@Override
	public String toString() {
		return "Filme\nTitulo: "+titulo+"\nDescricao: "+descricao+"\nDuracao em Minutos: "+duracaoEmMinutos+"\nDiretor: "+diretor;
	}
}
