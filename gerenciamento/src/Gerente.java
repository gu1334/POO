public class Gerente extends Funcionario{

    private String departamento;

    public Gerente(String nomeReal, int idadeReal, double salarioReal, String departamentoReal){
        super(nomeReal, idadeReal, salarioReal);
        this.departamento = departamentoReal;
    }

    public String getDepartamento(){
        return departamento;
    }
    public void setDepartamento(){
        this.departamento = departamento;
    }

    public void info() {
        System.out.println("\n\nOlá " + this.getNome());
        System.out.println("sei que você tem " + this.getIdade());
        System.out.println("e o seu salario é de " + this.getSalario());
        System.out.println("e o seu departamento é " + this.departamento);
    }
}
