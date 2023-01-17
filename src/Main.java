import java.sql.SQLOutput;
import java.util.Scanner;

public class Main {
    static Scanner e = new Scanner(System.in);
    public static void main(String[] args) {
        Pessoa p = new Pessoa();
        System.out.println("Selecione uma opção: ");
        int op = e.nextInt();
        while(op != 3){
            menu();
            switch(op){
                case 1:
                    addPessoa(p);
                    break;
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
    public static void menu(){
        System.out.println("Tela Principal");
        System.out.println("----------------");
        System.out.println("Adicionar Pessoa");
        System.out.println("Listar Pessoas");
        System.out.println("Sair");
    }

}