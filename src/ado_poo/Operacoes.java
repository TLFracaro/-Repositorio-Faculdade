package ado_poo;

import java.util.Scanner;

public class Operacoes {

    protected static Aluno aluno[] = new Aluno[1];
    private static int indiceAluno = 0;
    protected static Professor professor[] = new Professor[1];
    private static int indiceProfessor = 0;
    protected static Funcionario funcionario[] = new Funcionario[1];
    private static int indiceFuncionario = 0;
    protected static Email email []= new Email[1];
    private static int indiceEmail = 0;
    static private Scanner leitor = new Scanner(System.in);
    
    
    /**
     * Envia um novo email e guarda no vetor email.
     *
     * @param Email
     */
    public static void novoEmail(Email Email) {
        if (indiceEmail < email.length) {
            email[indiceEmail++] = Email;
        } else {
            email = alocarNovoArrayEmail();
            novoEmail(Email);
        }
    }

    public static Email[] alocarNovoArrayEmail() {
        Email[] novo = new Email[email.length + 4];
        System.arraycopy(email, 0, novo, 0, indiceEmail);
        return novo;
    }

    //Fim função NovoEmail
    /**
     * Insere um novo aluno no vetor aluno.
     *
     * @param Aluno
     */
    public static void inserirAluno(Aluno Aluno) {
        if (indiceAluno < aluno.length) {
            aluno[indiceAluno++] = Aluno;
        } else {
            aluno = alocarNovoArrayAluno();
            inserirAluno(Aluno);
        }
    }

    public static Aluno[] alocarNovoArrayAluno() {
        Aluno[] novo = new Aluno[aluno.length + 4];
        System.arraycopy(aluno, 0, novo, 0, indiceAluno);
        return novo;
    }

    //Fim função inserirAluno
    
    /**
     * Insere um novo professor no vetor professor.
     *
     * @param Professor
     */
    public static void inserirProfessor(Professor Professor) {
        if (indiceProfessor < professor.length) {
            professor[indiceProfessor++] = Professor;
        } else {
            professor = alocarNovoArrayProfessor();
            inserirProfessor(Professor);
        }
    }

    public static Professor[] alocarNovoArrayProfessor() {
        Professor novo[] = new Professor[indiceProfessor + 4];
        System.arraycopy(professor, 0, novo, 0, indiceProfessor);
        return novo;
    }

    //fim função inserirProfessor
    /**
     * Insere um novo funcionario no vetor funcionario.
     *
     * @param Funcionario
     */
    public static void inserirFuncionario(Funcionario Funcionario) {
        if (indiceFuncionario < funcionario.length) {
            funcionario[indiceFuncionario++] = Funcionario;
        } else {
            funcionario = alocarNovoArrayFuncionario();
            inserirFuncionario(Funcionario);
        }
    }

    public static Funcionario[] alocarNovoArrayFuncionario() {
        Funcionario novo[] = new Funcionario[indiceFuncionario + 4];
        System.arraycopy(funcionario, 0, novo, 0, indiceFuncionario);
        return novo;
    }

    //fim função inserirFuncionario
    //Método mostrar todos os Alunos
    /**
     * Mostrar todos os alunos do vetor aluno
     */
    public static void mostrarAluno() {
        ordenarIdAluno(aluno, 0, indiceAluno - 1);
        for (int i = 0; i < aluno.length; i++) {
            System.out.println(aluno[i]);
        }
    }
    //Fim Método mostrar todos os alunos

    //Método mostrar todos os professores
    /**
     * Mostrar todos os professores do vetor professor
     */
    public static void mostrarProfessor() {
        ordenarIdProfessor(professor, 0, indiceProfessor - 1);
        for (int i = 0; i < professor.length; i++) {
            System.out.println(professor[i]);
        }
    }
    //Fim Método mostrar todos os professores

    //Método mostrar todos os funcionarios
    /**
     * Mostrar todos os funcionario do vetor funcionario
     */
    public static void mostrarFuncionario() {
        ordenarIdFuncionario(funcionario, 0, indiceFuncionario - 1);
        for (int i = 0; i < funcionario.length; i++) {
            System.out.println(funcionario[i]);
        }
    }
    //Fim Método mostrar todos os funcionarios
    
    //Método mostrar todos os funcionarios
    /**
     * Mostrar todos os funcionario do vetor funcionario
     */
    public static void mostrarEmailEnviado() {
        for (int i = 0; i < email.length; i++) {
            System.out.println(email[i]);
        }
    }
    //Fim Método mostrar todos os funcionarios

