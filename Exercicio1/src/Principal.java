public class Principal {
    public static void main(String[] args) {

        Diciplina d1 = new Diciplina("POO", 6);
        Aluno a1 = new Aluno("Gustavo", 12120339, 2, 8, 4, 3, 10, d1);

        System.out.printf("Olá " + a1.nome+  " sua matricula é "+ a1.matricula+ " e temos uma noticia para você, sua materia de "+ a1.diciplinaAluno.nome +" foi alterada para a cargo horaria de " +a1.diciplinaAluno.cargaHoraria + "\na sua media foi" + a1.calcularMedia() +" \n" + "e você foi " );
        a1.situacaoAluno();


    }
}
