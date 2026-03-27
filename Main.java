public class Main {
    public static void main(String[] args) {
        Gerente g1 = new Gerente("Matheus", 5000.0);
        Estagiario e1 = new Estagiario("Ryan", 1500.0);

        System.out.println("--- Teste Gerente ---");
        g1.calcularSalario();          
        g1.calcularSalario(1000.0);     

        System.out.println("\n--- Teste Estagiário ---");
        e1.calcularSalario();            
        e1.calcularSalario(200.0);       
    }
}