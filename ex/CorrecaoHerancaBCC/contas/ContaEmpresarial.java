package contas;

import pessoas.PessoaJuridica;

public class ContaEmpresarial extends Conta{
   private PessoaJuridica titular;

   public ContaEmpresarial(int nroConta, int agencia, double limite, PessoaJuridica titular) {
      super(nroConta, agencia, limite);
      this.titular = titular;
   }

   public PessoaJuridica getTitular() {
      return this.titular;
   }

   public void setTitular(PessoaJuridica titular) {
      this.titular = titular;
   }
}
