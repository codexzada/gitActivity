import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Pessoa p = new Pessoa();
        Scanner e = new Scanner(System.in);

        System.out.println("Digite o nome: ");
        p.setNome(e.nextLine());
        
        System.out.println("Digite o email: ");
        p.setEmail(e.nextLine());

        System.out.println("Digite o CPF: ");
        p.setCpf(e.nextLine());
        
        System.out.println(p);
    }

}