package lista4.questao6;

import java.util.ArrayList;

public class Pokemon {
    private String nome;
    private String tipo;
    protected int nivel;
    protected int HP;
    protected int Atk;
    protected int SP_Atk;
    protected int Def;
    protected int SP_Def;
    protected int speed;
    private ArrayList<Ataque> ataquesAprendidos = new ArrayList<>();
    protected ArrayList<Habilidade> habilidadesAprendidas = new ArrayList<>();

    public Pokemon(String nome, String tipo, Habilidade habilidade){
        this.tipo = tipo;
        if (tipo == "Água"){ //atributos base
            this.HP = 3;
            this.Atk = 2;
            this.SP_Atk = 6;
            this.Def = 3;
            this.SP_Def = 6;
            this.speed = 4;
            this.nivel = 1;
        }
        else if (tipo == "Fogo"){ //atributos base
            this.HP = 3;
            this.Atk = 5;
            this.SP_Atk = 10;
            this.Def = 2;
            this.SP_Def = 2;
            this.speed = 2;
            this.nivel = 1;
        }
        //faltaria implementar outros tipos
    }
    public void aprendeAtaque(Ataque ataque){
       this.ataquesAprendidos.add(ataque);
    }
    public void executaAtaque(Ataque ataque, Pokemon pokemon){
        if (ataque.efeito == "Ferir"){
            if (ataquesAprendidos.contains(ataque)){
                if (ataque.quantidade >= 1){
                    ataque.quantidade -= 1;
                    if (ataque.precisao > pokemon.speed){
                        pokemon.HP -= ataque.potencia - pokemon.Def;
                    }
                    System.out.println("O inimigo desviou do ataque.");
                }
                else{
                    System.out.println("Não se pode mais executar este ataque.");
                }
            }
            else {
                System.out.println("Seu pokemon não possui este ataque.");
            }
        }
        else{
            //implementar efeito de outros tipos de ataque
        }
    }
}
