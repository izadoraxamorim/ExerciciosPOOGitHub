package exe3;

public class CarroEletrico extends Veiculo implements Eletrico {

    public CarroEletrico() {
    }

    public CarroEletrico(String modelo) {
        super(modelo);
    }

    @Override
    public void carregarBateria() {
        System.out.println("Carregando bateria...");
    }

    @Override
    public void mover() {
        System.out.println("Está se movendo...");
    }
}
