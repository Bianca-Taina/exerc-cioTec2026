public class MainContaBancaria {

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
