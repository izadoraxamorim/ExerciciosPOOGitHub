package exe0;

public class Gerente extends Funcionario {
    private float bonus;

    public Gerente(){
        super();
    }

    public Gerente(String nome, String endereco, String cpf, float salario, float bonus) {
        super(nome, endereco, cpf, salario);
        this.bonus = bonus;
    }

    public float getBonus() {
        return bonus;
    }

    public void setBonus(float bonus) {
        this.bonus = bonus;
    }
    @Override
    public float calculaSalario(){
        return super.calculaSalario() + bonus;
    }

    @Override
    public String toString() {
        return "Gerente{" + "bonus=" + bonus +
                super.toString() + '}';
    }
}
