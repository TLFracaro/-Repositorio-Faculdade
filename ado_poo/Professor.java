/*=================================================*/
/*   Sistema que simula uma instituição de Ensino  */
/*      Código feito por: Túlio Farias Fracaro     */
/*             POO - TADS SENAC | 3ºSem            */
/*            Professor: Carlos Veríssimo          */
/*=================================================*/

package ado_poo;
import java.util.Random;

public class Professor extends Pessoa{
    
    private String leciona;
    private int idProfessor;
    private static Random gerador = new Random();
    
    //Contrutores.
    public Professor() {
    }

    public Professor(String leciona, String nome, String email, String sexo, int diaNasci, int mesNasci, int anoNasci) {
        super(nome, email, sexo, diaNasci, mesNasci, anoNasci);
        this.leciona = leciona;
        this.idProfessor = geradorNum();
    }
    //Fim costrutores
    
    //Metodos especiais
    public String getLeciona() {
        return leciona;
    }

    public void setLeciona(String leciona) {
        this.leciona = leciona;
    }

    public int getIdProfessor() {
        return idProfessor;
    }

    public void setIdProfessor(int idProfessor) {
        this.idProfessor = idProfessor;
    }

    @Override
    public String toString() {
        return " • Dados do Professor = " + " Nome: " + getNome() + " Email: " + getEmail() + " Sexo: " + getSexo() + " Data de Nascimento: "
                + getDiaNasci() + "/" + getMesNasci() + "/" + getAnoNasci() + " Leciona: " + leciona + " Id professor: " + idProfessor;
    }

    //Fim metodos especiais
    
    //Métodos
    private static int[] guardaNum = new int[4];
    private static int indice = 0;

    //Gerador de id aleatorios
    private static int geradorNum() {
        int aux = gerador.nextInt(3000)+2000;
        aux = repete(aux);
        return aux;
    }

    private static int repete(int aux) {
        for (int i = 0; i < guardaNum.length; i++) {
            for (int j = 0; j < guardaNum.length; j++) {
                if(aux == guardaNum[j] && i != j){
                    aux = gerador.nextInt(3000)+2000;
                    i = 0;
                }
            }
        }
        return aux;
    }
    //Fim métodos
}
