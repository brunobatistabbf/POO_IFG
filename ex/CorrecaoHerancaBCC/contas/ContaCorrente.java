package contas;

import pessoas.PessoaFisica;

public class ContaCorrente extends Conta{
   private PessoaFisica titular;

   public ContaCorrente(int nroConta, int agencia, PessoaFisica titular) {
      super(nroConta, agencia, 0.0);
      this.titular = titular;
   }
   
   public PessoaFisica getTitular() {
      return this.titular;
   }

   public void setTitular(PessoaFisica titular) {
      this.titular = titular;
   }
}
