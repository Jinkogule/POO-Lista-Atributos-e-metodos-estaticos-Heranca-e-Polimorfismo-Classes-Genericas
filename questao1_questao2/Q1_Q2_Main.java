package lista4.questao1_questao2;

public class Q1_Q2_Main {
    public static void main(String[] args) {
        ConversaoDeUnidadesDeArea campo_de_futebol = new ConversaoDeUnidadesDeArea(8250);

        System.out.println("Área do campo de futebol em pés quadrados: "+campo_de_futebol.converteMetroqParaPes());
        System.out.println("Área do campo de futebol em acres: "+campo_de_futebol.converteMetrosqParaAcres());
        System.out.println("Área do campo de futebol em centímetros quadrados: "+campo_de_futebol.converteMetrosqParaCmq());
    }
}
