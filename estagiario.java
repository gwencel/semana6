public class estagiario extends funcionario implements bonificavel {

    public estagiario(String nome, double salario) {
        super(nome, salario);
    }

    @Override
    public void trabalhar() {
        System.out.println(getNome() + " está auxiliando nas tarefas.");
    }

    @Override
    public double calcularBonus() {
        return getSalario() * 0.05;
    }
}
