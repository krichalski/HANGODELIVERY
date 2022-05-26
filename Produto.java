public abstract class Produto{

    private String tipo;
    private String nome;
    private int id;
    private String validade;
//============================================

    public Pessoa(){
        id = 0;
        nome = "";
        tipo = "";
        validade = "";
    }

    public Pessoa(String tipo, String nome, int id, String validade){

        this.id = id;
        this.nome = nome;
        this.validade = validade;
        this.tipo = tipo;
    }
    public void impDados(){
        System.out.println("\t---------REGISTRO---------\t");

    }
    public void impDados(String valor){
        System.out.println("\t---------CADASTRO--------\t"+ valor);

    }

//===========================================

    public void setId(int id){

        this.id = id;

    }
    public void setNome(String nome){
        this.nome = nome;
    }
    public void setTipo(String tipo){

        this.tipo = tipo;

    }
    public void setValidade(String validade){
        this.validade = validade;


    }

    public int getId(){
        return id;
    }
    public String getNome(){
        return nome;
    }
    public String getTipo(){
        return tipo;
    }
    public String getValidade(){
        return validade;
    }
}
