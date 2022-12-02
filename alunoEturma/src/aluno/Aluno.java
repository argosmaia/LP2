package aluno;

public class Aluno {
	public String matricula;
	public String nome;
	public double nota1;
	public double nota2;
	public double media;
	
	public Aluno() {
		
	}

	public Aluno(String matricula, String nome, double nota1, double nota2) {
		this.matricula = matricula;
		this.nome = nome;
		this.nota1 = nota1;
		this.nota2 = nota2;
		this.media = this.Media();
	}

	public String getMatricula() {
		return matricula;
	}

	public void setMatricula(String matricula) {
		this.matricula = matricula;
	}

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public double getNota1() {
		return nota1;
	}

	public void setNota1(double nota1) {
		this.nota1 = nota1;
	}

	public double getNota2() {
		return nota2;
	}

	public void setNota2(double nota2) {
		this.nota2 = nota2;
	}
	
	public double getMedia() {
		return media;
	}

	public void setMedia(double media){
		this.media;
	}

	public double Media() {
		return((nota1+nota2)/2);
	}
	
	public boolean Compara(String nome) {
		return this.nome.equalsIgnoreCase(nome);
	}
	
	@Override
	public String toString() {
		return "Aluno: \nMatricula = " + matricula + "\nNome = " + nome + "\nNota1 = " + nota1 + ",\nNota2 = " + nota2;
	}
}

