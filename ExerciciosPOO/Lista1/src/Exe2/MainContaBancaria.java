package Exe2;

import java.util.Scanner;

public class MainContaBancaria {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        ContaBancaria conta1 = new ContaBancaria("João", "123", 1000, true);

        ContaBancaria conta2 = new ContaBancaria();
        conta2.titular = "Izadora";
        conta2.numero = "123";
        conta2.saldo = 2000;
        conta2.ativa = true;

        conta1.exibe();
        conta2.exibe();

        System.out.println("Valor para depositar na conta 1:");
        double valorDeposito = sc.nextDouble();
        conta1.depositar(valorDeposito);

        System.out.println("Valor para sacar na conta 1: ");
        double valorSaque = sc.nextDouble();
        conta1.sacar(valorSaque);

        System.out.println("Valor para transferir da conta 1 para a 2: ");
        double valorTransferencia = sc.nextDouble();
        conta1.transferir(conta2, valorTransferencia);

        conta1.exibe();
        conta2.exibe();

        sc.close();
    }


}
