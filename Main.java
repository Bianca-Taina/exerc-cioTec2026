public class Main {
    public static void main(String[] args) {
        ContaBancaria conta = new ContaBancaria("Maria Silva", 500.0);

        System.out.println("Titular: " + conta.getTitular());
        System.out.println("Saldo inicial: R$ " + conta.getSaldo());

        conta.depositar(200.0);
        System.out.println("Saldo após depósito: R$ " + conta.getSaldo());

        conta.sacar(150.0);
        System.out.println("Saldo após saque: R$ " + conta.getSaldo());

        conta.sacar(600.0);

        System.out.println("Saldo final: R$ " + conta.getSaldo());
    }
}   

