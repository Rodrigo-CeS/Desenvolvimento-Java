import java.util.Locale;
import java.util.Scanner;

public class ContaTerminal {
    public static void main(String[] args) throws Exception {

        Scanner scan = new Scanner(System.in).useLocale(Locale.US);

        System.out.print("Por favor, digite o número da conta! ");
        int numero = scan.nextInt();
        scan.nextLine();
        System.out.print("Agora, digite o número da sua agência: ");
        String agencia = scan.nextLine();
        System.out.print("Digite seu nome: ");
        String nomeCliente = scan.nextLine();
        System.out.print("Digite o saldo atual: ");
        double saldo = scan.nextDouble();

        System.out.println("\nOlá " + nomeCliente + ", obrigado por criar uma conta em nosso banco, sua agência é "
                + agencia + ", conta " + numero + " e seu saldo " + saldo + " já está disponível para saque.");

        scan.close();
    }
}
