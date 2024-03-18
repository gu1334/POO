public class Testaheranca {
    public static void main(String[]args){
        B b1 = new B(1,2,3,4);
        b1.imprimeValores();
        b1.alterarY(20);
        b1.imprimeValores();

        A a1 = new A(3,43,2);
        a1.imprimeValores();
        a1.alterarZ(21);
        a1.imprimeValores();
    }
}
