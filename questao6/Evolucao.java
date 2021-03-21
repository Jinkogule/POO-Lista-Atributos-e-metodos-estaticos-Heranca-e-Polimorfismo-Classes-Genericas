package lista4.questao6;

import java.util.ArrayList;

public class Evolucao extends Pokemon{

    public Evolucao(Pokemon pokemon, String nome, String tipo, Habilidade habilidade) {
        super(nome, tipo, habilidade);

        this.HP = pokemon.HP + 5;
        this.Atk = pokemon.Atk + 5;
        this.SP_Atk = pokemon.SP_Atk + 5;
        this.Def = pokemon.Def + 5;
        this.SP_Def = pokemon.SP_Def + 5;
        this.speed = pokemon.speed + 5;
        this.nivel = 1;

        for (int i = 0; i < habilidadesAprendidas.size(); i++){
            this.habilidadesAprendidas.add(pokemon.habilidadesAprendidas.get(i));
        }

        this.habilidadesAprendidas.add(habilidade);
    }
}
