package exe0;

public class Diretor extends Funcionario{
    private float acoesEmpresa;

    public Diretor(){
        super();
    }

    public Diretor(String nome, String endereco, String cpf, float salario, float acoesEmpresa) {
        super(nome, endereco, cpf, salario);
        this.acoesEmpresa = acoesEmpresa;
    }

    public float getAcoesEmpresa() {
        return acoesEmpresa;
    }

    public void setAcoesEmpresa(float acoesEmpresa) {
        this.acoesEmpresa = acoesEmpresa;
    }
    @Override
    public float calculaSalario(){
        return super.calculaSalario() + (6.5f * acoesEmpresa)/12;//Mensal
    }

    @Override
    public String toString() {
        return "Diretor{" + "acoesEmpresa=" + acoesEmpresa +
                super.toString() + '}';
    }
}
