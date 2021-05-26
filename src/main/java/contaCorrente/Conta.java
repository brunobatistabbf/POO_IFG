package contaCorrente;

public class Conta {
    //Atributos
    int saldo;
    String usuario;
    String tipoDeConta;
    int id;
    boolean status;
    
    //Construtores
    public Conta(int saldo, String usuario, String tipoDeConta, boolean status) {
        saldo = 0;
        tipoDeConta = "Conta Corrente";
        status = true;
    }

    //Metodos
    void sacar(int x){
        if (saldo > 0) {
            saldo = saldo - x;
            System.out.println("O valor foi sacado!");
            System.out.println("Saldo: "+saldo); 
        }else{
            System.out.println("Saldo insuficiente");
            saldo = 0;
        }
    }

    void depositar(int y){
        if (saldo >= 0) {
            saldo = saldo + y;
            System.out.println("Depositado com sucesso");
            System.out.println("Saldo: "+saldo);
        }else{
            saldo = 0;
            System.out.println("Sua conta estava negativada");
            System.out.println("Resolvemos isso! Agora tente novamente");
        }
    }
    void transferir (int quantia) {
        if (saldo > 0) {
            saldo = saldo - quantia;
            System.out.println("Trasnferencia feit com sucesso");
            System.out.println("Saldo: "+saldo);
        }else{
            saldo = 0;
            System.out.println("Saldo insuficiente");
            System.out.println("Deposite um valor");
        }
    }




}
