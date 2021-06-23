package banco;

import java.io.ObjectInputStream.GetField;
public class Pessoa {
    private String nome;
    private int cpf;


    public Pessoa(String nome, int cpf) {
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

    public Pessoa nome(String nome) {
        setNome(nome);
        return this;
    }

    public Pessoa cpf(int cpf) {
        setCpf(cpf);
        return this;
    }



}
