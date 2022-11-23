package cadastropaciente;

import java.util.Scanner;

import paciente.Paciente;

public class CadastroPaciente {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		
		int n, op; 
		
		System.out.println("Digite um inteiro: ");
		n = sc.nextInt();
		
		Paciente[] pacientes = new Paciente[n];
		
		System.out.println("\n1 - Cadastrar\n2 - Buscar código\n3 - Exibir dados do paciente\n4 - Sair");
		op = sc.nextInt();
		switch(op) {
			case 1:
				for(int i = 0; i < pacientes.length; i++) {
					pacientes[i].setCodigo(sc.nextInt());
					pacientes[i].setNome(sc.nextLine());
					pacientes[i].setCpf(sc.nextInt());
					pacientes[i].setTelefone(sc.nextInt());
				}
				break;
			
			case 2:
				break;
			
			case 3:
				System.out.println("Dados do paciente: ");
				for(int i = 0; i < pacientes.length; i++) {
					System.out.println("Paciente: "+(i+1)+": ");
					System.out.println(pacientes[i]);
				}
				break;
				
			case 4:
				System.out.println("SAINDO...");
				System.exit(0);
				break;
		}
		
		sc.close();
	}

}
