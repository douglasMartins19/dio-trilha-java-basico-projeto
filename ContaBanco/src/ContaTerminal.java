import java.util.Scanner;

public class ContaTerminal {
    public static void main(String[] args) throws Exception {
        
        Scanner scanner = new Scanner(System.in);

        String numeroAgencia;
        int numeroConta;
        String nomeCliente;
        double saldoSaque;
        
        System.out.println("Por favor, digite o número da sua agência:");
        numeroAgencia = scanner.nextLine();

        System.out.println("Por favor, digite o número da sua conta:");
        numeroConta = scanner.nextInt();

        System.out.println("Por favor, digite o nome do titular da conta:");
        nomeCliente = scanner.next();

        System.out.println("Por favor, digite o valor para saque:");
        saldoSaque = scanner.nextDouble();

        System.out.println("Olá " + nomeCliente +", obrigado por criar uma conta em nosso banco, sua agência é " + numeroAgencia +", conta " + numeroConta +" e seu saldo de " + saldoSaque + " já está disponível para saque.");
    }
}
