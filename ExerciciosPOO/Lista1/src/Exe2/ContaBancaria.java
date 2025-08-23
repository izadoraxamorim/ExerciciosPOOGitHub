package Exe2;

public class ContaBancaria {
    public String titular, numero;
    public double saldo;
    public boolean ativa;

    public ContaBancaria(){
    }
    public ContaBancaria(String titular, String numero, double saldoInicial, boolean ativa) {
        this.titular = titular;
        this.numero = numero;
        this.saldo = saldoInicial;
        this.ativa = ativa;
    }
    public void exibe(){
        System.out.println("Titular: " + titular +
                "\nNumero: " + numero + "\nSaldo: " + saldo + "\nAtiva: " + ativa);
    }
    public void ativa(){
        this.ativa = true;
    }
    public void desativa() {
        if (this.saldo >= 0) {
            this.ativa = false;
        } else {
            System.out.println("Não é possível desativar a conta.");
        }
    }
    public void depositar(double valor){
        if (valor > 0 && this.ativa){
            this.saldo += valor;
        }
    }
    public void sacar(double valor){
        if (valor > 0 && this.ativa && this.saldo >= valor){
            this.saldo -= valor;
        }
    }
    public void transferir(ContaBancaria destino, double valor) {
        if (this.ativa && destino.ativa && valor > 0 && valor <= this.saldo) {
            this.sacar(valor);
            destino.depositar(valor);
        } else {
            System.out.println("Não é possível transferir.");
        }
    }

}


