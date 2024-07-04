package list.pesquisa;

import java.util.ArrayList;
import java.util.List;

public class catalogoLivro {
    private List<livro> livroList;

    public catalogoLivro() {
        this.livroList = new ArrayList<>();
    }

    public void adicionarLivro(String titulo, String autor, int anoPublicacao) {
        livroList.add(new livro(titulo, autor, anoPublicacao));
    }

    public List<livro> pesquisarPorAutor(String autor) {
        List<livro> livroPorAutor = new ArrayList<>();
        if(!livroList.isEmpty()) {
            for(livro l : livroList) {
                if(l.getAutor().equalsIgnoreCase(autor)) {
                    livroPorAutor.add(l);
                }
            }
        }
        return livroPorAutor;
    }

    public List<livro> pesquisarPorIntervaloAnos(int anoInicial, int anoFinal) {
        List<livro> livroPorIntervaloAnos = new ArrayList<>();
        if(!livroList.isEmpty()) {
            for(livro l : livroList) {
                if(l.getAnoPublicacao() >= anoInicial && l.getAnoPublicacao() <= anoFinal) {
                    livroPorIntervaloAnos.add(l);
                }
            }
        }
        return livroPorIntervaloAnos;
    }

    public livro pesquisarPorTitulo(String titulo) {
        livro livroPorTitulo = null;
        if(!livroList.isEmpty()) {
            for(livro l : livroList) {
                if(l.getTitulo().equalsIgnoreCase(titulo)) {
                    livroPorTitulo = l;
                    break;
                }
            }
        }
        return livroPorTitulo;
    }

    public static void main(String[] args) {
        catalogoLivro catalogoLivro = new catalogoLivro();
        catalogoLivro.adicionarLivro("Livro 1", "Autor 1", 2000);
        catalogoLivro.adicionarLivro("Livro 2", "Autor 2", 2001);
        catalogoLivro.adicionarLivro("Livro 3", "Autor 3", 2002);
        catalogoLivro.adicionarLivro("Livro 4", "Autor 4", 2003);
        catalogoLivro.adicionarLivro("Livro 4", "Autor 5", 2004);
        catalogoLivro.adicionarLivro("Livro 5", "Autor 5", 1999);

        System.out.println(catalogoLivro.pesquisarPorAutor("Autor 5"));
        System.out.println(catalogoLivro.pesquisarPorIntervaloAnos(2000, 2004));
        System.out.println(catalogoLivro.pesquisarPorTitulo("Livro 4"));
    }

}
