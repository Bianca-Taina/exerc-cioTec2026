public class Veiculo {
    protected String marca;
    protected String modelo;

    public Veiculo(String marca, String modelo) {
        this.marca = marca;
        this.modelo = modelo;
    }

    public void buzinar() {
        System.out.println("Bi bi biiiiiii!");
    }
}