public class tiposEmprestimo extends materiais {



    public int diasComTitulo = 0;
    double valor = 0;
    double total = 0;

    public tiposEmprestimo (String tituloreal,int anoPublicaçãoreal,boolean livrosreal, boolean revistasreal, int diasComTitulo1){
        super(tituloreal, anoPublicaçãoreal,livrosreal,revistasreal);

        this.diasComTitulo = diasComTitulo1;;




    }


int multa(){
    if (this.livros){
        if (diasComTitulo >= 30 || diasComTitulo <=40 ){
            valor = diasComTitulo - 30;
            total = valor * 0.5;
            System.out.print("o valor da multa foi do livro foi de R$" + total + " por estrapolar " + valor + " dias ");
        }else if (diasComTitulo >= 41){
            valor = diasComTitulo - 30;
            total = valor * 1.4;
            System.out.print("o valor da multa foi do livro foi de R$"  + total + " por estrapolar " + valor + " dias ");
        }else {
            System.out.println("erro");
        }
    }else if (this.revistas){
        if (diasComTitulo >= 30 || diasComTitulo <=40 ){
            valor = diasComTitulo - 30;
            total = valor * 0.2;
            System.out.print("o valor da multa foi da revista foi de R$"  + total + " por estrapolar " + valor + " dias ");
        }else if (diasComTitulo >= 41){
            valor = diasComTitulo - 30;
            total = valor * 0.3;
            System.out.print("o valor da multa foi da revista foi de R$"  + total + " por estrapolar " + valor + " dias ");
        }else {
            System.out.println("erro 2");
        }
    } else {
        System.out.println("erro 1");
    }


    return 0;
}





    public void imprimir(){
        System.out.println(" O seu titulo é :" + this.titulo);
        System.out.println(" O ano de publicação é: " + this.getAnoPublicação());
        System.out.print(multa());
    }

}
