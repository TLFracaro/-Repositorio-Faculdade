/*==========================================*/
/* • Codigo feito por: Túlio Farias Fracaro */
/*    Estrutura de Dados | 3ºSem | TADS     */
/*          Professor: Gerson Risso         */
/*==========================================*/

package ado_estruturadedados;

import java.util.Scanner;

public class ADO_EstruturaDeDados {

    public static void main(String[] args) {
        //Variaveis e imports

        Scanner leitor = new Scanner(System.in);
        int op = 0;

        //Atribuido itens ao objeto
        Operacoes.inserir(new Livro("Carlos", "Gato Tonto", 73.00));
        Operacoes.inserir(new Livro("Thomas", "Thomas o trem", 81.00));
        Operacoes.inserir(new Livro("Henrique", "Henrique brazuca", 56.00));
        Operacoes.inserir(new Livro("Giovana", "Giovana no pais das maravilhas", 74.00));
        Operacoes.inserir(new Livro("Paulo", "Paulo e a girrafa", 89.00));
        Operacoes.inserir(new Livro("Brunna", "Brunna com dois n", 100.00));
        Operacoes.inserir(new Livro("Heloise", "Heloise e Heloise", 41.00));
        Operacoes.inserir(new Livro("Yasmin", "Yasmin com y", 30.00));
        Operacoes.inserir(new Livro("Breno", "Breno no mundo de Breno", 75.00));
        Operacoes.inserir(new Livro("Vick", "Vick solitaria", 50.00));

        //Estruturação
        do {
            System.out.println("===============================");
            System.out.println("          MENU LIVRARIA        ");
            System.out.println("===============================");
            System.out.println("• Adicionar novo livro      [1]");
            System.out.println("• Excluir livro             [2]");
            System.out.println("• Buscar livro              [3]");
            System.out.println("• Mostrar todos os livros   [4]");
            System.out.println("• Sair do menu              [5]");
            System.out.println("===============================");
            System.out.print("\n• Selecio uma opcao: ");
            op = leitor.nextInt();
            System.out.println("");
            System.out.println("===============================");
            System.out.println("");

            switch (op) {
                case 1:
                    Operacoes.inserirNovoLivro();
                    break;
                case 2:
                    Operacoes.remover();
                    break;
                case 3:
                    Operacoes.buscar();
                    break;
                case 4:
                    Operacoes.mostrar();
                    break;
                case 5:
                    System.out.println("Operacao encerrada... \n");
                    break;
            }
        } while (op != 5);
    }
}
