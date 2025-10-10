package exe1;
public abstract class Funcionario {
    protected String nome;
    protected double salarioBase;

    public Funcionario() {
    }

    public Funcionario(String nome, double salarioBase) {
        this.salarioBase = salarioBase;
        this.nome = nome;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public double getSalarioBase() {
        return salarioBase;
    }

    public void setSalarioBase(double salarioBase) {
        this.salarioBase = salarioBase;
    }

    public abstract double calcularSalario(); //Não pode implementar no funcionário, sendo que eu não sei qual funcionário que é.

    @Override
    public String toString() {
        return "Funcionario{" +
                "nome='" + nome + '\'' +
                ", salarioBase=" + salarioBase +
                ", salário final=" + calcularSalario() +
                '}';
    }
}
