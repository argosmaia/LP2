package turma;
import java.util.ArrayList;
import java.util.Scanner;
import aluno.Aluno;

/*Escreva uma classe que represente um aluno de um curso X. Os dados do aluno são:
matrícula, nome, nota1, nota2 e média. Escreva a classe em Java contendo:
a) Construtor padrão e outro com a matrícula, nome, nota1 e nota2;
b) Métodos de acesso (getter/setter);
c) Um método que retorne a média do aluno(deve ser utilizado no construtor);
d) Um método para comparação de dois nomes, retornando o resultado da comparação;
e) Um método que permita exibir os dados aluno.
Em seguida, você deve criar a classe MainTurma que cria uma lista de alunos e permita:
1- Cadastrar um aluno;
2- Buscar um aluno pelo nome;
3- Exibir a lista de alunos;
4- Calcular a média da turma;
5- Sair;*/

public class MainTurma {
    public static void main(String[] args){
        String nome;
        int n, op;
        Scanner sc = new Scanner(System.in);
        System.out.println("Digite a qtd de vetores: ");
        n = sc.nextInt();
        ArrayList <Aluno> alunoslista = new ArrayList <Aluno>();
        Aluno[] alunos = new Aluno[n];

        while(1){
            System.out.println("\n1- Cadastrar um aluno; "
				+ "\n2- Buscar um aluno pelo nome; "
				+ "\n3- Exibir a lista de alunos; "
				+ "\n4- Calcular a média da turma; "
				+ "\n5- Sair; ");
            op = sc.nextInt();
            switch(op){
   		    }
                break;

                case 4: 
                    for(int j=0; j<alunosLista.size(); j++) {
					    soma = soma + alunos[j].calcMedia();
                    }
                break;

                default:
                    System.out.println("\nOpção errada seu arrombado, preste atenção");
                break;
            }
        }
    }
}             case 1: 
                    alunos[i] = new Aluno();
				
				    System.out.println("Digite a matrícula do Aluno: ");
				    alunos[i].setMatricula(scan.next());
				    scan.next();

				    System.out.println("Digite o nome do Aluno: ");
				    alunos[i].setNome(scan.next());

				    System.out.println("Digite a primeira nota do Aluno: ");
				    alunos[i].setNota1(scan.nextDouble());

				    System.out.println("Digite a segunda nota do Aluno: ");
				    }
                break;

                case 4: 
                    for(int j=0; j<alunosLista.size(); j++) {
					    soma = soma + alunos[j].calcMedia();
                    }
                break;

                default:
                    System.out.println("\nOpção errada seu arrombado, preste atenção");
                break;
            }
        }
    }
}		    alunos[i].setNota2(scan.nextDouble());
				
				    alunosLista.add(alunos[i]);
				    i++;
                break;

                case 2:
                    System.out.println("Digite o nome que queira procurar: ");
                    nome = scan.next();
                    for(int j = 0; j < alunoslista.size(); j++) {
                        if(alunos[j].comparaNome(nome)) {
                            System.out.println(alunos[j].toString());
                        }
                    }
                break;

                case 3:
                    for(int j=0; j<alunosLista.size(); j++) {
					    System.out.println(Arrays.alunosLista.get(j).toString());
				    }
                break;

                case 4: 
                    for(int j=0; j<alunosLista.size(); j++) {
					    soma = soma + alunos[j].calcMedia();
                    }
                break;

                default:
                    System.out.println("\nOpção errada seu arrombado, preste atenção");
                break;
            }
        }
    }
}
