public class Estagiario extends Funcionario {

    public Estagiario(String nome, double salarioBase) {
        super(nome, salarioBase);
    }

    @Override
    public void calcularSalario() {
        System.out.println("Bolsa-auxílio do Estagiário " + nome + ": R$ " + salarioBase);
    }

    
    public void calcularSalario(double auxilioExtra) {
        double total = salarioBase + auxilioExtra;
        System.out.println("Total Estagiário " + nome + " (Bolsa + Auxílio): R$ " + total);
    }
}