package ado_poo;

import java.util.Scanner;

public class Menu {

    private static Scanner leitor = new Scanner(System.in);

    public static void menuPrincipal() {

        

        int op = 0;
        do {
            System.out.println("===============================================");
            System.out.println("          Menu [Principal] Secretaria          ");
            System.out.println("            Colegio Sao Paulo - CSP            ");
            System.out.println("===============================================");
            System.out.println(" • Enviar email                         [1]    ");
            System.out.println(" • Acessar menu professor               [2]    ");
            System.out.println(" • Acessar menu funcionario             [3]    ");
            System.out.println(" • Acessar menu aluno                   [4]    ");
            System.out.println(" • Sair do menu                         [5]    ");
            System.out.println("");
            System.out.print(" • Escolha uma opcao: ");
            op = leitor.nextInt();
            System.out.println("");
            switch (op) {
                case 1:
                    menuEnviarEmail();
                    
                    break;
                case 2:
                    menuProfessor();
                    break;
                case 3:
                    menuFuncionario();
                    break;
                case 4:
                    menuAluno();
                    break;
                case 5:
                    System.out.println(" • Finalizando operacao...");
                    break;
                default:
                    System.out.println(" • Opcao invalida!");
                    System.out.println("");
                    break;
            }
        } while (op != 5);
    }

    public static void menuProfessor() {
        int op = 0;
        do {
            System.out.println("===============================================");
            System.out.println("         Menu [Professoror] Secretaria         ");
            System.out.println("            Colegio Sao Paulo - CSP            ");
            System.out.println("===============================================");
            System.out.println(" • Adicionar novo professor(a)          [1]    ");
            System.out.println(" • Excluir professor(a)                 [2]    ");
            System.out.println(" • Buscar dados de um professor(a)      [3]    ");
            System.out.println(" • Mostrar todos os professores         [4]    ");
            System.out.println(" • Voltar ao menu principal             [5]    ");
            System.out.println("");
            System.out.print(" • Escolha uma opcao: ");
            op = leitor.nextInt();
            System.out.println("");
            switch (op) {
                case 1:
                    System.out.println(" • Digite o que o novo professor(a) vai lecionar: ");
                    String leciona = leitor.nextLine();
                    System.out.println(" • Digite nome do novo professor(a): ");
                    String nome = leitor.nextLine();
                    System.out.println(" • Digite o e-mail do novo professor(a): ");
                    String email = leitor.nextLine();
                    System.out.println(" • Digite o sexo do novo professor(a): ");
                    String sexo = leitor.nextLine();
                    System.out.println(" • Dia de nascimento: ");
                    int dia = leitor.nextInt();
                    System.out.println(" • Mes de nascimento: ");
                    int mes = leitor.nextInt();
                    System.out.println(" • Ano de nascimento: ");
                    int ano = leitor.nextInt();
                    Operacoes.inserirProfessor(new Professor(leciona, nome, email, sexo, dia, mes, ano));
                    break;
                case 2:
                    Operacoes.removerProfessor();
                    break;
                case 3:
                    System.out.print(" • Digite o id do professor(a) que deseja pesquisar: ");
                    int id = leitor.nextInt();
                    System.out.println("");
                    int resultado = (Operacoes.buscarIdProfessor(id));
                    if (resultado != -1) {
                        System.out.println(Operacoes.professor[resultado]);
                    } else {
                        System.out.println(" • Nao consegui achar o professor(a) pelo id " + id);
                    }
                    break;
                case 4:
                    Operacoes.mostrarProfessor();
                    System.out.println("");
                    break;
                case 5:
                    System.out.println(" • Voltando ao menu principal...");
                    System.out.println("");
                    break;
                default:
                    System.out.println(" • Opcao invalida!");
                    System.out.println("");
                    break;
            }
        } while (op != 5);
    }

