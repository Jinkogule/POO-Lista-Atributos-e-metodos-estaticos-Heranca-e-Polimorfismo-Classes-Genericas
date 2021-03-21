package lista4.questao9;

import lista4.questao1_questao2.ConversaoDeUnidadesDeArea;

public class Q9_Main {
    public static void main(String[] args) {
        ConversaoDeUnidadesDeArea matagal = new ConversaoDeUnidadesDeArea(4567);
        ConversaoDeUnidadesDeArea terreno = new ConversaoDeUnidadesDeArea(8776);
        ConversaoDeUnidadesDeArea campo = new ConversaoDeUnidadesDeArea(2345);

        ConversaoDeUnidadesDeArea[] listaex1 = {matagal, terreno, campo};

        System.out.println(somaAreas(listaex1));
    }

    public static <T extends ConversaoDeUnidadesDeArea> float somaAreas(T array[]){
        float soma = 0;
        for (T elemento: array){
            soma += elemento.getMetros_quadrados();
        }
        return soma;
    }
}
