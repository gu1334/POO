public class Moto extends Veiculo {

    public boolean eletrica;


    public Moto(String marcaReal, String modeloreal, int anoReal, boolean eletricaReal){
        super(marcaReal, modeloreal, anoReal);
        this.eletrica = eletricaReal;
    }

    String verdade(){
        if (eletrica){
            return "é eletrica ";
        }
        return "não é eletrica";
    }


    @Override
    public String toString(){
        return  "\n\n\no marca da sua moto é: " +getMarca()+"\nO modelo é: " + getModelo() + "\no ano de fabricação é " + getAno() +  "\nE a sabemos que ela " + verdade();
    }
}
