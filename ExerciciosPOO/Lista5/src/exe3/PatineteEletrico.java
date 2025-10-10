package exe3;

public class PatineteEletrico extends Veiculo implements Eletrico {
    public PatineteEletrico(){
    }

    public PatineteEletrico(String modelo){
        super(modelo);
    }

    @Override
    public void carregarBateria() {
        System.out.println("Carregando Bateria...");
    }


    @Override
    public void mover() {
        System.out.println("Está se movendo...");
    }
}
