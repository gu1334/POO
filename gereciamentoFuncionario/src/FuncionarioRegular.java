public class FuncionarioRegular extends Funcionarios{


    public FuncionarioRegular(String nomeReal, double salarioPorHoraReal, int horasTrabalhadasPorMesReal) {
        super(nomeReal, salarioPorHoraReal, horasTrabalhadasPorMesReal);
    }


    double calcularSalarioMensal() {

        return (double) (salarioPorHora * horasTrabalhadasPorMes);
    }

    public void imprimir(){
        System.out.println(" Olá " + getNome());
        System.out.println(" O seu salario por hora é de " + getSalarioPorHora());
        System.out.println(" Suas horas trabalhadas foram de " + getHorasTrabalhadasPorMes());
        System.out.println(" O valor a receber é de: " + calcularSalarioMensal());
    }


}
