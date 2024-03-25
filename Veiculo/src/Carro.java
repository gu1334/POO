public class Carro extends Veiculo{

    public int numeroDePortas;
    public Carro(String marcaReal, String modeloreal, int anoReal, int numeroDePortasReal){
        super(marcaReal, modeloreal, anoReal);
        this.numeroDePortas = numeroDePortasReal;
    }
@Override
    public String toString(){
    return  "\n\n\no marca do carro é: " +getMarca()+"\nO modelo é: " + getModelo() + "\no ano de fabricação é " + getAno() +  "\nE a quantidade de portas é: " + numeroDePortas;

}

}
