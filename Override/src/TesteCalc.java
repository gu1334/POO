public class TesteCalc {
    public static void main(String[] args) {

        quadrado quad = new quadrado(5);
        Circulo cir = new Circulo(4);

        System.out.println("a area do quadrado é: " + quad.calcularArea());
        System.out.println("o Raio do circulo é: " + cir.calcularArea());


    }
}
