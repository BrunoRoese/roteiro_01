package com.brunoroese;

public class Professor {
    private String nome;
    private int anosExp;

    public Professor(String nome, int anosExp) {
        this.nome = nome;
        this.anosExp = anosExp;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public int getAnosExp() {
        return anosExp;
    }

    public void setAnosExp(int anosExp) {
        this.anosExp = anosExp;
    }

    public String classifica() {
        return switch(anosExp) {
            case 0,1,2,3,4,5 -> "Assistente";
            case 6,7,8,9,10 -> "Adjunto";
            default -> "Titular";
        };
    }

    @Override
    public String toString() {
        return "Professor [anosExp=" + anosExp + ", nome=" + nome + "]";
    }
}
