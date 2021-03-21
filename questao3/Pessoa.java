package lista4.questao3;

public class Pessoa {
    protected String nome;
    private int idade;
    protected static Pessoa pai;
    protected static Pessoa mae;

    public Pessoa(String nome, int idade){
        this.nome = nome;
        this.idade = idade;
    }
    public Pessoa(String nome, int idade, Pessoa pai, Pessoa mae){
        this.nome = nome;
        this.idade = idade;
        this.pai = pai;
        this.mae = mae;
    }

    public Pessoa(String nome) {
    }

    public String getNomePai(){
        return this.pai.getNome();
    }
    public String getNomeMae(){
        return this.mae.getNome();
    }

    public String getNome(){
        return nome;
    }


}

