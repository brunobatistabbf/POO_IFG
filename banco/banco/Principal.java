package banco;

import java.util.ArrayList;
import java.util.Scanner;

public class Principal {
   public static void main(String[] args) {
      ArrayList<Conta> listaContas = new ArrayList<Conta>();
      Scanner sc = new Scanner(System.in);
      boolean enquanto =  true;
      float saque, deposito, transferencia;
      String nome; 
      int opcao, agencia, numero, conta1, conta2, cpf;

      do {
         System.out.println("-------------BANK NOW--------------");
         System.out.println("<<<<<<<< Seja bem vindo ao Bank Now >>>>>>");
         System.out.println("1-Criar conta");
         System.out.println("2-Exibir extrato");
         System.out.println("3-Sacar");
         System.out.println("4-Depositar");
         System.out.println("5-Transferir");
         System.out.println("6-Sair");
         System.out.println("-------------------------------------");
   
         System.out.println("Escolha uma opção de operação");
         opcao= sc.nextInt();
         if (opcao == 1) {
            System.out.println("Bem vindo ao cadastro de contas fast :");
            System.out.println("Me informe seu nome e sobrenome:");
            nome = sc.nextLine();
            System.out.println("Informe seu CPF:");
            cpf = sc.nextInt();
            System.out.println("Informe o numero da agencia na qual esta cadastrando:");
            agencia = sc.nextInt();
            System.out.println("Qual o numero da conta a qual enviamos no seu email: ");
            numero = sc.nextInt();
            listaContas.add(new Conta(new Pessoa(nome, cpf), numero, agencia));
            System.out.println("Parabens pelo cadastro!!!");
            System.out.println("O NOW agradece sua confiança!");
            System.out.println("Sua conta já está pronta para uso.");            
         } else if (opcao == 2) {
            System.out.println("Informe numero da conta:");
            numero = sc.nextInt();
            for (Conta conta : listaContas) {
              if(conta.getNroConta() == numero){
                conta.getDados();
              }
              break;
            }
            
         }else if (opcao == 3){
            System.out.println("Informe numero da conta:");
            numero = sc.nextInt();
            for (Conta conta : listaContas) {
            if(conta.getNroConta() == numero){
            System.out.println("Bem vindo a area de saques");
            System.out.println("Qual o valor a ser sacado: ");           
            saque = sc.nextFloat();
            if (conta.sacar(saque)) {
              System.out.println("Saque realizado com sucesso!");
            }else{
              System.out.println("Erro!!! Saldo insuficiente!");
              System.out.println("Ou verifique o numero da conta.");
            }
             break;
            }
         }  
      
         }else if (opcao == 4){
            System.out.println("Bem vindo(a) a area de depositos! ");
            System.out.println("Informe numero da conta:");
            numero = sc.nextInt();
            for (Conta conta : listaContas) {
               if(conta.getNroConta() == numero){
                  System.out.println("Quanto quer depositar?");
                  deposito = sc.nextFloat();
                  if (conta.depositar(deposito)) {
                  System.out.println("Deposito realizado com sucesso!");
                  System.out.println("Obrigado por usar os sistemas NOW!");
                  }else{
                  System.out.println("Error! Tente novamente");
                  }
                  break;
               }
            }

         }else if (opcao == 5){
            System.out.println("Informe o numero da conta recebedora: ");
            conta1 = sc.nextInt();
            for (Conta conta : listaContas) {
              if(conta.getNroConta() == conta1){
                System.out.println("Informe o numero da conta que recebera:");
                conta2 = sc.nextInt();
                System.out.println("Entre com o valor da transferencia: ");
                transferencia = sc.nextFloat();
                for (Conta contaa : listaContas) {
                  if(contaa.getNroConta() == conta2){
                    conta.transferir(transferencia, contaa);
                    System.out.println("Transferido com sucesso");
                  }
                }
                break;
              }
            }

         }else if (opcao == 6){
            System.out.println("Obrigado por usar os sistemas Bank NOW");
            System.out.println("Até a proxima!");
            System.out.println("Saindo...|||");
            enquanto = false;

         }else{
          System.out.println("Insira uma opção valida!");
         }
   
     
      } while (enquanto == true);
    
   sc.close();  
   }
}
