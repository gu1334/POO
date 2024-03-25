public class Produto {

    protected String nome;
    protected double precoUnitario;
    protected int quantidadeEmEstoque;


    public Produto(String nomeReal, double precoUnitarioReal, int quantidadeEmEstoqueReal){
        this.nome = nomeReal;
        this.precoUnitario = precoUnitarioReal;
        this.quantidadeEmEstoque = quantidadeEmEstoqueReal;
    }

    public String getNome() {
        return nome;
    }
    public double getPrecoUnitario() {
        return precoUnitario;
    }
    public int getQuantidadeEmEstoque() {
        return quantidadeEmEstoque;
    }
    public void setNome(String nome) {
        this.nome = nome;
    }
    public void setPrecoUnitario(double precoUnitario) {
        this.precoUnitario = precoUnitario;
    }
    public void setQuantidadeEmEstoque(int quantidadeEmEstoque) {
        this.quantidadeEmEstoque = quantidadeEmEstoque;
    }



    public int adicionarEstoque(int quantidade){
        if (quantidadeEmEstoque >= 0){
            return quantidadeEmEstoque = quantidadeEmEstoque + quantidade ;
        }else {
            return Integer.parseInt("\nEstoque com erro\n");
        }
    }

    public int removerEstoque(int quantidade){
        if (quantidadeEmEstoque >= 1){
            return quantidadeEmEstoque = quantidadeEmEstoque - quantidade ;
        }else {
            return Integer.parseInt("\nEstoque insuficiente\n");
        }

    }


}
