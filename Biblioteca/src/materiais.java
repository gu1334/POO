public class materiais {


    boolean livros;
     boolean revistas;
    protected String titulo;
    private int anoPublicação;





    public materiais(String tituloreal, int anoPublicaçãoreal,boolean livrosreal, boolean revistasreal) {
        titulo = tituloreal;
        anoPublicação = anoPublicaçãoreal;
        livros = livrosreal;
        revistas = revistasreal;

    }


    //utilizo o get para pegar os elementos que estão em protect e em private
    public String getTitulo() {
        return titulo;
    }

    public int getAnoPublicação() {
        return anoPublicação;
    }

//utilizo o set para alterar os dados que estão la dentro
    public void setAnoPublicação(int anoPublicação) {
        this.anoPublicação = anoPublicação;
    }

    public void setTitulo(String titulo) {
        this.titulo = titulo;
    }





}
