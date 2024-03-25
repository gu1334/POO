public class Testeproduto {

    public static void main(String [] args){

        Produto p1 = new Produto("Mouse",15.75,5);
        Produto p2 = new Produto("geladeira",156.5,10);


        System.out.println("\n\n Produto: " + p1.getNome() + "\n Valor unitario: " + p1.getPrecoUnitario() + "\n Quantidade no estoque: " + p1.getQuantidadeEmEstoque());
        p1.adicionarEstoque(1);
        System.out.println("\n\n Produto: " + p1.getNome() + "\n Valor unitario: " + p1.getPrecoUnitario() + "\n Quantidade no estoque: " + p1.getQuantidadeEmEstoque());
        p1.removerEstoque(6);
        System.out.println("\n\n Produto: " + p1.getNome() + "\n Valor unitario: " + p1.getPrecoUnitario() + "\n Quantidade no estoque: " + p1.getQuantidadeEmEstoque());

        System.out.println("\n\n-------------------------------------------------------------------");

        System.out.println("\n\n Produto: " + p2.getNome() + "\n Valor unitario: " + p2.getPrecoUnitario() + "\n Quantidade no estoque: " + p2.getQuantidadeEmEstoque());
        p2.adicionarEstoque(50);
        System.out.println("\n\n Produto: " + p2.getNome() + "\n Valor unitario: " + p2.getPrecoUnitario() + "\n Quantidade no estoque: " + p2.getQuantidadeEmEstoque());
        p2.removerEstoque(3);
        System.out.println("\n\n Produto: " + p2.getNome() + "\n Valor unitario: " + p2.getPrecoUnitario() + "\n Quantidade no estoque: " + p2.getQuantidadeEmEstoque());

    }
}
