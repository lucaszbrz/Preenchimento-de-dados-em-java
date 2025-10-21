package listadeatividades7;

import java.util.Scanner;

public class PautaMain {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Pauta aluno = null;
        int opcao;

        do {
            System.out.println("\n--------- MENU ---------");
            System.out.println("1. Cadastrar aluno");
            System.out.println("2. Mostrar todos os dados do aluno");
            System.out.println("3. Verificar se o aluno está reprovado por falta");
            System.out.println("4. Mostrar a média do aluno");
            System.out.println("5. Mostrar situação de aprovação ou reprovação");
            System.out.println("6. Finalizar operações");
            System.out.print("Escolha uma opção: ");
            opcao = sc.nextInt();
            sc.nextLine(); // Limpa o buffer

            switch (opcao) {
                case 1:
                    System.out.print("Informe a matrícula: ");
                    int matricula = sc.nextInt();
                    sc.nextLine(); // Limpa o buffer
                    System.out.print("Nome do aluno: ");
                    String nomeAluno = sc.nextLine();
                    System.out.print("Número de faltas: ");
                    int numFaltas = sc.nextInt();
                    System.out.print("Nota 1: ");
                    double nota1 = sc.nextDouble();
                    System.out.print("Nota 2: ");
                    double nota2 = sc.nextDouble();
                    aluno = new Pauta(matricula, nomeAluno, numFaltas, nota1, nota2);
                    System.out.println("Aluno cadastrado com sucesso.");
                    break;

                case 2:
                    if (aluno != null) {
                        System.out.println("\n--------- Dados do Aluno ---------");
                        System.out.println(aluno);
                    } else {
                        System.out.println("Preencha os dados do aluno primeiro.");
                    }
                    break;

                case 3:
                    if (aluno != null) {
                        System.out.println(aluno.verificarFaltas() ? "Reprovado por faltas." : "Não reprovado por falta.");
                    } else {
                        System.out.println("Preencha os dados do aluno primeiro.");
                    }
                    break;

                case 4:
                    if (aluno != null) {
                        System.out.printf("Média: %.2f\n", aluno.calcularMedia());
                    } else {
                        System.out.println("Preencha os dados do aluno primeiro.");
                    }
                    break;

                case 5:
                    if (aluno != null) {
                        System.out.println("Situação: " + aluno.verificarSituacao());
                    } else {
                        System.out.println("Preencha os dados do aluno primeiro.");
                    }
                    break;

                case 6:
                    System.out.println("Encerrando o programa. Até mais!");
                    break;

                default:
                    System.out.println("Escolha um número válido, por favor.");
            }

        } while (opcao != 6);

        sc.close();
    }
}
