package demoempresa;

import java.util.ArrayList;
import java.util.Scanner;
import empresa.Empresa;

public class DemoEmpresa {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		ArrayList<Empresa> empresas = new ArrayList<Empresa>();
		
		Empresa empresa;
		
		int i = 0, aux = 0, op;
		
		while(true) {
			empresa = new Empresa(); 
			
			System.out.println("1 - Cadastrar dados da empresa:\n2 - Visualizar:\n3 - Procurar empresa por qtd de funcionário:\n");
			op = sc.nextInt();
			
			switch(op) {
				case 1:
					
					System.out.println("Nome da empresa: ");
					empresa.setNome(sc.next());
					
					System.out.println("Digite o CNPJ da Empresa: ");
					empresa.setCnpj(sc.next());
					
					System.out.println("Digite o endereço da Empresa: ");
					empresa.setEndereco(sc.next());
					
					System.out.println("Digite a cidade da Empresa: ");
					empresa.setCidade(sc.next());
					
					System.out.println("Digite o Estado da Empresa: ");
					empresa.setEstado(sc.next());
					
					System.out.println("Digite o telefone da Empresa: ");
					empresa.setTelefone(sc.next());
					
					System.out.println("Digite a quantidade de funcionários da Empresa: ");
					empresa.setFuncionarios(sc.nextInt());
										
					empresas.add(empresa);
					
				break;
				
				case 2:
					System.out.println("Mostrando empresa: ");
					for(i = 0; i < empresas.size(); i++) {
						System.out.println(empresas.get(i).toString());
					}
					break;
				
				case 3:
					System.out.println("Insira um valor");
					if(empresas.get(i).getFuncionarios() == aux) {
						System.out.println("\nEmpresa(s) com mais funcionários: \n");
						System.out.println(empresas.get(i).toString());
					}
				
				case 4:
					System.exit(0);
				
				default:
					System.out.println("Opcao inválida");
			}
		}
	}
}
