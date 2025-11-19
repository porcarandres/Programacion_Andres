package Tema3_ProgramacionModular;
public class Tema3_v2Ejercicio1 {

    public static class MyMath {
        public static double squarePerimeter(double lado) {
            return 4 * lado;
        }
        public static double squareArea(double lado) {
            return lado * lado;
        }
        public static double rectanglePerimeter(double base, double altura) {
            return 2 * (base + altura);
        }
        public static double rectangleArea(double base, double altura) {
            return base * altura;
        }
        public static double circlePerimeter(double radio) {
            return 2 * Math.PI * radio;
        }
        public static double circleArea(double radio) {
            return Math.PI * radio * radio;
        }
    }
    public static void main(String[] args) {
        System.out.println("Perimetro del cuadrado: " + MyMath.squarePerimeter(5)+"Area del cuadrado: " + MyMath.squareArea(5));
        System.out.println("Perimetro del rectángulo: " + MyMath.rectanglePerimeter(4, 6)+"Area del rectangulo: " + MyMath.rectangleArea(4, 6));
        System.out.println("Perimetro del círculo: " + MyMath.circlePerimeter(3)+"Area del circulo: " + MyMath.circleArea(3));

    }
}

