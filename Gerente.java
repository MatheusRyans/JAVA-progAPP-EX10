public class Gerente extends Funcionario {
    
    public Gerente(String nome, double salarioBase) {
        super(nome, salarioBase);
    }

    @Override
    public void calcularSalario() {
        double total = salarioBase * 1.20; // 20% de gratificação
        System.out.println("Salário do Gerente " + nome + " (com 20% fixo): R$ " + total);
    }

   
    public void calcularSalario(double bonus) {
        double total = (salarioBase * 1.20) + bonus;
        System.out.println("Salário do Gerente " + nome + " + Bônus de R$" + bonus + ": R$ " + total);
    }
}