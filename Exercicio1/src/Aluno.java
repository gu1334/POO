public class Aluno {
    String nome;
    int matricula;
    double nota_mat;
    double nota_por;
    double nota_fis;
    double nota_geo;
    double nota_quim;
    Diciplina diciplinaAluno;

double calcularMedia(){
    double total =  nota_mat + nota_por + nota_fis + nota_geo + nota_quim;
    return total / 5;
}

void situacaoAluno(){
    if (calcularMedia() >= 6){
        System.out.println("Aprovado");
    }else {
        System.out.println("Reprovado");
    }
}
    public Aluno (String nome, int matricula, double nota_mat, double nota_por, double nota_fis, double nota_geo, double nota_quim, Diciplina diciplinaAluno){
   //o this serve para não termos que criar um outro nome aleatorio ou abreviação

    this.nome = nome;
    this.matricula = matricula;
    this.nota_mat = nota_mat;
    this.nota_por = nota_por;
    this.nota_fis = nota_fis;
    this.nota_geo = nota_geo;
    this.nota_quim = nota_quim;
    this.diciplinaAluno = diciplinaAluno;

    }
}
