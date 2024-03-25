public class FuncionarioTerceirizado extends Funcionarios {
    double servicoTerceirizado1 = 0;

    public FuncionarioTerceirizado(String nomeReal, double salarioPorHoraReal, int horasTrabalhadasPorMesReal, double servicoTerceirizado) {
        super(nomeReal, salarioPorHoraReal, horasTrabalhadasPorMesReal);
        this.servicoTerceirizado1 = servicoTerceirizado;
    }

    double calcularSalarioMensal() {
        double salarioMensal = salarioPorHora * horasTrabalhadasPorMes;
        servicoTerceirizado1 = salarioMensal + servicoTerceirizado1;
        return servicoTerceirizado1 ;
    }

    public void imprimir(){
        System.out.println(" Olá " + getNome());
        System.out.println(" O seu salario por hora é de " + getSalarioPorHora());
        System.out.println(" Suas horas trabalhadas foram de " + getHorasTrabalhadasPorMes());
        System.out.println(" O valor a receber é de: " + calcularSalarioMensal());
    }



}
