public class ContaBancaria {
    private String titular;
    private double saldo;

    public ContaBancaria(String titular, double saldoInicial) {
        this.titular = titular;

        if (saldoInicial >= 0) {
            this.saldo = saldoInicial;
        } else {
            this.saldo = 0;
            System.out.println("Saldo inicial inválido. Defenido como 0,00.");
        }
    }

    public String getTitular() {
        return titular;
    }

    public void setTitular(String titular) {
        this.titular = titular;
    }

    public double getSaldo() {
        return saldo;
    }
    public void depositar(double valor) {
        if (valor > 0) {
            this.saldo += valor;
            System.out.println("Depósito de R$ " + valor + " realizado com sucesso.");
        } else {
            System.out.println("Erro: O valor de depósito deve ser maior que zero.");
        }
    }
    public void sacar(double valor) {
        if (valor <= 0) {
            System.out.println("Erro: O valor do saque deve ser maior que zero.");
        } else if (valor <= this.saldo) {
            this.saldo -= valor;
            System.out.println("Saque de R$ " + valor + " realizado com sucesso.");
        } else {
            System.out.println("Erro: Saldo insuficiente. Saldo atual: R$ " + this.saldo);
        }
    }
}
    