    //Método excluir aluno
    public static boolean removerAluno() {
        System.out.print("• Digite o id do aluno(a) que deseja remover: ");
        int id = leitor.nextInt();
        System.out.println("");
        int rem = buscarIdAluno(id);
        if (rem != -1) {
            for (int i = rem; i < indiceAluno - 1; i++) {
                aluno[i] = aluno[i + 1];
            }
            indiceAluno--;
            return true;
        }
        return false;
    }

    public static int buscarIdAluno(int id) {
        ordenarIdAluno(aluno, 0, indiceAluno - 1);
        int inicio = 0, fim = indiceAluno - 1, meio;
        while (inicio <= fim) {
            meio = (fim + inicio) / 2;
            if (id == aluno[meio].getIdAluno()) {
                return meio;
            } else if (id > aluno[meio].getIdAluno()) {
                inicio = meio + 1;
            } else {
                fim = meio - 1;
            }
        }
        return -1;
    }

    public static void ordenarIdAluno(Aluno[] alunoId, int inicio, int fim) {
        if (inicio < fim) {
            int pivo = particaoAluno(alunoId, inicio, fim);
            ordenarIdAluno(alunoId, inicio, pivo - 1);
            ordenarIdAluno(alunoId, pivo + 1, fim);
        }
    }

    private static int particaoAluno(Aluno[] alunoId, int inicio, int fim) {
        int pivot = alunoId[fim].getIdAluno();
        int i = inicio - 1;

        for (int j = inicio; j < fim; j++) {
            if (alunoId[j].getIdAluno() <= pivot) {
                i++;
                int aux = alunoId[i].getIdAluno();
                alunoId[i].setIdAluno(alunoId[j].getIdAluno());
                alunoId[j].setIdAluno(aux);
            }
        }
        int aux = alunoId[i + 1].getIdAluno();
        alunoId[i + 1].setIdAluno(alunoId[fim].getIdAluno());
        alunoId[fim].setIdAluno(aux);
        return i + 1;
    }
    //Fim método excluir aluno

    //Método excluir professor
    public static boolean removerProfessor() {
        System.out.print("• Digite o id do professor(a) que deseja remover: ");
        int id = leitor.nextInt();
        System.out.println("");
        int rem = buscarIdProfessor(id);
        if (rem != -1) {
            for (int i = rem; i < indiceProfessor - 1; i++) {
                professor[i] = professor[i + 1];
            }
            indiceProfessor--;
            return true;
        }
        return false;
    }

    public static int buscarIdProfessor(int id) {
        ordenarIdProfessor(professor, 0, indiceProfessor - 1);
        int inicio = 0, fim = indiceAluno - 1, meio;
        while (inicio <= fim) {
            meio = (fim + inicio) / 2;
            if (id == professor[meio].getIdProfessor()) {
                return meio;
            } else if (id > professor[meio].getIdProfessor()) {
                inicio = meio + 1;
            } else {
                fim = meio - 1;
            }
        }
        return -1;
    }

    public static void ordenarIdProfessor(Professor[] professorId, int inicio, int fim) {
        if (inicio < fim) {
            int pivo = particaoProfessor(professorId, inicio, fim);
            ordenarIdProfessor(professorId, inicio, pivo - 1);
            ordenarIdProfessor(professorId, pivo + 1, fim);
        }
    }

    private static int particaoProfessor(Professor[] professorId, int inicio, int fim) {
        int pivot = professorId[fim].getIdProfessor();
        int i = inicio - 1;

        for (int j = inicio; j < fim; j++) {
            if (professorId[j].getIdProfessor() <= pivot) {
                i++;
                int aux = professorId[i].getIdProfessor();
                professorId[i].setIdProfessor(professorId[j].getIdProfessor());
                professorId[j].setIdProfessor(aux);
            }
        }
        int aux = professorId[i + 1].getIdProfessor();
        professorId[i + 1].setIdProfessor(professorId[fim].getIdProfessor());
        professorId[fim].setIdProfessor(aux);
        return i + 1;
    }
    //Fim método excluir professor

    //Método excluir funcionario
    public static boolean removerFuncionario() {
        System.out.print("• Digite o id do funcionario(a) que deseja remover: ");
        int id = leitor.nextInt();
        System.out.println("");
        int rem = buscarIdFuncionario(id);
        if (rem != -1) {
            for (int i = rem; i < indiceFuncionario - 1; i++) {
                funcionario[i] = funcionario[i + 1];
            }
            indiceFuncionario--;
            return true;
        }
        return false;
    }

