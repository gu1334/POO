public class TestaAluno {
    public static void main(String[] args){
        Aluno a1 = new Aluno("ana", 21,"12424");
       a1.setNome("Gustavo");
        a1.setIdade(21);
        a1.setMatricula("12234");

        System.out.printf("Olá " + a1.getNome() + " sua idade é " + a1.getIdade() + " e a sua matricula é " + a1.getMatricula());


        Aluno a2 = new Aluno("maria", 17,"12fd24");
        a2.setNome("Marcia");
        a2.setIdade(31);
        a2.setMatricula("42fd");

        System.out.printf("\n\nOlá " + a2.getNome() + " sua idade é " + a2.getIdade() + " e a sua matricula é " + a2.getMatricula());

    }

}
