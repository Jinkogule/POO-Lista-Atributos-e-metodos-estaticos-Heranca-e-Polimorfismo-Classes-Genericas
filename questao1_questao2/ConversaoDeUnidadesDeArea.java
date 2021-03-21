package lista4.questao1_questao2;

public class ConversaoDeUnidadesDeArea {
    private static float metros_quadrados;
    private static float centimetros_quadrados;
    private static float pes_quadrados;
    private static float milhas_quadradas;
    private static float acres;

    //(utilizando metros quadrados como a unidade padrão da classe)
    public ConversaoDeUnidadesDeArea(float metros_quadrados){
        this.metros_quadrados = metros_quadrados;
    }
    public float getMetros_quadrados() {
        return this.metros_quadrados;
    }

    //métodos de conversão pedidos no exercício 1:
    public static float converteMetroqParaPes(){
        pes_quadrados = (float)(metros_quadrados*10.76);
        return pes_quadrados;
    }
    public float convertePesParaCmq(){
        centimetros_quadrados = (float)(pes_quadrados*929);
        return centimetros_quadrados;
    }

    public static float converteMilhasqParaAcres() {
        acres = (float)(milhas_quadradas*640);
        return acres;
    }
    public static float converteAcresParaPes(){
        pes_quadrados = (float)(acres/43.560);
        return pes_quadrados;
    }

    //métodos adicionais para o exercício 2:
    public static float converteMetrosqParaAcres(){
        acres = (float)(metros_quadrados/(43560/10.76));
        return acres;
    }
    public static float converteMetrosqParaCmq(){
        centimetros_quadrados = (float)(metros_quadrados*10.76*929);
        return centimetros_quadrados;
    }
}
