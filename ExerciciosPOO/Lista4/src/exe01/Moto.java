package exe01;

public class Moto extends Veiculo{
    private int cilindrada;

    public Moto(){
        super();
    }

    public Moto(String placa, String modelo, double valorBase, int cilindrada){
        super(placa, modelo, valorBase);
        this.cilindrada = cilindrada;
    }

    public int getCilindrada() {
        return cilindrada;
    }

    public void setCilindrada(int cilindrada) {
        this.cilindrada = cilindrada;
    }

    @Override
    public String toString() {
        return "Moto{" +
                "cilindrada=" + cilindrada +
                super.toString() +
                '}';
    }

    @Override
    public double calcularImposto(){
        if (this.cilindrada <= 250){
            return this.valorBase * 0.01f;
        }
        else {
            return this.valorBase * 0.02f;
        }
    }
}
