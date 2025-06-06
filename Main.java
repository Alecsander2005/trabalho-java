package trabalho_maelson;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        ControladorFuncionario controlador = new ControladorFuncionario();
        Scanner scanner = new Scanner(System.in);

        int opcao;
        do {
            System.out.println("\n=== MENU DE FUNCIONALIDADES ===");
            System.out.println("1 - Adicionar funcionário");
            System.out.println("2 - Demitir funcionário");
            System.out.println("3 - Mostrar folha de pagamento");
            System.out.println("4 - Listar todos os funcionários");
            System.out.println("5 - Buscar funcionário por nome");
            System.out.println("0 - Sair");
            System.out.print("Escolha uma opção: ");
            opcao = scanner.nextInt();
            scanner.nextLine(); // Limpa o buffer

            switch (opcao) {
                case 1:
                    adicionarFuncionario(controlador, scanner);
                    break;
                case 2:
                    demitirFuncionario(controlador, scanner);
                    break;
                case 3:
                    controlador.exibirFolhaDePagamento();
                    break;
                case 4:
                    controlador.listarFuncionarios();
                    break;
                case 5:
                    buscarFuncionario(controlador, scanner);
                    break;
                case 0:
                    System.out.println("Encerrando o programa...");
                    break;
                default:
                    System.out.println("Opção inválida!");
            }
        } while (opcao != 0);

        scanner.close();
    }

    private static void adicionarFuncionario(ControladorFuncionario controlador, Scanner scanner) {
        System.out.print("Nome: ");
        String nome = scanner.nextLine();
        System.out.print("Cargo: ");
        String cargo = scanner.nextLine();
        System.out.print("Setor: ");
        String setor = scanner.nextLine();
        System.out.print("Salário Base: ");
        double salario = scanner.nextDouble();
        System.out.print("Horas Extras (quantidade de horas): ");
        int horasExtras = scanner.nextInt();
        scanner.nextLine(); // limpar buffer

        Funcionario f = new Funcionario(nome, cargo, salario, setor, horasExtras);
        controlador.adicionarFuncionario(f);
        System.out.println("Funcionário adicionado com sucesso!");
    }


    private static void demitirFuncionario(ControladorFuncionario controlador, Scanner scanner) {
        System.out.print("Nome do funcionário a demitir: ");
        String nome = scanner.nextLine();
        controlador.demitirFuncionario(nome);
    }

    private static void buscarFuncionario(ControladorFuncionario controlador, Scanner scanner) {
        System.out.print("Nome do funcionário a buscar: ");
        String nome = scanner.nextLine();
        Funcionario f = controlador.buscarFuncionario(nome);
        if (f != null) {
            System.out.println("Funcionário encontrado:\n" + f);
        } else {
            System.out.println("Funcionário não encontrado.");
        }
    }
}
