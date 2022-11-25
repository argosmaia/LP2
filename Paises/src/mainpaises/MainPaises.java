package mainpaises;

import java.util.Arrays;
import java.util.Scanner;

import pais.Pais;

public class MainPaises {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Quantos países? ");
		int n = sc.nextInt();
		
		Pais[] paises = new Pais[n];
		
		for(int i = 0; i < paises.length; i++) {
			paises[i] = new Pais();
			System.out.println("Digite a sigla: ");
			paises[i].setSigla(sc.next().toUpperCase());
			System.out.println("Digite o nome: ");
			paises[i].setNome(sc.next());
			System.out.println("Digite o tamanho da população: ");
			paises[i].setPopulacao(sc.nextInt());
			System.out.println("Digite o tamanho do país: ");
			paises[i].setDimensao(sc.nextDouble());
		}
		
		System.out.println("Dados dos países"+Arrays.toString(paises));
		
		sc.close();	
	}
}
