import java.util.Scanner;
import java.util.Locale;

public class ContaTerminal {
    public static void main(String[] args) {
        
        Scanner scanner = new Scanner(System.in).useLocale(Locale.US);

        System.out.println("Por favor, digite seu nome completo");
        String nome = scanner.nextLine();

        System.out.println("agora, numero de sua agencia");
        int Agencia = scanner.nextInt();

        System.out.println("inserir valor de deposito inicial");
        double saldo = scanner.nextDouble();

        String numero = "067-8";


        System.out.println("Ola senhor "+ nome +", obrigado por criar uma conta em nosso banco, sua agencia é "+
         Agencia +", conta "+ numero +" e seu saldo de "+ saldo+" reais ja esta disponivel para saque");
        }
}
