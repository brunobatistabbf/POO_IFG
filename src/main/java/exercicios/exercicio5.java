package exercicios;

import java.util.Scanner;

public class exercicio5 {
    
    public static void main(String[] args) {

     Scanner sc = new Scanner(System.in);
   
    int qtdnumeros = 0;
    int maior = 0;
    int menor = 0;
    float media = 0;
    int numero = 0;
    int numtotal = 0;

    while(numero != -1){
    numero = sc.nextInt();

      if(numero == -1){
      break;
     }

    if(numero > maior){
        maior = numero;
    }

    if(numero < menor){
    menor = numero;
    }
        numtotal = numtotal + numero;
        qtdnumeros++;
    }

        media =  numtotal/qtdnumeros;
        System.out.println("numeros digitados "+qtdnumeros);
        System.out.println("maior numero "+maior);
        System.out.println("menor numero "+menor);
        System.out.println("media dos numeros "+media);


    }

}
