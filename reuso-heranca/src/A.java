public class A {

    protected int x ,y;
    private int z;
    public A( int a, int b, int c){

        x = a;
        y = b;
        z = c;


    }

    public int obterX(){
        return this.x;
    }
    public int obterY(){
        return this.y;
    }

    public int obterz(){
        return this.z;
    }

    public void alterarX(int a){
        this.x = a;
    }

    public  void alterarY(int b){
        this.y = b;
    }

    public void alterarZ(int c){
        this.z = c;
    }


    public void imprimeValores(){
        System.out.println("estou na classe A");
        System.out.print("\nvalor de x é "+ this.x);
        System.out.print("\nvalor de x é "+ this.y);
        System.out.print("\nvalor de x é "+ this.z);

    }
}
