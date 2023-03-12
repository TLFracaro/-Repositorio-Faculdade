/*=================================================*/
/*   Sistema que simula uma instituição de Ensino  */
/*      Código feito por: Túlio Farias Fracaro     */
/*             POO - TADS SENAC | 3ºSem            */
/*            Professor: Carlos Veríssimo          */
/*=================================================*/

package ado_poo;

import java.util.Random;

public class Funcionario extends Pessoa {

    private String cargo;
    private int idFuncionario;
    private static Random gerador = new Random();

    //Contrutores.
    public Funcionario() {
    }

    public Funcionario(String cargo, String nome, String email, String sexo, int diaNasci, int mesNasci, int anoNasci) {
        super(nome, email, sexo, diaNasci, mesNasci, anoNasci);
        this.cargo = cargo;
        this.idFuncionario = geradorNum();
    }
    //Fim contrutores.

    //Métodos especiais
    public String getCargo() {
        return cargo;
    }

    public void setCargo(String cargo) {
        this.cargo = cargo;
    }

    public int getIdFuncionario() {
        return idFuncionario;
    }

    public void setIdFuncionario(int idFuncionario) {
        this.idFuncionario = idFuncionario;
    }

    @Override
    public String toString() {
        return " • Dados do Funcionario = " + " Nome: " + getNome() + " Email: " + getEmail() + " Sexo: " + getSexo() +
                "Data de Nascimento: " + getDiaNasci() + "/" + getMesNasci() + "/" + getAnoNasci() + " Cargo: " + cargo + " Id Funcionario: " + idFuncionario;
    }
    
    //Fim métodos especiais

    //Métodos
    private static int[] guardaNum = new int[4];
    private static int indice = 0;

    //Gerador de id aleatorios
    private static int geradorNum() {
        int aux = gerador.nextInt(1000) + 1;
        aux = repete(aux);
        return aux;
    }

    private static int repete(int aux) {
        for (int i = 0; i < guardaNum.length; i++) {
            for (int j = 0; j < guardaNum.length; j++) {
                if (aux == guardaNum[j] && i != j) {
                    aux = gerador.nextInt(1000) + 1;
                    i = 0;
                }
            }
        }
        return aux;
    }
    //Fim métodos    
}
