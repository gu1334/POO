public class teste {
    public static void main(String []args){

        tiposEmprestimo tp = new tiposEmprestimo("harry potter",1992,true,false,28);
        tp.imprimir();

        tiposEmprestimo tp1 = new tiposEmprestimo("Forbes",2023,false,true,32);
        tp1.imprimir();
        tiposEmprestimo tp2 = new tiposEmprestimo("Estrela do mar",2003,true,false,29);
        tp2.imprimir();
        tiposEmprestimo tp3 = new tiposEmprestimo("Forbes investimento",2024,false,true,60);
        tp3.imprimir();
        tiposEmprestimo tp4 = new tiposEmprestimo("meu oequno principe",1993,true,false,78);
        tp4.imprimir();
    }
}
