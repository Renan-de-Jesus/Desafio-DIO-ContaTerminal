import java.util.Locale;
import java.util.Scanner;

public class Primeiro {
    public static void main(String[] args) {
        Locale.setDefault(Locale.US);
        Scanner entrada = new Scanner(System.in);

        System.out.println("Olá, seja bem-vindo ao banco X!");
        System.out.print("Por favor, digite o seu nome: ");
        String nome = entrada.nextLine();

        System.out.print("Digite o número da sua conta: ");
        int conta = entrada.nextInt();
        
        entrada.nextLine(); // Consumir o caractere de nova linha

        System.out.print("Digite o número da sua agência: ");
        String agencia = entrada.nextLine();

        System.out.print("Digite o saldo da sua conta: ");
        double saldo = entrada.nextDouble();

        System.out.println("Olá, " + nome + ", sua conta " + conta + " da agência " + agencia + " tem saldo de R$ " + saldo);

        entrada.close();
    }
}
