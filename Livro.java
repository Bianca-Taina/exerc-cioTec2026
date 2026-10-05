public class Livro {
    String titulo;
    String autor;
    int paginas;

    public Livro(String titulo, String autor, int paginas) {
        this.titulo = titulo;
        this.autor = autor;
        this.paginas = paginas;
    }

    public void exibirDetalhes() {
        System.out.println("O livro " + this.titulo + ", escrito por " + this.autor + ", possui " + this.paginas + " páginas.");
    }

    public class Main {
    public static void main(String[] args) {

        Livro meuLivro = new Livro("O Pequeno Príncipe", "Antoine de Saint-Exupéry", 96);

        meuLivro.exibirDetalhes();
    }
}


}
