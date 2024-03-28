package exercicio2;

public class Main {
    public static void main(String[] args) {
        Livro livro = new Livro();

        livro.setAuthor("Robert Louis Stevenson");
        livro.setPages(141);
        livro.setTitle("Strange Case of Dr Jekyll and Mr Hyde");
        livro.setYear(1886);

        livro.emprestarLivro();

        showBook(livro);
        System.out.println("-----------------------------");

        livro.devolverLivro();

        showBook(livro);
    }

    private static void showBook(Livro book) {
        System.out.println("Título: " + book.getTitle());
        System.out.println("Autor: " + book.getAuthor());
        System.out.println("Páginas: " + book.getPages());
        System.out.println("Ano: " + book.getYear());
        System.out.println("Disponibilidade: " + book.verificarDisponibilidade());
    }
}