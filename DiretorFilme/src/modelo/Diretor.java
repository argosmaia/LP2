package modelo;

public class Diretor {
	public String nome;
	public String tempoExperiencia;
	public String localDeOrigem;
	
	public Diretor() {
		
	}

	public Diretor(String nome, String tempoExperiencia, String localDeOrigem) {
		this.nome = nome;
		this.tempoExperiencia = tempoExperiencia;
		this.localDeOrigem = localDeOrigem;
	}

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public String getTempoExperiencia() {
		return tempoExperiencia;
	}

	public void setTempoExperiencia(String tempoExperiencia) {
		this.tempoExperiencia = tempoExperiencia;
	}

	public String getLocalDeOrigem() {
		return localDeOrigem;
	}

	public void setLocalDeOrigem(String localDeOrigem) {
		this.localDeOrigem = localDeOrigem;
	}

	@Override
	public String toString() {
		return "Diretor\nNome: "+nome+"\nTempo de Experiencia: "+tempoExperiencia+"\nOrigem: "+localDeOrigem;
	}
}
