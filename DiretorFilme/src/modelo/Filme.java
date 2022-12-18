package modelo;

public class Filme {
	public String titulo;
	public String descricao;
	public int duracaoEmMinutos;
	
	private Diretor diretor;
	
	public Filme() {
		
	}
	
	public Filme(String nome, int tempoExperiencia, String localDeOrigem, String titulo, String descricao, Diretor diretor, int duracaoEmMinutos) {
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

	public int getDuracaoEmMinutos() {
		return duracaoEmMinutos;
	}

	public void setDuracaoEmMinutos(int duracaoEmMinutos) {
		this.duracaoEmMinutos = duracaoEmMinutos;
	}
		
	public Diretor getDiretor() {
		return diretor;
	}

	public void setDiretor(Diretor diretor) {
		this.diretor = diretor;
	}

	public boolean retornaNome(String titulo) {
		return this.titulo.equalsIgnoreCase(titulo);
	}
	
	public String exibirDuracaoEmHoras() {
		int horas = duracaoEmMinutos / 60;
		int minutos = duracaoEmMinutos % 60;
		return horas+" horas e "+minutos+" minutos de duracao";
	}

	@Override
	public String toString() {
		return "Filme\nTitulo: "+titulo+"\nDescricao: "+descricao+"\nO titulo possui : "+exibirDuracaoEmHoras()+"\nDitretor: "+diretor;
	}
}
