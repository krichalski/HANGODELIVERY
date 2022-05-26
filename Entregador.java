public class Entregador extends Pessoa implements Cadastro{


    private String veiculo;
    private String local;

//===================================

    public void impDados(){
        System.out.println("\n---ENTREGADOR---");
    }
    //SOBRESCRITA
    public void call_Imp_Mae(){
        super.impDados();

    }
    public void impFim(){
        System.out.println("\nENTREGADOR registrado");
    }


//===================================

    public void setVeiculo(String veiculo){
        this.veiculo = veiculo;
    }
    public void setLocal(String local){
        this.local = local;
    }




    public String getVeiculo(){
        return veiculo;
    }
    public String getLocal(){
        return local;
    }

}
