public class Funcionario {
    String nome;
    double salarioBase;

    public Funcionario(String nome, double salarioBase) {
        this.nome = nome;
        this.salarioBase = salarioBase;
    }

    public void calcularSalario() {
        System.out.println("Salário de " + nome + ": R$ " + salarioBase);
    }
}