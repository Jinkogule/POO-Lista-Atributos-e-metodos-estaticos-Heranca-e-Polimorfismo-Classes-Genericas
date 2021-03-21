package lista4.questao8;

public class Par <F, S> {
    private F elemento1;
    private S elemento2;

    public Par(F elemento1, S elemento2){
        this.elemento1 = elemento1;
        this.elemento2 = elemento2;
    }

    public void setElemento1(F elemento1) {
        this.elemento1 = elemento1;
    }

    public F getElemento1() {
        return elemento1;
    }

    public void setElemento2(S elemento2) {
        this.elemento2 = elemento2;
    }

    public S getElemento2() {
        return elemento2;
    }
}
