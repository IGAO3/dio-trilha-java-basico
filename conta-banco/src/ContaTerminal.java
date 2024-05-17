import java.util.Scanner;

public class ContaTerminal {
    public static void main(String[] args) {
       
        Scanner sc = new Scanner(System.in);

        String nome = "Igor Adriano Cordeiro de Matos";

        double saldo = 237.48;

        System.out.println("Plataforma Banco X");
        
        System.out.println("Digite o número da agência: ");
        String agencia = sc.next();

        System.out.println("Digite o número da conta:" );
        int conta = sc.nextInt();

        System.out.println("Olá " + nome + "! Obrigado por criar uma conta em nosso banco. Sua agência é " + agencia + ", conta " + conta + " e seu saldo " + saldo + " já está disponível para saque!");




    }
}
