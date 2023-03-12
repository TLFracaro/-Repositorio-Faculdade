package ado_poo;

import java.util.Random;

public class Aluno extends Pessoa{
    
    private String serie;
    private int idAluno;
    private static Random gerador = new Random();
    
    //Contrutores
    public Aluno() {
    }

    public Aluno(String Serie, String nome, String email, String sexo, int diaNasci, int mesNasci, int anoNasci) {
        super(nome, email, sexo, diaNasci, mesNasci, anoNasci);
        this.serie = serie;
        this.idAluno = geradorNum();
    }
    // Fim contrutores
    
    //Métodos especias
    public String getSerie() {
        return serie;
    }

    public void setSerie(String serie) {
        this.serie = serie;
    }

    public int getIdAluno() {
        return idAluno;
    }

    public void setIdAluno(int idAluno) {
        this.idAluno = idAluno;
    }

    @Override
    public String toString() {
        return " • Dados do Aluno = " + " Nome: " + getNome() + " Email: " + getEmail() + " Sexo: " + getSexo() + "Data de Nascimento: "
                + getDiaNasci() + "/" + getMesNasci() + "/" + getAnoNasci() + " Serie: " + serie + " Id Aluno: " + idAluno;
    }
    
    //Fim métodos especias
    
    //Métodos
    private static int[] guardaNum = new int[4];
    private static int indice = 0;

    //Gerador de id aleatorios
    private static int geradorNum() {
        int aux = gerador.nextInt(2000)+1000;
        aux = repete(aux);
        return aux;
    }

    private static int repete(int aux) {
        for (int i = 0; i < guardaNum.length; i++) {
            for (int j = 0; j < guardaNum.length; j++) {
                if(aux == guardaNum[j] && i != j){
                    aux = gerador.nextInt(2000)+1000;
                    i = 0;
                }
            }
        }
        return aux;
    }
    //Fim métodos    
}
