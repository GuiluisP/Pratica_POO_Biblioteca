package Biblioteca;

public class BancoBiblioteca {

    String nomeDoLivro;
    String nomeDoAutor;
    int numeroDePaginas;
    boolean emprestado = false;

    // construtor
    public BancoBiblioteca (String nomedolivro, String nomedoautor, int numerodepaginas) {
        this.nomeDoLivro = nomedolivro;
        this.nomeDoAutor = nomedoautor;
        this.numeroDePaginas = numerodepaginas;
    }

    // metodo1
     void emprestar() {
         this.emprestado = true;
    }
    // metodo2
    void exibirinformacao() {
        System.out.println("Livro: " + this.nomeDoLivro);
        System.out.println("Autor: " + this.nomeDoAutor);
        System.out.println("Numero de paginas: " + this.numeroDePaginas);
        System.out.println("Emprestado? : " + this.emprestado);
    }
}
