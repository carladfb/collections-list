package list.Pesquisa;

import java.util.ArrayList;
import java.util.List;

public class CatalogoLivros {
    private List<Livro> livrosList;

    public CatalogoLivros() {
        this.livrosList = new ArrayList<>();
    }

    public void adicionarLivro(String titulo, String autor, int anoPublicacao) {
        livrosList.add(new Livro(titulo, autor, anoPublicacao));
    }

    public List<Livro> pesquisarPorAutor(String autor) {
        List<Livro> livrosPorAutor = new ArrayList<>();
        if (!livrosList.isEmpty()) {
            for (Livro livro : livrosList) {
                if (livro.getAutor().equalsIgnoreCase(autor)) {
                    livrosPorAutor.add(livro);
                }
            }
        }
        return livrosPorAutor;
    }

    public List<Livro> pesquisarPorIntervaloAnos(int anoInicial, int anoFinal) {
        List<Livro> livrosPorIntervaloDeAnos = new ArrayList<>();
        if (!livrosList.isEmpty()) {
            for (Livro livro : livrosList) {
                if (livro.getAnoPublicacao() >= anoInicial && livro.getAnoPublicacao() <= anoFinal) {
                    livrosPorIntervaloDeAnos.add(livro);
                }
            }
        }
        return livrosPorIntervaloDeAnos;
    }

    public Livro pesquisarPorTitulo(String titulo) {
        Livro livroPorTitulo = null;

        if (!livrosList.isEmpty()) {
            for (Livro livro : livrosList) {
                if (livro.getTitulo().equalsIgnoreCase(titulo)) {
                    livroPorTitulo = livro;
                    break;
                }
            }
        }
        return livroPorTitulo;
    }

    public static void main(String[] args) {
        CatalogoLivros catalogoLivros = new CatalogoLivros();

        catalogoLivros.adicionarLivro("As Cronicas de Narnia: A Ultima Batalha", "C. S, Lewis", 1956);
        catalogoLivros.adicionarLivro("As Cronicas de Narnia: A Ultima Batalha", "C. S, Lewis", 1956);
        catalogoLivros.adicionarLivro("As Cronicas de Gelo e Fogo: A Guerra dos Tronos", "George R. R. Martin", 1996);
        catalogoLivros.adicionarLivro("As Cornicas de Gelo e Fogo: A Dança dos Dragoes", "George R. R. Martin", 2011);
        catalogoLivros.adicionarLivro("Trono de Vidro: A Rainha Das Sombras", "Sarah J. Maas", 2015);
        catalogoLivros.adicionarLivro("As Treze Reliquias", "Michael Scott", 2011);
        
        System.out.println(catalogoLivros.pesquisarPorAutor("George R. R. Martin"));
        System.out.println(catalogoLivros.pesquisarPorIntervaloAnos(2011, 2015));
        System.out.println(catalogoLivros.pesquisarPorTitulo("As Treze Reliquias"));
    }
}
