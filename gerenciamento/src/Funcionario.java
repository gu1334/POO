public class Funcionario {
    private String nome;
    private int idade;
    private double salario;
    public Funcionario(String nomeReal, int idadeReal, double salarioReal){
        nome = nomeReal;
        idade = idadeReal;
        salario = salarioReal;
    }
    public String getNome(){
        return nome;
    }
    public int getIdade(){
        return idade;
    }
    public double getSalario(){
        return salario;
    }
    public void setNome(String nome) {
        this.nome = nome;
    }
    public void setIdade(int idade){
        this.idade = idade;
    }
    public void setSalario(double salario){
        this.salario = salario;
    }

    public void info() {
        System.out.println("\n\nOlá " + this.nome);
        System.out.println("sei que você tem " + this.idade);
        System.out.println("e o seu salario é de " + this.salario);
    }
}
