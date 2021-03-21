package lista4.questao3;

public class Q3_Main {
    public static void main(String[] args) {
        Pessoa trisha = new Pessoa("Trisha",26);
        Pessoa hohenheim = new Pessoa("Hohenheim", 439);

        Pessoa edward = new Pessoa("Edward", 5, hohenheim, trisha);
        Pessoa alphonse = new Pessoa("Alphonse", 3, hohenheim, trisha);

        Familia elric = new Familia("Elric", edward, hohenheim, trisha);
        elric.setIrmao(alphonse);

        elric.imprimeFamilia();
    }
}
