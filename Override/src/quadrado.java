public class quadrado extends FormaGeometrica{

    private double lado;
    @Override
    public double calcularArea() {
        return this.lado * lado;
    }

    public quadrado(double lado){
        this.lado = lado;
    }
}
