package pessoas;

public class PessoaFisica extends Pessoa{
   private String cpf;

   public PessoaFisica(String nome, String telefone, String endereco, String cpf) {
      super(nome, telefone, endereco);
      this.cpf = cpf;
   }

   public String getCpf() {
      return this.cpf;
   }

   public void setCpf(String cpf) {
      this.cpf = cpf;
   }

   @Override
   public boolean validarDocumento() {
      if(this.cpf.length() == 11){
         return true;
      }
      return false;
   }
   
}
