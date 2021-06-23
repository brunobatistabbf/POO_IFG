package banco;

public class Conta {
   private int nroConta;
   private int agencia;
   private double saldo;
   private Pessoa titular;

   public Conta ( Pessoa titular, int nroConta, int agencia){
      this.nroConta = nroConta;
      this.agencia = agencia;
      this.titular = titular;
      this.saldo = 0.0;
   }

   public void getDados() {
      System.out.println(this.nroConta);
      System.out.println(this.agencia);
      System.out.println(this.saldo);
      
   }
   public int getNroConta() {
       return nroConta;
   }

   public void setNroConta(int nroConta) {
      this.nroConta = nroConta;
   }

   public void setAgencia(int agencia) {
      this.agencia = agencia;
   }

   public void setSaldo(double saldo) {
      this.saldo = saldo;
   }

   public Pessoa getTitular() {
      return this.titular;
   }

   public void setTitular(Pessoa titular) {
      this.titular = titular;
   }


   public boolean depositar(double valor){
      if(valor > 0){
         this.saldo += valor;
         return true;
      }
      return false;
   }


   public boolean sacar(double valor){
      if(valor > 0 && valor <= this.saldo){
         this.saldo -= valor;
         return true;
      }
      return false;
   }

   public boolean transferir(float valor, Conta conta){
      if(this.sacar(valor)){
         conta.depositar(valor);
         return true;
      }
      return false;
   }
   

}
