import paciente.Paciente;

public class CadastroPaciente {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		
		int n, op, cod; 
		
		System.out.println("Digite um inteiro: ");
		n = sc.nextInt();
		
		Paciente[] pacientes = new Paciente[n];
		
		System.out.println("\n1 - Cadastrar\n2 - Buscar código\n3 - Exibir dados do paciente\n4 - Sair");
		op = sc.nextInt();
		switch(op) {
			case 1:
				for(int i = 0; i < pacientes.length; i++) {
					System.out.println("Código: ");
					pacientes[i].setCodigo(getCodigo(sc.nextInt()));
					
					System.out.println("Nome: ");
					pacientes[i].setNome(sc.nextLine());
					
					System.out.println("CPF: ");
					pacientes[i].setCpf(sc.nextInt());
					
					System.out.println("Telefone: ");
					pacientes[i].setTelefone(sc.nextInt());
				}
				break;
			
			case 2:
				cod = sc.nextInt();
				
		        for(int i = 0; i < pacientes.length; i++) {
		        	
		            // caso o código do paciente exista
		            if(pacientes[i].equals(cod)){
		                System.out.println("O paciente procurado é "+pacientes[i]);
		            
		            // se não existir...    
		            } else if(i == pacientes.length - 1){
		                System.out.println("Paciente nao encontrado! ");
		            }
		        }
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

	private static int getCodigo(int nextInt) {
		// TODO Auto-generated method stub
		return 0;
	}

}
