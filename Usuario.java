public class Usuario extends Pessoa implements Cadastro{


    private String enderco ;
    private String email;

    //===================================
//SOBREESCRITA
    public void impDados(){
        System.out.println("\n-----USUARIO-----");
    }
    public void call_Imp_Mae(){
        super.impDados();

    }
    public void impFim(){
        System.out.println("\nUSUARIO registrado");
    }

//===================================


    public void setEnderco(String endereco){
        this.endereco = enreco;
    }
    public void setEmail(String email){
        this.email = email;
    }

    public String getEmail(){
        return email;
    }
    public int getEndereco(){
        return endereco;
    }


}
