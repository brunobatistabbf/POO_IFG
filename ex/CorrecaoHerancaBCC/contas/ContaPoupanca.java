package contas;

import pessoas.PessoaFisica;

public class ContaPoupanca extends ContaCorrente {

   public ContaPoupanca(int nroConta, int agencia, PessoaFisica titular) {
      super(nroConta, agencia, titular);
   }

   public boolean rendimento(){
      double saldoAtual = super.getSaldo();
      double rendimento = saldoAtual * 0.005;
      return super.depositar(rendimento);
   }
   
}
