package POO_IFG.POO_IFG.banco;

import java.io.ObjectInputStream.GetField;

public class pessoa {
    private String nome;
    private int documento;

    public  pessoa(String nome, int documento) {
        this.nome = nome;
        this.documento = documento;
    }

    public String getNome() {
        return this.nome;
    }
    
    public String getDocumento() {
        return this.documento;
    }

}
