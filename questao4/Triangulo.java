package lista4.questao4;

public class Triangulo extends Quadrado {
    private float base;

    public void setTriangulo(float base, float altura){
        this.base = base;
        this.altura = altura;
    }
    public float calculaArea(){
        this.area = (this.base*this.altura)/2;
        return this.area;
    }
}
