/*==========================================*/
/* • Codigo feito por: Túlio Farias Fracaro */
/*    Estrutura de Dados | 3ºSem | TADS     */
/*          Professor: Gerson Risso         */
/*==========================================*/

package ado_estruturadedados;

import java.util.Random;

public class Livro {

    //Atributos e imports
    private int id;
    private String autor, titulo;
    private double preco;
    static Random gerador = new Random();

    //Contrutores
    public Livro() {
    }

    public Livro(String autor, String titulo, double preco) {
        this.id = geradorNum();
        this.autor = autor;
        this.titulo = titulo;
        this.preco = preco;
    }

    //Métodos Especias
    public int getId() {
        return id;
    }

    public int setId(int id) {
        return id;
    }

    public String getAutor() {
        return autor;
    }

    public void setAutor(String autor) {
        this.autor = autor;
    }

    public String getTitulo() {
        return titulo;
    }

    public void setTitulo(String titulo) {
        this.titulo = titulo;
    }

    public double getPreco() {
        return preco;
    }

    public void setPreco(double preco) {
        this.preco = preco;
    }

    //Método toString
    @Override
    public String toString() {
        return "• Livro = " + "Id: " + id + " | Autor: " + autor + " | Titulo: " + titulo + " | Preco: " + preco;
    }

    //
    private static int[] guardaNum = new int[5];
    private static int indice = 0;

    //Gerador de id aleatorios
    private static int geradorNum() {
        int aux = gerador.nextInt(100)+1;
        aux = repete(aux);
        return aux;
    }

    private static int repete(int aux) {
        for (int i = 0; i < guardaNum.length; i++) {
            for (int j = 0; j < guardaNum.length; j++) {
                if(aux == guardaNum[j] && i != j){
                    aux = gerador.nextInt(100)+1;
                    i = 0;
                }
            }
        }
        return aux;
    }
}
