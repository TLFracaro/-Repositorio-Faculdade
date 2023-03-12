/*=================================================*/
/*   Sistema que simula uma instituição de Ensino  */
/*      Código feito por: Túlio Farias Fracaro     */
/*             POO - TADS SENAC | 3ºSem            */
/*            Professor: Carlos Veríssimo          */
/*=================================================*/

package ado_poo;
public class Principal {
    public static void main(String[] args) {
        
        //Base de dados
        
        Operacoes.novoEmail(new Email("joaozinho@gmail.com", " Compareca a secretaria!", "PDF", " Pagamento da formatura"));
        Operacoes.novoEmail(new Email("priscilinha@gmail.com", " IMPORTANTE", "PDF", " Mando este email convocando voce\n pra um exame medico"));
        Operacoes.novoEmail(new Email("leandrinho@gmail.com", " Informacoes!", "PDF", " Segue o PDF do periodo de ferias \n da instituicao"));
        
        Operacoes.inserirAluno(new Aluno("3º Colegial", "Joao", "joaozinho@gmail.com", "Masculino", 14, 10, 2000));
        Operacoes.inserirAluno(new Aluno("3º Colegial", "Maria", "joaozinho@gmail.com", "Masculino", 14, 10, 2000));
        Operacoes.inserirAluno(new Aluno("3º Colegial", "Joao", "joaozinho@gmail.com", "Masculino", 14, 10, 2000));
        Operacoes.inserirAluno(new Aluno("3º Colegial", "Joao", "joaozinho@gmail.com", "Masculino", 14, 10, 2000));
        Operacoes.inserirAluno(new Aluno("3º Colegial", "Joao", "joaozinho@gmail.com", "Masculino", 14, 10, 2000));
        Operacoes.inserirAluno(new Aluno("3º Colegial", "Joao", "joaozinho@gmail.com", "Masculino", 14, 10, 2000));
        Operacoes.inserirAluno(new Aluno("3º Colegial", "Joao", "joaozinho@gmail.com", "Masculino", 14, 10, 2000));
        Operacoes.inserirAluno(new Aluno("3º Colegial", "Joao", "joaozinho@gmail.com", "Masculino", 14, 10, 2000));
        Operacoes.inserirAluno(new Aluno("3º Colegial", "Joao", "joaozinho@gmail.com", "Masculino", 14, 10, 2000));
        Operacoes.inserirAluno(new Aluno("3º Colegial", "Joao", "joaozinho@gmail.com", "Masculino", 14, 10, 2000));
        Operacoes.inserirAluno(new Aluno("3º Colegial", "Joao", "joaozinho@gmail.com", "Masculino", 14, 10, 2000));
        Operacoes.inserirAluno(new Aluno("3º Colegial", "Joao", "joaozinho@gmail.com", "Masculino", 14, 10, 2000));
        Operacoes.inserirAluno(new Aluno("3º Colegial", "Joao", "joaozinho@gmail.com", "Masculino", 14, 10, 2000));
        Operacoes.inserirAluno(new Aluno("3º Colegial", "Joao", "joaozinho@gmail.com", "Masculino", 14, 10, 2000));
        Operacoes.inserirAluno(new Aluno("3º Colegial", "Joao", "joaozinho@gmail.com", "Masculino", 14, 10, 2000));
        Operacoes.inserirAluno(new Aluno("3º Colegial", "Joao", "joaozinho@gmail.com", "Masculino", 14, 10, 2000));

        Operacoes.inserirProfessor(new Professor("Matematica", "Lenado", "leandrinho@gmail.com", "Masculino", 14, 10, 2000));
        Operacoes.inserirProfessor(new Professor("Matematica", "Lenado", "leandrinho@gmail.com", "Masculino", 14, 10, 2000));
        Operacoes.inserirProfessor(new Professor("Matematica", "Lenado", "leandrinho@gmail.com", "Masculino", 14, 10, 2000));
        Operacoes.inserirProfessor(new Professor("Matematica", "Lenado", "leandrinho@gmail.com", "Masculino", 14, 10, 2000));
        Operacoes.inserirProfessor(new Professor("Matematica", "Lenado", "leandrinho@gmail.com", "Masculino", 14, 10, 2000));
        Operacoes.inserirProfessor(new Professor("Matematica", "Lenado", "leandrinho@gmail.com", "Masculino", 14, 10, 2000));
        Operacoes.inserirProfessor(new Professor("Matematica", "Lenado", "leandrinho@gmail.com", "Masculino", 14, 10, 2000));
        Operacoes.inserirProfessor(new Professor("Matematica", "Lenado", "leandrinho@gmail.com", "Masculino", 14, 10, 2000));
        Operacoes.inserirProfessor(new Professor("Matematica", "Lenado", "leandrinho@gmail.com", "Masculino", 14, 10, 2000));
        Operacoes.inserirProfessor(new Professor("Matematica", "Lenado", "leandrinho@gmail.com", "Masculino", 14, 10, 2000));
        Operacoes.inserirProfessor(new Professor("Matematica", "Lenado", "leandrinho@gmail.com", "Masculino", 14, 10, 2000));

        Operacoes.inserirFuncionario(new Funcionario("Diretora", "Priscila", "priscilinha@gmail.com", "Masculino", 14, 10, 2000));
        Operacoes.inserirFuncionario(new Funcionario("Diretora", "Priscila", "priscilinha@gmail.com", "Masculino", 14, 10, 2000));
        Operacoes.inserirFuncionario(new Funcionario("Diretora", "Priscila", "priscilinha@gmail.com", "Masculino", 14, 10, 2000));
        Operacoes.inserirFuncionario(new Funcionario("Diretora", "Priscila", "priscilinha@gmail.com", "Masculino", 14, 10, 2000));
        Operacoes.inserirFuncionario(new Funcionario("Diretora", "Priscila", "priscilinha@gmail.com", "Masculino", 14, 10, 2000));
        Operacoes.inserirFuncionario(new Funcionario("Diretora", "Priscila", "priscilinha@gmail.com", "Masculino", 14, 10, 2000));
        //Fim base de dados
        
        Menu.menuPrincipal();
    }
}
