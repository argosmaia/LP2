package modelo;
//ARGOS A MAIA
public class Diretor {
	public String nome;
	public int tempoExperiencia;
	public String localDeOrigem;

	public Diretor(String nome, int tempoExperiencia, String localDeOrigem) {
		this.nome = nome;
		this.tempoExperiencia = tempoExperiencia;
		this.localDeOrigem = localDeOrigem;
	}

	public Diretor() {
		// TODO Auto-generated constructor stub
	}

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public int getTempoExperiencia() {
		return tempoExperiencia;
	}

	public void setTempoExperiencia(int tempoExperiencia) {
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
		return "\nDiretor\nNome: "+nome+"\nTempo de Experiencia: "+tempoExperiencia+"\nOrigem: "+localDeOrigem+"\n";
	}
}
