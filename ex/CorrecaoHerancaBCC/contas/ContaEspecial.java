package contas;

import pessoas.PessoaFisica;

public class ContaEspecial extends Conta {
   private PessoaFisica titular;

   public ContaEspecial(int nroConta, int agencia, double limite, PessoaFisica titular) {
      super(nroConta, agencia, limite);
      this.titular = titular;
   }

   public PessoaFisica getTitular() {
      return this.titular;
   }

   public void setTitular(PessoaFisica titular) {
      this.titular = titular;
   }
}
