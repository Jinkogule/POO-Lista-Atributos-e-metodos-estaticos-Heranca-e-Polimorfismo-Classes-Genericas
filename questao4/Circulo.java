package lista4.questao4;

public class Circulo extends Quadrado {
    private float raio;

    public void setCirculo(float raio){
        this.raio = raio;
    }
    public float calculaArea(){
        this.area = (float)(3.14*(this.raio*this.raio));
        return this.area;
    }
}
