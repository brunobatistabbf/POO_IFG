package contas;

public abstract class Conta{
   private int nroConta;
   private int agencia;
   private double limite;
   private double saldo;

   public Conta(int nroConta, int agencia, double limite){
      this.nroConta = nroConta;
      this.agencia = agencia;
      this.limite = limite;
      this.saldo = 0.0;
   }

   public double getSaldo(){
      return this.saldo;
   }

   protected void setSaldo(double saldo){
      this.saldo = saldo;
   }

   
   public int getAgencia() {
      return this.agencia;
   }

   public void setAgencia(int agencia) {
      this.agencia = agencia;
   }

   public boolean depositar(double valor){
      if(valor > 0){
         this.saldo += valor;
         return true;
      }
      return false;
   }

   public boolean sacar(double valor){
      if(valor > 0 && valor <= (this.saldo + this.limite)){
         this.saldo -= valor;
         return true;
      }
      return false;
   }

   
   public boolean transferir(double valor, Conta conta){
      if(this.sacar(valor)){
         conta.depositar(valor);
         return true;
      }
      return false;
   }

   public void extrato(){//Totalmente errado fazer isso!
      System.out.println("<<<<< Dados da Conta >>>>>");
      //System.out.println("Nome titular: "+this.titular.getNome());
      System.out.println("Número conta: "+this.nroConta);
      System.out.println("Saldo R$"+this.saldo);
      System.out.println("-------------------------------\n\n");
   }

   @Override
   public String toString() {
      return "<<< NroConta: "+this.nroConta+" , Saldo: R$"+this.saldo+" >>>";
   }
}
