package lista4.questao7;

public class Dia {
    public static boolean ehDiaUtil(DiaDaSemana dia){
        if (dia.getValor() > DiaDaSemana.DOMINGO.getValor() && dia.getValor() < DiaDaSemana.SABADO.getValor()){
            return true;
        }
        else{
            return false;
        }
    }
}
