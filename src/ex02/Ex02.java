import java.util.ArrayList;

class Forma { double area() { return 0; } }
class Quadrado extends Forma { double lado; Quadrado(double lado){this.lado=lado;} double area(){return lado*lado;} }
class Circulo extends Forma { double raio; Circulo(double raio){this.raio=raio;} double area(){return 3.14159*raio*raio;} }

public class Ex02 {
    public static void main(String[] args) {
        ArrayList<Forma> formas = new ArrayList<>();
        formas.add(new Quadrado(3));
        formas.add(new Circulo(1));
        double total = 0;
        for (Forma forma : formas) {
            total += forma.area();
        }
        System.out.printf("Total: %.2f%n", total);
    }
}