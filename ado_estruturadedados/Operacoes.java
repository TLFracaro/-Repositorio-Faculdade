/*==========================================*/
/* • Codigo feito por: Túlio Farias Fracaro */
/*    Estrutura de Dados | 3ºSem | TADS     */
/*          Professor: Gerson Risso         */
/*==========================================*/

package ado_estruturadedados;

import java.util.Scanner;

public class Operacoes {
    //Variaveis e imports

    static Scanner leitor = new Scanner(System.in);

    //Atributos
    private static Livro livro[] = new Livro[1];
    private static int indice = 0;
    
    //Métodos
    
    /**
     * Insire um array novo e quando cheio, chama o metodo alocarNovoArray para
     * criar uma nova posicao no array.
     */
    public static void inserir(Livro l) {
        if (indice < livro.length) {
            livro[indice++] = l;
            ordenarTitulo(0, indice, livro);
        } else {
            livro = alocarNovoArray();
            inserir(l);
        }
    }

    public static Livro[] alocarNovoArray() {
        Livro novo[] = new Livro[livro.length + 4];
        for (int i = 0; i < indice; i++) {
            novo[i] = livro[i];
        }
        System.arraycopy(livro, 0, novo, 0, indice);
        return novo;
    }

    /**
     * Mostrar os itens do vetor
     */
    public static void mostrar() {
        for (int i = 0; i < livro.length; i++) {
            System.out.println(livro[i]);
        }
    }

    /**
     * Exclui os itens do vetor
     */
    public static boolean remover() {
        System.out.print("• Digite o id do livro que deseja remover: ");
        int id = leitor.nextInt();
        System.out.println("");
        int rem = buscarId(id);
        if (rem != -1) {
            for (int i = rem; i < indice - 1; i++) {
                livro[i] = livro[i + 1];
            }
            indice--;
            return true;
        }
        return false;
    }

    /**
     * Insere um novo livro
     */
    public static void inserirNovoLivro() {
        int i = livro.length;
        int cond = 0;
        boolean cadastrar;
        do {
            System.out.print("• Digite o nome do autor: ");
            String autor = (leitor.next());
            System.out.print("\n• Digite o titulo do livro: ");
            String titulo = (leitor.next());
            System.out.print("\n• Digite o preco do livro: ");
            double preco = (leitor.nextDouble());
            inserir(new Livro(autor, titulo, preco));
            System.out.println("");
            System.out.print("\t• Deseja cadastrar mais um livro? [1] Sim | [2] Nao: ");
            cond = leitor.nextInt();
            System.out.println("");

            if (cond != 1) {
                cadastrar = true;
            } else {
                cadastrar = false;
            }
        } while (cadastrar == false);
    }

    /**
     * Busca o id do vetor
     *
     * @param id
     * @return
     */
    public static int buscarId(int id) {
        int inicio = 0, fim = indice - 1, meio;
        while (inicio <= fim) {
            meio = (fim + inicio) / 2;
            if (id == livro[meio].getId()) {
                return meio;
            } else if (id > livro[meio].getId()) {
                inicio = meio + 1;
            } else {
                fim = meio - 1;
            }
        }
        return -1;
    }

    /**
     * Busca itens no vetor atraves do titulo
     * @param titulo
     * @param livro
     * @return 
     */
    public static Livro buscarTitulo(String titulo, Livro[] livros) {

        int inicio = 0;
        int fim = livros.length - 1;
        while (inicio <= fim) {
            int meio = (inicio + fim) / 2;
            int comparacao = titulo.compareTo(livros[meio].getTitulo());
            if (comparacao == 0) {
                return livros[meio];
            } else if (comparacao < 0) {
                fim = meio - 1;
            } else {
                inicio = meio + 1;
            }
        }
        return null;
    }
    /**
     * Ordena o vetor pelo titulo pelo método Quick Sort
     * @param inicio
     * @param tamanho
     * @param v 
     */
    public static void ordenarTitulo(int inicio, int tamanho, Livro[] v) {
        if (inicio < tamanho - 1) {
            int meio = (inicio + tamanho) / 2;
            ordenarTitulo(inicio, meio, v);
            ordenarTitulo(meio, tamanho, v);
            intercalar(inicio, meio, tamanho, v);
        }
    }
    
    /**
     * Partição para o metodo ordenarTitulo funcionar
     * @param inicio
     * @param meio
     * @param tamanho
     * @param v 
     */
    public static void intercalar(int inicio, int meio, int tamanho, Livro[] v) {
        int i, j, k;
        Livro[] auxiliar = new Livro[tamanho - inicio];
        i = inicio;
        j = meio;
        k = 0;
        while (i < meio && j < tamanho) {
            if (v[i].getTitulo().compareTo(v[j].getTitulo()) < 0) {
                auxiliar[k] = v[i];
                k++;
                i++;
            } else {
                auxiliar[k] = v[j];
                k++;
                j++;
            }
        }
        while (i < meio) {
            auxiliar[k] = v[i];
            k++;
            i++;
        }
        while (j < tamanho) {
            auxiliar[k] = v[j];
            k++;
            j++;
        }
        for (i = inicio; i < tamanho; i++) {
            v[i] = auxiliar[i - inicio];
        }
    }
    
    /**
     * Encapsulamento buscar
     */
    public static void buscar() {
            System.out.print("• Digite o titulo que deseja pesquisar: ");
            String pesquisa = leitor.nextLine();
            Livro resultado = buscarTitulo(pesquisa, livro);
            if (resultado != null) {
                System.out.println("• Titulo: "+resultado.getTitulo() + "\n• Autor: "+resultado.getAutor() + "\n• Id do livro: "+ resultado.getId()
                        + "\n• Preco: "+ resultado.getPreco() );
            } else if(resultado == null) {
                System.out.println("• Não consegui achar esse titulo! Certifiquese que você não digitou nada errado!");
            }
            System.out.println("");
    }
}
