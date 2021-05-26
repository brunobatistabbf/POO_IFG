package exercicios;

import java.security.DrbgParameters.NextBytes;
import java.util.Scanner;

import javax.naming.event.NamingExceptionEvent;

public class exercicio2 {
    public static void main(String[] args) {

    //valor a sacar
    int valor; 
    int nota50 = 50;
    int nota10 = 10;
    int nota5 = 5;
    int nota1 = 1; 
    
    Scanner sc = new Scanner(System.in);

    System.out.println("*****Vamos tentar fornecer menas notas possiveis!*****");
    System.out.println("Insira o valor a ser sacado.");
    valor = sc.nextInt();

    //notas 50, 10, 5 e 1
    if(nota50 >= nota50) {
        nota50 = valor / 50; 
        valor = valor % 50;   
        if (nota50!= 0)
            System.out.println(nota50 + " notas de R$ 50,00");
    } 
    if(nota10 >= nota10) {
        nota10 = valor / 10;
        valor = valor % 10;
        if (nota10 != 0)
            System.out.println(nota10 + " notas de R$ 10,00");
    }
    
    if(nota5 >= nota5) {
        nota5 = valor / 5;
        valor = valor % 5;
        if (nota5 != 0)
            System.out.println(nota5 + " notas de R$ 5,00"); 
    }
    
    if(nota1 >= nota1) {
        nota1 = valor / 1;
        valor = valor % 1;
        if (nota1 != 0)
            System.out.println(nota1 + " notas de R$ 1,00");
     }
  }
}
