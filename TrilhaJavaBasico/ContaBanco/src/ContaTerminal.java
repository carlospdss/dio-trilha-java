import java.util.Scanner;
import java.util.Locale;

public class ContaTerminal {
    public static void main(String[] args) throws Exception {
        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);
          
        System.out.println("Por favor, digite o número da Conta:");
        int numero = sc.nextInt();
        sc.nextLine();

        System.out.println("Agora digite o número da Agência:");
        String agencia = sc.nextLine();
        
        System.out.println("Por favor, digite o seu nome:");
        String nomeDoCliente = sc.nextLine();
        
        System.out.println("Por favor digite o valor a ser depositado:");
        double saldo = sc.nextDouble();

        System.out.printf("Olá %s, obrigado por criar uma conta em nosso banco, sua agência é %s, conta %d e seu saldo de %.2f já está disponível para saque.", nomeDoCliente, agencia, numero, saldo);

        sc.close();
    }
}
