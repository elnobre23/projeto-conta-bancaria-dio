import java.util.Scanner;

public class ContaTerminal{   
        
    public static void main(String [] args){
        
        Scanner scanner = new Scanner(System.in);

        System.out.print("Por favor, digite o número da conta: ");
        int numero = scanner.nextInt();

        System.out.print("Por favor, digite o número da agência: ");
        String agencia = scanner.next();

        System.out.print("Por favor, digite seu nome: ");
        String nomeCliente = scanner.next();

        System.out.print("Por favor, digite seu sobrenome: ");
        String sobrenomeCliente = scanner.next();

        System.out.print("Por favor, digite seu saldo bancário: ");
        double saldo = scanner.nextDouble();

        System.out.println("Olá " + nomeCliente + " " + sobrenomeCliente + " obrigado por criar uma conta em nosso banco, sua agência é " + 
        agencia + ", sua conta é " + numero + " e seu saldo R$ " + saldo + 
        " já está disponível para saque.");
    }
}
