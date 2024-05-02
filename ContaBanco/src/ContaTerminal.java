import java.util.Scanner;

public class ContaTerminal {
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);

        System.out.println("Olá, seja bem-vindo ao banco X!");
        System.out.print("Por favor, digite o seu nome: ");
        String nome = entrada.nextLine();

        System.out.print("Digite o númeor da sua conta: ");
        int conta = entrada.nextInt();

        System.out.print("Digite o número da sua agência: ");
        String agencia = entrada.next();

        System.out.print("Digite o saldo da sua conta: ");
        double saldo = entrada.nextDouble();

        System.out.println("Olá, " + nome + ", sua conta " +
                conta + " da agência " + agencia + " tem saldo de R$ " + saldo);

        entrada.close();
    }
}
