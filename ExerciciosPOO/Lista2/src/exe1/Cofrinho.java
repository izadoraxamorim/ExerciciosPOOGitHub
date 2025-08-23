package exe1;

public class Cofrinho {
    private double saldo;
    private boolean fechado;

    public Cofrinho(){
        this.saldo = 0;
        this.fechado = false;
    }

    public Cofrinho(double saldo, boolean fechado) {
        this.saldo = saldo;
        this.fechado = fechado;
    }

    //Setters

    public void setSaldo(double saldo) {
        if (!this.fechado && saldo >= 0){
            this.saldo = saldo;
        } else {
            System.out.println("Cofrinho fechado ou saldo negativo.");
        }
    }

    public void setFechado(boolean fechado) {
        this.fechado = fechado;
    }

    public void abrir(){
        if (this.fechado){
            this.setFechado(false);
        }
    }

    public void fechar(){
        if (!this.fechado){
            this.setFechado(true);
        }
    }

    public void depositar(double saldo){
        if (!this.fechado && saldo > 0){
            this.setSaldo(this.saldo + saldo);
        }
    }

    public void retirarTudo(){
        if (!this.fechado){
            System.out.println("Valor retirado: " + this.saldo);
            this.saldo = 0;
        }
    }
    public void exibe() {
        System.out.println("Saldo: " + this.saldo +
                "\nCofrinho está fechado? (true ou false): " + this.fechado);
    }

    //desafio
    public void exibirSaldo(){
        if (!this.fechado){
            System.out.println("Saldo atual: " + this.saldo);
        } else {
            System.out.println("Cofrinho fechado!");
        }
    }
}
