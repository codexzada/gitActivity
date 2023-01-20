import java.sql.SQLOutput;
import java.util.ArrayList;
import java.util.Scanner;

public class Main {
    static Scanner e = new Scanner(System.in);
    public static void main(String[] args) {
        Pessoa p = new Pessoa();
        int op = 0;
        while(op != 3){
            menu();
            System.out.println("Selecione uma opção: ");
            op = e.nextInt();

            switch(op){
                case 1:
                    addPessoa(p);
                    break;
                case 2:

                    break;
                default:
                    System.out.println("Digite uma opção válida!");
            }
        }

    }
    public static void addPessoa(Pessoa p){

        System.out.println("Digite o nome: ");
        p.setNome(e.nextLine());

        System.out.println("Digite o email: ");
        p.setEmail(e.nextLine());

        System.out.println("Digite o CPF: ");
        p.setCpf(e.nextLine());
    }
    public static void listPessoa(){
    }
    public static void menu(){
        System.out.println("Tela Principal");
        System.out.println("----------------");
        System.out.println("1 - Adicionar Pessoa");
        System.out.println("2 - Listar Pessoas");
        System.out.println("3 - Sair");
        System.out.println("----------------");
    }

}