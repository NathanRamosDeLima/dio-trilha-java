import java.util.Scanner;

public class ContaTerminal {
    public static void main(String[] args) throws Exception {
        Scanner scanner = new Scanner(System.in);

        // Solicitando e lendo número da agência
        System.out.print("Por favor, digite o número da Agência: ");
        String agencia = scanner.nextLine().trim();

        // Solicitando e lendo número da conta
        System.out.print("Agora, digite o número da Conta: ");
        int numero = scanner.nextInt();
        scanner.nextLine(); // Consumir a quebra de linha pendente

        // Solicitando e lendo nome do cliente
        System.out.print("Digite o nome do Cliente: ");
        String nomeCliente = scanner.nextLine().trim();

        // Solicitando e lendo saldo da conta
        System.out.print("Por fim, digite o saldo inicial da conta: ");
        double saldo = scanner.nextDouble();

        // Mensagem de saudação com as informações coletadas
        System.out.println("\nOlá " + nomeCliente + ", obrigado por criar uma conta em nosso banco,");
        System.out.println("sua agência é " + agencia + ", conta " + numero + " e seu saldo " + saldo + " já está disponível para saque.");
        
        // Fechando o scanner
        scanner.close();
    }
}
