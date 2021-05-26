package tarefa1;

import java.util.Scanner;

public class exercicio3 {
    public static void main(String[] args) {
        int numero1 = 1;
        int numero2 = 0;
        
        Scanner sc =  new Scanner(System.in);
        System.out.println("Insira o tamanho da sequencia:");
        int tamanho = sc.nextInt();
        System.out.println("Quantidade de elementos: "+tamanho);
        System.out.println(numero1);
        System.out.println(numero2);

        for(int i = 0; i < tamanho; i++){
            numero1 = numero1 + numero2;
            numero2 = numero1 - numero2;
            System.out.println(numero1);



        }
    }
}
