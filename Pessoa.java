public abstract class Pessoa{

    private long rg;
    private String nome;
    private long tel;
    private long cpf;
//============================================

    public Pessoa(){
        rg = 0;
        nome = "";
        tel = 0;
        cpf = 0;
    }

    public Pessoa(long rg, String nome, long tel, long cpf){

        this.rg = rg;
        this.nome = nome;
        this.tel = tel;
        this.cpf = cpf;
    }
    public void impDados(){
        System.out.println("\t---------REGISTRO---------\t");

    }
    public void impDados(String valor){
        System.out.println("\t---------CADASTRO--------\t"+ valor);

    }

//===========================================

    public void setRg(long rg) throws IdPeqException{
        if(rg > 0){
            this.rg = rg;
        }
        else{
            throw new IdPeqException();
        }
    }
    public void setNome(String nome){
        this.nome = nome;
    }
    public void setTel(long tel){

        this.tel = tel;

    }
    public void setCpf(long cpf){
        this.cpf = cpf;


    }

    public long getRg(){
        return rg;
    }
    public String getNome(){
        return nome;
    }
    public long getTel(){
        return tel;
    }
    public long getCpf(){
        return cpf;
    }
}