    public static int buscarIdFuncionario(int id) {
        ordenarIdFuncionario(funcionario, 0, indiceFuncionario - 1);
        int inicio = 0, fim = indiceFuncionario - 1, meio;
        while (inicio <= fim) {
            meio = (fim + inicio) / 2;
            if (id == funcionario[meio].getIdFuncionario()) {
                return meio;
            } else if (id > funcionario[meio].getIdFuncionario()) {
                inicio = meio + 1;
            } else {
                fim = meio - 1;
            }
        }
        return -1;
    }

    public static void ordenarIdFuncionario(Funcionario[] funcionarioId, int inicio, int fim) {
        if (inicio < fim) {
            int pivo = particaoFuncionario(funcionarioId, inicio, fim);
            ordenarIdFuncionario(funcionarioId, inicio, pivo - 1);
            ordenarIdFuncionario(funcionarioId, pivo + 1, fim);
        }
    }

    private static int particaoFuncionario(Funcionario[] funcionarioId, int inicio, int fim) {
        int pivot = funcionarioId[fim].getIdFuncionario();
        int i = inicio - 1;

        for (int j = inicio; j < fim; j++) {
            if (funcionarioId[j].getIdFuncionario() <= pivot) {
                i++;
                int aux = funcionarioId[i].getIdFuncionario();
                funcionarioId[i].setIdFuncionario(funcionarioId[j].getIdFuncionario());
                funcionarioId[j].setIdFuncionario(aux);
            }
        }
        int aux = funcionarioId[i + 1].getIdFuncionario();
        funcionarioId[i + 1].setIdFuncionario(funcionarioId[fim].getIdFuncionario());
        funcionarioId[fim].setIdFuncionario(aux);
        return i + 1;
    }
    //Fim método excluir funcionario
    
    //Método pra enviar um email
    public static void escreverEmail(){
        int op = 0;
        String anexo = "";
        System.out.println("===============================================");
        System.out.print(" • Para: ");
        String para = leitor.nextLine();
        System.out.println(" ");
        System.out.println("===============================================");
        System.out.print(" • Assunto: ");
        String assunto = leitor.nextLine();
        System.out.println(" ");
        System.out.println("===============================================");
        System.out.println("    *Ao finalizar aperte enter para enviar*    ");
        String mensagem = leitor.nextLine();
        System.out.println(" ");
        System.out.println("===============================================");
        System.out.println(" • Deseja anexar algum arquivo? Se sim, qual?  ");
        System.out.println("\t• PDF                              [1]");
        System.out.println("\t• TXT                              [2]");
        System.out.println("\t• ZIP                              [3]");
        System.out.println("\t• XLSX                             [4]");
        System.out.println("\t• DOCX                             [5]");
        System.out.println("\t• JPEG                             [6]");
        System.out.println("\t• PNG                              [7]");
        System.out.println("\t• Nao desejo anexar nenhum arquivo [8]");
        System.out.println("");
        System.out.print(" • Escolha uma opcao: ");
        op = leitor.nextInt();
        System.out.println("");
        switch (op) {
                case 1:
                    anexo = "PDF";
                    break;
                case 2:
                    anexo = "TXT";
                    break;
                case 3:
                    anexo = "ZIP";
                    break;
                case 4:
                    anexo = "XLSX";
                    break;
                case 5:
                    anexo = "DOCX";
                    break;
                case 6:
                    anexo = "JPEG";
                    break;
                case 7:
                    anexo = "PNG";
                    break;
                case 8:
                    anexo = "Nenhum anexo foi enviado!";
                    break;    
                default:
                    System.out.println(" • Opcao invalida!");
                    System.out.println("");
                    break;
            }
        novoEmail(new Email(para, assunto, anexo, mensagem));
        System.out.println("===============================================");
    }
    
    //Fim método pra enviar um email
    public static void mostraEmailCadastrados(){
        System.out.println(" • Emails de alunos: ");
        for(int i = 0; i < indiceAluno-1; i++){
            System.out.println("Nome do aluno: " + aluno[i].getNome() + " Email: " + aluno[i].getEmail()); 
        }
        System.out.println("");
        System.out.println(" • Emails de professores: ");
        for(int i = 0; i < indiceProfessor-1; i++){
            System.out.println("Nome do professor(A): " + professor[i].getNome() + " Email: " + professor[i].getEmail()); 
        }
        System.out.println("");
        System.out.println(" • Emails de funcionarios: ");
        for(int i = 0; i < indiceFuncionario-1; i++){
            System.out.println("Nome do funcionario(a): " + funcionario[i].getNome() + " Email: " + funcionario[i].getEmail()); 
        }
        System.out.println("");
    }
}
