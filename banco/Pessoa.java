package POO_IFG.POO_IFG.banco;

import java.io.ObjectInputStream.GetField;

public class Pessoa {
    private String nome;
    private int cpf;


    public titular(String nome, int cpf) {
        this.nome = nome;
        this.cpf = cpf;
    }

    public String getNome() {
        return this.nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public int getCpf() {
        return this.cpf;
    }

    public void setCpf(int cpf) {
        this.cpf = cpf;
    }

    public titular nome(String nome) {
        setNome(nome);
        return this;
    }

    public titular cpf(int cpf) {
        setCpf(cpf);
        return this;
    }



}
