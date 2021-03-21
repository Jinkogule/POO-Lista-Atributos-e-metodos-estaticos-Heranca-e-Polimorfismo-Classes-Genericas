package lista4.questao7;

public class Q7_Main {
    public static void main(String[] args) {
        DiaDaSemana segunda = DiaDaSemana.SEGUNDA;
        DiaDaSemana domingo = DiaDaSemana.DOMINGO;
        DiaDaSemana quarta = DiaDaSemana.QUARTA;

        System.out.println(Dia.ehDiaUtil(domingo));
        System.out.println(Dia.ehDiaUtil(segunda));
        System.out.println(Dia.ehDiaUtil(quarta));
    }
}
