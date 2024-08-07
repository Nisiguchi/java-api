package list.pesquisa;

public class livro {
    private String titulo;
    private String autor;
    private int anoPublicacao;

    public livro(String titulo, String autor, int anoPublicacao) {
        this.titulo = titulo;
        this.autor = autor;
        this.anoPublicacao = anoPublicacao;
    }

    public String getTitulo() {
        return titulo;
    }

    public String getAutor() {
        return autor;
    }

    public int getAnoPublicacao() {
        return anoPublicacao;
    }

    @Override
    public String toString() {
        return titulo + autor + anoPublicacao;
    }
}
