public class Livro {
    private String titulo;
    private String autor;
    private String categoria;
    private int numeroPaginas;
    private int isbn;

    public Livro (String titulo, String autor, String categoria, int numeroPaginas, int isbn){

        this.titulo =  titulo;
        this.autor = autor;
        this.categoria = categoria;
        this.numeroPaginas=numeroPaginas;
        this.isbn = isbn;

    }

    public String getTitulo() {
        return titulo;
    }

    public String getAutor() {
        return autor;
    }

    public String getCategoria() {
        return categoria;
    }

    public int getNumeroPaginas() {
        return numeroPaginas;
    }

    public int getIsbn() {
        return isbn;
    }

    public void exibirDetalhes(){

        System.out.println(getTitulo());
        System.out.println(getAutor());
        System.out.println(getCategoria());
        System.out.println(getNumeroPaginas());
        System.out.println(getIsbn());
    }
}
