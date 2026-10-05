public class MainFuncionario {
    public static void main(String[] args) {
        Gerente gerente = new Gerente("Julia Volgue ", 2000.0, "Tecnologia");
        gerente.gerenciar();
        System.out.println("Salário inicial: R$ " + gerente.getSalario());
        gerente.aumentarSalario(10);
        System.out.println("Novo salário: R$ " + gerente.getSalario());
    }
}