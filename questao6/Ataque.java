package lista4.questao6;

public class Ataque extends Habilidade{
    protected int precisao;
    protected int potencia;
    protected int quantidade;

    public Ataque(String nome, String efeito, int precisao, int potencia, int quantidade){
        super(nome, efeito);
        this.precisao = precisao;
        this.potencia = potencia;
        this.quantidade = quantidade;
    }
}
