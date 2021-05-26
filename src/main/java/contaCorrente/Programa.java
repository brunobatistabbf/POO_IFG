package contaCorrente;
import contaCorrente.Conta;
import java.util.Scanner;

public class Programa {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int opcao;
        int qtd = 0;

        Conta c1 = new Conta(qtd, null, null, true);

        System.out.println("---------------------------- NOW BANK --------------------------");
        System.out.println("Escolha uma ação: ");
        System.out.println("1- Depositar ");
        System.out.println("2- Sacar ");
        System.out.println("3- Transferir ");
        System.out.println("4- sair ");
        System.out.println("________________________________________________________________");
        opcao = sc.nextInt();

        switch (opcao) {
            case 1:
                System.out.println("Insira o valor a ser depositado ");
                qtd = sc.nextInt();
                c1.depositar(qtd);
                break;
            case 2:
                System.out.println("Insira o valor a ser sacado ");
                qtd = sc.nextInt();
                c1.sacar(qtd);
                break;
            case 3:
                System.out.println("Insira o valor a ser transferido");
                qtd = sc.nextInt();
                c1.transferir(qtd);
                break;
            default:
                System.out.println("Insira um valor valido");
                break;
        }

    }


}
