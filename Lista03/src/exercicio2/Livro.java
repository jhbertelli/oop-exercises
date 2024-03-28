package exercicio2;

public class Livro {
    private int pages;
    private String author;
    private String title;
    private int year;
    private boolean disponivel;


    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public int getYear() {
        return year;
    }

    public void setYear(int year) {
        this.year = year;
    }

    public String getAuthor() {
        return author;
    }

    public void setAuthor(String author) {
        this.author = author;
    }

    public boolean getDisponivel() {
        return disponivel;
    }

    public void setDisponivel(boolean disponivel) {
        this.disponivel = disponivel;
    }

    public String verificarDisponibilidade() {
        return this.disponivel ? "Disponível" : "Indisponível";
    }

    public void emprestarLivro() {
        disponivel = false;
    }

    public void devolverLivro() {
        disponivel = true;
    }

    public int getPages() {
        return pages;
    }

    public void setPages(int pages) {
        this.pages = pages;
    }
}
