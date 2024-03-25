public class Funcionarios {

    protected String nome;
    protected double salarioPorHora;
    protected int horasTrabalhadasPorMes;


    public Funcionarios(String nomeReal, double salarioPorHoraReal, int horasTrabalhadasPorMesReal) {
        this.nome = nomeReal;
        this.salarioPorHora = salarioPorHoraReal;
        this.horasTrabalhadasPorMes = horasTrabalhadasPorMesReal;
    }

    public String getNome() {
        return nome;
    }

    public double getSalarioPorHora() {
        return salarioPorHora;
    }

    public int getHorasTrabalhadasPorMes() {
        return horasTrabalhadasPorMes;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public void setSalarioPorHora(double salarioPorHora) {
        this.salarioPorHora = salarioPorHora;
    }

    public void setHorasTrabalhadasPorMes(int horasTrabalhadasPorMes) {
        this.horasTrabalhadasPorMes = horasTrabalhadasPorMes;
    }
}
