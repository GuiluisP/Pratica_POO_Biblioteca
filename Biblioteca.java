package Biblioteca;

public class Biblioteca {
    public static void main(String[] args) {

     // construtor do livro
    BancoBiblioteca livro1 = new BancoBiblioteca("O Hobbit", "J.R.R. Tolkien", 310);
        livro1.emprestar();
        livro1.exibirinformacao();
    }
}
