public abstract class funcionario {
    private String nome;
    private double salario;

    public funcionario(String nome, double salario) {
        this.nome = nome;
        this.salario = salario;
    }

    public abstract void trabalhar();

    public String getNome() {
        return nome;
    }

    public double getSalario() {
        return salario;
    }

    public void setSalario(double salario) {
        this.salario = salario;
    }
}
