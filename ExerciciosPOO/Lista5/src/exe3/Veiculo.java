package exe3;

public abstract class Veiculo {
    protected String modelo;

    public Veiculo(String modelo) {
        this.modelo = modelo;
    }

    public Veiculo(){
    }
    public void exibirModelo(){
        System.out.println("Modelo: " + this.modelo);
    }
    public abstract void mover();
}

