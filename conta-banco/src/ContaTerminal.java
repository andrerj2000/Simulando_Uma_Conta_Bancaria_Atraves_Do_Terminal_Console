import java.util.Locale;
import java.util.Scanner;

public class ContaTerminal {
    int numeroConta;
    String agencia;
    String nomeCliente;
    Double saldo = 237.48;

    Scanner entrada = new Scanner(System.in);
    
    public void cadastrarCliente(){
        //Entrada via terminal, nome do usuario, agencia e conta
        System.out.println("Entre com o nome do cliente: ");
        this.nomeCliente = entrada.nextLine();

        System.out.println("Entre com o número da sua Agência, xxx-x :");
        this.agencia = entrada.nextLine();

        System.out.println("Entre com o número da Conta: ");
        this.numeroConta = entrada.nextInt();

    }

    public void listaCliente(){
        System.out.println("Olá " + this.nomeCliente + " , obrigado por criar uma conta em nosso banco, sua agência é " +
         this.agencia + " , conta " + this.numeroConta + " e seu saldo " + this.saldo + " já está disponível para saque!");
    }
}
