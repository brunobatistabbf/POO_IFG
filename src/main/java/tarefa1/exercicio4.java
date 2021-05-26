package tarefa1;

import java.util.Scanner;

public class exercicio4 {
    public static void main(String[] args) {
        System.out.println("Insira o tamanho do vetor: \n");
        Scanner sc = new Scanner(System.in);
        int x = sc.nextInt();

        int[] vetor = new int[x];

        for(int i = 0; i < vetor.length; i++){
            System.out.println("Digite um numero: ");
            vetor[i] = sc.nextInt();
            System.out.println("posicao: " + (i+1) + " = " + vetor[i] );
            
        }
        System.out.println("Vetor ao contrario");
        for(int i = vetor.length-1; i >= 0; i--){
            System.out.print(vetor[i]);
        }

    }


}
