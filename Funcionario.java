package trabalho_maelson;

public class Funcionario {
    private String nome;
    private String cargo;
    private double salario;
    private String setor;
    private int horasExtras;

    private static final double VALOR_HORA_EXTRA = 25.0;
    private static final double PORCENTAGEM_INSS = 0.075; // 7,5%

    public Funcionario(String nome, String cargo, double salario, String setor, int horasExtras) {
        this.nome = nome;
        this.cargo = cargo;
        this.salario = salario;
        this.setor = setor;
        this.horasExtras = horasExtras;
    }

    public String getNome() { return nome; }
    public String getCargo() { return cargo; }
    public double getSalario() { return salario; }
    public String getSetor() { return setor; }
    public int getHorasExtras() { return horasExtras; }

    public double getValorHorasExtras() {
        return horasExtras * VALOR_HORA_EXTRA;
    }

    public double getDescontoINSS() {
        return salario * PORCENTAGEM_INSS;
    }

    public double calcularSalarioFinal() {
        return salario + getValorHorasExtras() - getDescontoINSS();
    }

    @Override
    public String toString() {
        return "Nome: " + nome +
               ", Cargo: " + cargo +
               ", Setor: " + setor +
               ", Salário Base: R$ " + salario +
               ", Horas Extras: " + horasExtras + "h (R$ " + getValorHorasExtras() + ")" +
               ", INSS: R$ " + getDescontoINSS() +
               ", Salário Final: R$ " + calcularSalarioFinal();
    }
}

	   
	

