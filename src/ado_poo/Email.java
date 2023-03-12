package ado_poo;

import java.util.Scanner;

public class Email {
    
    private String para, assunto, mensagem, anexo;
    private static Scanner leitor = new Scanner(System.in);
    
    public Email() {
    }

    public Email(String para, String assunto, String anexo, String mensagem) {
        this.para = para;
        this.assunto = assunto;
        this.anexo = anexo;
        this.mensagem = mensagem;
    }
    
    public String getPara() {
        return para;
    }

    public void setPara(String para) {
        this.para = para;
    }

    public String getAssunto() {
        return assunto;
    }

    public void setAssunto(String assunto) {
        this.assunto = assunto;
    }

    public String getMensagem() {
        return mensagem;
    }

    public void setMensagem(String mensagem) {
        this.mensagem = mensagem;
    }
    
    public String getAnexo() {
        return anexo;
    }

    public void setAnexo(String anexo) {
        this.anexo = anexo;
    }

    @Override
    public String toString() {
        return "===============================================" +
               "\n • Para: " + para +
               "\n===============================================" +
               "\n • Assunto: " + assunto +
               "\n===============================================" +
               "\n" + mensagem + 
               "\n===============================================" +
               "\n • Anexo: " + anexo+
               "\n===============================================" +
               "\n";
    }
}
