import java.util.ArrayList;
import java.util.List;

public class App {

    List<Bibliografia> bibliografiaList = new ArrayList<>();

    public static void main(String[] args) {
        App app = new App();

        Livro livro = new Livro(980);
        Artigo artigo = new Artigo(5);
        Revista revista = new Revista(75);
        app.addBibliografia(livro);
        app.addBibliografia(revista);
        app.addBibliografia(artigo);

        int totalPages = app.calculaTotalPages();

        System.out.println("*************************************************************");
        System.out.println("* Bibliografias adicionadas: " + app.bibliografiaList.size());
        System.out.println("*");
        System.out.println("* Total de páginas: " + totalPages);
        System.out.println("*");
        System.out.println("*************************************************************");
    }

    //Adiciona
    public void addBibliografia(Bibliografia bio) {
        bibliografiaList.add(bio);
    }

    //Percorre a lista pegando o numero de paginas
    public int calculaTotalPages() {
        int pages = 0;

        for(Bibliografia Bibliografia : bibliografiaList) {
            pages += Bibliografia.getPagina();
        }
        return pages;
    }
}
