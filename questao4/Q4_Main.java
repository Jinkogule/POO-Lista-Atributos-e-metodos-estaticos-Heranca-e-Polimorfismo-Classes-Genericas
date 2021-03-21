package lista4.questao4;

public class Q4_Main {
    public static void main(String[] args) {
        Retangulo retangulo1 = new Retangulo();
        retangulo1.setRetangulo(10, 15);
        System.out.println("Área de um retângulo: "+retangulo1.calculaArea());

        Quadrado quadrado1 = new Quadrado();
        quadrado1.setQuadrado(5);
        System.out.println("Área de um quadrado: "+quadrado1.calculaArea());

        Circulo circulo1 = new Circulo();
        circulo1.setCirculo(7);
        System.out.println("Área de um círculo: "+circulo1.calculaArea());

        Triangulo triangulo1 = new Triangulo();
        triangulo1.setTriangulo(7, 4);
        System.out.println("Área de um triângulo: "+triangulo1.calculaArea());
    }
}



