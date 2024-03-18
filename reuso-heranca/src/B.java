public class B extends A{
    private int k;

    public B(int a, int b, int c, int d){
        super(a,b,c);
        this.k = d;
    }
    public void imprimeValores(){
        System.out.println("estou na classe B ");
        System.out.println("\no valor de x é: " + this.x);
        System.out.println("\no valor de y é: " + this.y);
        System.out.println("\no valor de k é: " + this.k);
        System.out.println("\nZ não é visivel nesta classe pois ele é private");
        System.out.println("\no valor de z é: " + this.obterz());
    }
}
