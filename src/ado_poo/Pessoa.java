package ado_poo;

import java.util.Scanner;

public class Pessoa {
    private String nome, email, sexo;
    private int diaNasci, mesNasci, anoNasci;
    static public Scanner leitor = new Scanner(System.in);
    public Pessoa() {
    }

    public Pessoa(String nome, String email, String sexo, int diaNasci, int mesNasci, int anoNasci) {
        this.nome = nome;
        this.email = email;
        this.sexo = sexo;
        this.diaNasci = diaNasci;
        this.mesNasci = mesNasci;
        this.anoNasci = anoNasci;
    }
    
    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getSexo() {
        return sexo;
    }

    public void setSexo(String sexo) {
        this.sexo = sexo;
    }

    public int getDiaNasci() {
        return diaNasci;
    }

    public void setDiaNasci(int diaNasci) {
        this.diaNasci = diaNasci;
    }

    public int getMesNasci() {
        return mesNasci;
    }

    public void setMesNasci(int mesNasci) {
        this.mesNasci = mesNasci;
    }

    public int getAnoNasci() {
        return anoNasci;
    }

    public void setAnoNasci(int anoNasci) {
        this.anoNasci = anoNasci;
    }

    @Override
    public String toString() {
        return "Dados: " + " Nome: " + nome + " Email: " + email + " Sexo: " + sexo + "Data de Nascimento: " + diaNasci + "/" + mesNasci + "/" + anoNasci;
    }
}
