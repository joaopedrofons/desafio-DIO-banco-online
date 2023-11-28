package desafioDIObancodigital;

public class ContaPoupanca {
    private double saldo;

    public void depositar(double valor) {
        saldo += valor;
    }

    public void sacar(double valor) {
        if (saldo >= valor) {
            saldo -= valor;
        } else {
            System.out.println("Saldo insuficiente!");
        }
    }

    public void transferir(double valor, ContaPoupanca contaDestino) {
        if (saldo >= valor) {
            sacar(valor);
            contaDestino.depositar(valor);
        } else {
            System.out.println("Saldo insuficiente!");
        }
    }
}
