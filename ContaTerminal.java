import java.util.Scanner;
import java.util.Locale;

public class ContaTerminal {
    public static void main(String[] args) {

        Locale.setDefault(Locale.US);
        Scanner entrada = new Scanner(System.in);

        System.out.println("Por favor, digite o número da Agência !");
        String agencia = entrada.nextLine();
        System.out.println("Por favor, digite o seu nome!");
        String nomeCliente = entrada.nextLine();
        System.out.println("Por favor, digite o seu saldo!");
        double saldo = entrada.nextDouble();
        System.out.println("Por favor, digite a sua conta !");
        int numero = entrada.nextInt();

        System.out.printf("Olá " + nomeCliente + ", obrigado por criar uma conta em nosso banco, sua agencia é "
                + agencia + ", conta " + numero + " e seu saldo %.2f já está disponível para saque.", saldo);
        entrada.close();
    }

}