    public static void menuFuncionario() {
        int op = 0;
        do {
            System.out.println("===============================================");
            System.out.println("         Menu [Funcionario] Secretaria         ");
            System.out.println("            Colegio Sao Paulo - CSP            ");
            System.out.println("===============================================");
            System.out.println(" • Adicionar novo funcionario(a)        [1]    ");
            System.out.println(" • Excluir funcionario(a)               [2]    ");
            System.out.println(" • Buscar dados de um funcionario(a)    [3]    ");
            System.out.println(" • Mostrar todos os Funcionarios        [4]    ");
            System.out.println(" • Voltar ao menu principal             [5]    ");
            System.out.println("");
            System.out.print(" • Escolha uma opcao: ");
            op = leitor.nextInt();
            System.out.println("");
            switch (op) {
                case 1:
                    System.out.println(" • Digite o cargo do novo funcionario(a): ");
                    String cargo = leitor.nextLine();
                    System.out.println(" • Digite nome do novo funcionario(a): ");
                    String nome = leitor.nextLine();
                    System.out.println(" • Digite o e-mail do novo funcionario(a): ");
                    String email = leitor.nextLine();
                    System.out.println(" • Digite o sexo do novo funcionario(a): ");
                    String sexo = leitor.nextLine();
                    System.out.println(" • Dia de nascimento: ");
                    int dia = leitor.nextInt();
                    System.out.println(" • Mes de nascimento: ");
                    int mes = leitor.nextInt();
                    System.out.println(" • Ano de nascimento: ");
                    int ano = leitor.nextInt();
                    Operacoes.inserirFuncionario(new Funcionario(cargo, nome, email, sexo, dia, mes, ano));
                    break;
                case 2:
                    Operacoes.removerFuncionario();
                    break;
                case 3:
                    System.out.print(" • Digite o id do funcionario(a) que deseja pesquisar: ");
                    int id = leitor.nextInt();
                    System.out.println("");
                    int resultado = (Operacoes.buscarIdFuncionario(id));
                    if (resultado != -1) {
                        System.out.println(Operacoes.funcionario[resultado]);
                    } else {
                        System.out.println(" • Nao consegui achar o funcionario(a) pelo id " + id);
                    }
                    System.out.println("");
                    break;
                case 4:
                    Operacoes.mostrarFuncionario();
                    System.out.println("");
                    break;
                case 5:
                    System.out.println(" • Voltando ao menu principal...");
                    System.out.println("");
                    break;
                default:
                    System.out.println(" • Opcao invalida!");
                    System.out.println("");
                    break;
            }
        } while (op != 5);
    }
    
    public static void menuAluno() {
        int op = 0;
        do {
            System.out.println("===============================================");
            System.out.println("            Menu [Aluno] Secretaria            ");
            System.out.println("            Colegio Sao Paulo - CSP            ");
            System.out.println("===============================================");
            System.out.println(" • Adicionar novo aluno(a)              [1]    ");
            System.out.println(" • Excluir aluno(a)                     [2]    ");
            System.out.println(" • Buscar dados de um aluno(a)          [3]    ");
            System.out.println(" • Mostrar todos os alunos              [4]    ");
            System.out.println(" • Voltar ao menu principal             [5]    ");
            System.out.println("");
            System.out.print(" • Escolha uma opcao: ");
            op = leitor.nextInt();
            System.out.println("");
            switch (op) {
                case 1:
                    System.out.println(" • Digite o ano do novo aluno(a): ");
                    String anoLetivo = leitor.nextLine();
                    System.out.println(" • Digite nome do novo aluno(a): ");
                    String nome = leitor.nextLine();
                    System.out.println(" • Digite o e-mail do novo aluno(a): ");
                    String email = leitor.nextLine();
                    System.out.println(" • Digite o sexo do novo aluno(a): ");
                    String sexo = leitor.nextLine();
                    System.out.println(" • Dia de nascimento: ");
                    int dia = leitor.nextInt();
                    System.out.println(" • Mes de nascimento: ");
                    int mes = leitor.nextInt();
                    System.out.println(" • Ano de nascimento: ");
                    int ano = leitor.nextInt();
                    Operacoes.inserirAluno(new Aluno(anoLetivo, nome, email, sexo, dia, mes, ano));
                    break;
                case 2:
                    Operacoes.removerAluno();
                    break;
                case 3:
                    System.out.print(" • Digite o id do aluno que deseja pesquisar: ");
                    int id = leitor.nextInt();
                    System.out.println("");
                    int resultado = (Operacoes.buscarIdAluno(id));
                    if (resultado != -1) {
                        System.out.println(Operacoes.aluno[resultado]);
                    } else {
                        System.out.println(" • Nao consegui achar o aluno pelo id " + id);
                    }
                    System.out.println("");
                    break;
                case 4:
                    Operacoes.mostrarAluno();
                    System.out.println("");
                    break;
                case 5:
                    System.out.println(" • Voltando ao menu principal...");
                    System.out.println("");
                    break;
                default:
                    System.out.println(" • Opcao invalida!");
                    System.out.println("");
                    break;
            }
        } while (op != 5);
    }
    
    public static void menuEnviarEmail() {
        int op = 0;
        do{
        System.out.println("===============================================");
        System.out.println("        Menu [Enviar E-mail] Secretaria        ");
        System.out.println("            Colegio Sao Paulo - CSP            ");
        System.out.println("===============================================");
        System.out.println(" • Ver todos emails cadastrados         [1]    ");
        System.out.println(" • Ver emails enviados                  [2]    ");
        System.out.println(" • Enviar novo email                    [3]    ");
        System.out.println(" • Voltar ao menu principal             [4]    ");
        System.out.println("");
        System.out.print(" • Escolha uma opcao: ");
        op = leitor.nextInt();
        System.out.println("");
        switch (op) {
                case 1:
                    Operacoes.mostraEmailCadastrados();
                    break;
                case 2:
                    Operacoes.mostrarEmailEnviado();
                    break;
                case 3:
                    Operacoes.escreverEmail();
                    break;
                case 4:
                    System.out.println(" • Voltando ao menu principal...");
                    System.out.println("");
                    break;    
                default:
                    System.out.println(" • Opcao invalida!");
                    System.out.println("");
                    break;
            }
        } while (op != 4);
    }
}
