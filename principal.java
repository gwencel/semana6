public class principal {
    public static void main(String[] args) {
        funcionario gerente = new gerente("Gabriel", 8000.0);
        funcionario estagiario = new estagiario("Gerson", 1500.0);

        gerente.trabalhar();
        estagiario.trabalhar();

        bonificavel b1 = (bonificavel) gerente;
        bonificavel b2 = (bonificavel) estagiario;

        System.out.println("Bônus do " + gerente.getNome() + ": R$ " + b1.calcularBonus());
        System.out.println("Bônus do " + estagiario.getNome() + ": R$ " + b2.calcularBonus());
    }
}
