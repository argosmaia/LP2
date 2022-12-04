package maintriangulo;

import java.util.Arrays;
import java.util.Scanner;
import triangulo.Triangulo;

public class MainTriangulo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Triangulo[] triangulos = new Triangulo[2];
		
		int i = 0;
		
		for(i = 0; i < triangulos.length; i++) {
			triangulos[i] = new Triangulo();
			
			System.out.println("Digite os lados do triangulo: ");
			
			System.out.println("Lado 1: ");
			triangulos[i].setLado1(new Scanner(System.in).nextInt());
			
			System.out.println("Lado 2: ");
			triangulos[i].setLado2(new Scanner(System.in).nextInt());
			
			System.out.println("Lado 3: ");
			triangulos[i].setLado3(new Scanner(System.in).nextInt());
			i++;
		}
		System.out.println(Arrays.toString(triangulos));
		new Scanner(System.in).close();
	}
}
