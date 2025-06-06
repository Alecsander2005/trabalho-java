package trabalho_maelson;

import java.util.ArrayList;

public class ControladorFuncionario {
    private ArrayList<Funcionario> listaFuncionarios;

    public ControladorFuncionario() {
        listaFuncionarios = new ArrayList<>();
    }

    // Adiciona um novo funcionário à lista
    public void adicionarFuncionario(Funcionario funcionario) {
        listaFuncionarios.add(funcionario);
    }

    // Remove um funcionário pelo nome
    public void demitirFuncionario(String nome) {
        Funcionario funcionario = buscarFuncionario(nome);
        if (funcionario != null) {
            listaFuncionarios.remove(funcionario);
            System.out.println("Funcionário demitido com sucesso.");
        } else {
            System.out.println("Funcionário não encontrado.");
        }
    }

    // Lista todos os funcionários
    public void listarFuncionarios() {
        if (listaFuncionarios.isEmpty()) {
            System.out.println("Nenhum funcionário cadastrado.");
        } else {
            System.out.println("=== Lista de Funcionários ===");
            for (Funcionario f : listaFuncionarios) {
                System.out.println(f);
            }
        }
    }

    // Busca um funcionário pelo nome
    public Funcionario buscarFuncionario(String nome) {
        for (Funcionario f : listaFuncionarios) {
            if (f.getNome().equalsIgnoreCase(nome)) {
                return f;
            }
        }
        return null;
    }

    // Exibe a folha de pagamento
    public void exibirFolhaDePagamento() {
        if (listaFuncionarios.isEmpty()) {
            System.out.println("Nenhum funcionário para exibir na folha de pagamento.");
            return;
        }

        System.out.println("=== Folha de Pagamento ===");
        double total = 0.0;
        for (Funcionario f : listaFuncionarios) {
            System.out.println("Nome: " + f.getNome() + " | Cargo: " + f.getCargo() + " | Salário Base: R$ " + f.getSalario() + "| Descontos: " + f.getDescontoINSS() + "| Horas Extras: "+ f.getValorHorasExtras()   + " | Salario Final: " + f.calcularSalarioFinal());
            total += f.calcularSalarioFinal();
        }
        System.out.println("Total da folha: R$ " + total);
    }
}

