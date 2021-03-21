package lista4.questao4;

public class Quadrado {
    protected float altura;
    protected float largura;
    protected float area;

    public void setQuadrado(float aresta){
        this.altura = aresta;
        this.largura = aresta;
    }

    public float calculaArea(){
        this.area = this.altura*this.largura;
        return this.area;
    }
}
