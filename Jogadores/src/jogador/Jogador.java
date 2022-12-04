package jogador;

/* 
 	2. Crie uma classe para representar um jogador de futebol, com os
	atributos nome, posição, nacionalidade, altura e peso. 
	
	Crie os métodos de acesso aos atributos (setters e getters) e também um método para imprimir
	todos os dados do jogador. 
	
	Além disso, defina um método para calcular o IMC do jogador. Em seguida, crie uma classe com o método main 
	utilizando array de objetos para armazenar os dados de até 40 jogadores, de acordo
	com o desejo do usuário. 
	
	Ao final, o programa deve exibir todos os dados
	dos jogadores, bem como o IMC de cada um deles.
*/

public class Jogador {
	public String nome;
	public String posicao;
	public String nacionalidade;
	public double altura;
	public double peso;
	
	public Jogador() {
		
	}

	public Jogador(String nome, String posicao, String nacionalidade, double altura, double peso) {
		this.nome = nome;
		this.posicao = posicao;
		this.nacionalidade = nacionalidade;
		this.altura = altura;
		this.peso = peso;
	}

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public String getPosicao() {
		return posicao;
	}

	public void setPosicao(String posicao) {
		this.posicao = posicao;
	}

	public String getNacionalidade() {
		return nacionalidade;
	}

	public void setNacionalidade(String nacionalidade) {
		this.nacionalidade = nacionalidade;
	}

	public double getAltura() {
		return altura;
	}

	public void setAltura(double altura) {
		this.altura = altura;
	}

	public double getPeso() {
		return peso;
	}

	public void setPeso(double peso) {
		this.peso = peso;
	}
	
	public double IMC() {
		return getPeso() / (getAltura()*getAltura());
	}
	
	public String RespIMC(double peso, double altura) {
		if( (peso/(altura*altura)) >= 0 && (peso/(altura*altura)) <= 18.59) {
			return "Abaixo do Peso";
		
		}else if( (peso/(altura*altura)) >= 18.6 && (peso/(altura*altura)) < 24.99) {
			return "Peso Ideal";
			
		}else if( (peso/(altura*altura)) >= 25 && (peso/(altura*altura)) <= 29.99) {
			return "Sobrepeso";
			
		}else if( (peso/(altura*altura)) >= 30 && (peso/(altura*altura)) <= 34.99) {
			return "Obesidade grau I";
			
		}else if( (peso/(altura*altura)) >= 35 && (peso/(altura*altura)) <= 39.99) {
			return "Obesidade grau II - Severa";
			
		}else {
			return "Obesidade grau III - Mórbida";
		}
	}

	@Override
	public String toString() {
		return "Jogador: "+nome+"\nPosicao: "+posicao+"\nNacionalidade: "+nacionalidade+"\nAltura: "
				+altura+"m\nPeso: "+peso+"kg\nIMC: " + IMC()*10000+"kg/m²";
	}
}
