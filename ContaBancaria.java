public class ContaBancaria {
    private String titular;
    private double saldo;

    public ContaBancaria(String titular, double saldo) {
        this.titular = titular;
        this.saldo = saldo;
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
            System.out.println("Erro: O valor do depósito deve ser maior que zero.");
        }
    }

    public void sacar(double valor) {
        if (valor <= 0) {
            System.out.println("Erro: O valor do saque deve ser maior que zero.");
        } else if (valor > this.saldo) {
            System.out.println("Erro: Saldo insuficiente para realizar o saque.");
        } else {
            this.saldo -= valor;
            System.out.println("Saque de R$ " + valor + " realizado com sucesso.");
        }
    }

    public class Main {
    public static void main(String[] args) {

        ContaBancaria conta = new ContaBancaria("Ana Silva", 500.0);

        System.out.println("Titular: " + conta.getTitular());
        System.out.println("Saldo Inicial: R$ " + conta.getSaldo());

        System.out.println("\n Testando Depósito ");
        conta.depositar(200.0);
        System.out.println("Saldo atual: R$ " + conta.getSaldo());

        System.out.println("\n Testando Saque com sucesso ");
        conta.sacar(150.0);
        System.out.println("Saldo atual: R$ " + conta.getSaldo());

        System.out.println("\n Testando Saque sem saldo suficiente ");
        conta.sacar(600.0); 
        System.out.println("Saldo final: R$ " + conta.getSaldo());
    }
}

    
}

    

