package cadastrojogador;

import java.util.Arrays;
import java.util.Scanner;

import jogador.Jogador;

public class Time {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		int n;
		System.out.println("QTD de elementos no vetor: ");
		n = sc.nextInt();
		
		Jogador[] jogadores = new Jogador[n];
		
		for(int i = 0; i < jogadores.length; i++)
		{
			jogadores[i] = new Jogador();
			System.out.println("Digite o nome do Jogador: ");
			jogadores[i].setNome(sc.next());
			
			System.out.println("Digite a posição do Jogador: ");
			jogadores[i].setPosicao(sc.next().toUpperCase());
			
			System.out.println("Digite a nacionalidade do Jogador: ");
			jogadores[i].setNacionalidade(sc.next().toUpperCase());
			
			System.out.println("Digite a altura do Jogador: ");
			jogadores[i].setAltura(sc.nextDouble());
			
			System.out.println("Digite o Peso do Jogador: ");
			jogadores[i].setPeso(sc.nextDouble());
		}
		System.out.println("DADOS DOS JOGADORES");
		System.out.println(Arrays.toString(jogadores));
		sc.close();
	}

}
