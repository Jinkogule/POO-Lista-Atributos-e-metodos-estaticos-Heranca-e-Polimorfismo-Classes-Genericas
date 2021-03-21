package lista4.questao7;

public enum DiaDaSemana {
    DOMINGO(1),
    SEGUNDA(2),
    TERÇA(3),
    QUARTA(4),
    QUINTA(5),
    SEXTA(6),
    SABADO(7);

    private int valor;

    private DiaDaSemana(int valor) {
        this.valor = valor;
    }

    public int getValor() {
        return valor;
    }
}
