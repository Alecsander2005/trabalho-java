package trabalho_maelson;

import java.util.ArrayList;
import java.util.Arrays;


public class FolhaFuncionarios {
    private ArrayList<Funcionario> funcionariosAtivos;

    public FolhaFuncionarios() {
        funcionariosAtivos = new ArrayList<>();
    }

    // Método para adicionar um funcionário à folha
    public void adicionarFuncionario(Funcionario funcionario) {
        funcionariosAtivos.add(funcionario);
    }

    // Getter para acessar a lista de funcionários ativos, se necessário
    public ArrayList<Funcionario> getFuncionariosAtivos() {
        return funcionariosAtivos;
    }

    // Método para exibir a folha de pagamento
    public void exibirFolhaDePagamento() {
        if (funcionariosAtivos.isEmpty()) {
            System.out.println("Nenhum funcionário na folha de pagamento.");
            return;
        }

        System.out.println("=== Folha de Pagamento ===");
        double total = 0;
        for (Funcionario f : funcionariosAtivos) {
            System.out.println(f);
            total += f.getSalario();
        }
        System.out.println("Total da folha: R$ " + total);
    }
}
