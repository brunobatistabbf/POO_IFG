package pessoas;

public class PessoaJuridica extends Pessoa {
   private String cnpj;
   private String nomeFantasia;

   public PessoaJuridica(String nome, String telefone, String endereco, String cnpj, String nomeFantasia) {
      super(nome, telefone, endereco);
      this.cnpj = cnpj;
      this.nomeFantasia = nomeFantasia;
   }

   public String getCnpj() {
      return this.cnpj;
   }

   public void setCnpj(String cnpj) {
      this.cnpj = cnpj;
   }

   public String getNomeFantasia() {
      return this.nomeFantasia;
   }

   public void setNomeFantasia(String nomeFantasia) {
      this.nomeFantasia = nomeFantasia;
   }

   @Override
   public boolean validarDocumento() {
      if(this.cnpj.length() == 14){
         return true;
      }
      return false;
   }

}
