public class PrincipalPessoa{
    public static void main(String arg[]){

        Leitura l = new Leitura();

        Usuario u = new Usuario();

        Entregador e = new Entregador();

        boolean vai = true;
        boolean vai2 = true;
        boolean vai3 = true;
        boolean vai4 = true;
        boolean vaib = true;
        boolean vaic = true;
//=====================================================================================
        u.call_Imp_Mae();
        u.impDados();
        u.setNome(l.entDados("\nNOME.....: "));
        while(vai){
            try{
                u.setRg(Long.parseLong(l.entDados("\nRG......: ")));
                vai = false;
            }
            catch(IdPeqException ide){
                ide.impIdPeq();
            }
            catch(NumberFormatException nfe){
                System.out.println("\n O rg deve ser um numero inteiro");
            }
        }
        while(vai2){
            try{
                u.setCpf(Long.parseLong(l.entDados("\nCPF.....: ")));
                vai2 = false;
            }
            catch(NumberFormatException nfe){
                System.out.println("\n O cpf deve ser um numero inteiro");
            }
        }
        u.setTel(Long.parseLong(l.entDados("\nTELEFONE.: ")));
        u.setEndereco(l.entDados("\nENDERECO....: "));
        u.setEmail(l.entDados("\nEMAIL....: "));

//=====================================================================================
        e.call_Imp_Mae();
        e.impDados();
        e.setNome(l.entDados("\nNOME....: "));
        while(vai3){
            try{
                e.setRg(Long.parseLong(l.entDados("\nRG......: ")));
                vai3 = false;
            }
            catch(IdPeqException ide){
                ide.impIdPeq();
            }
            catch(NumberFormatException nfe){
                System.out.println("\n O rg deve ser um numero inteiro");
            }
        }

        while(vaib){
            try{
                e.setCpf(Long.parseLong(l.entDados("\nCPF.....: ")));
                vaib = false;
            }
            catch(NumberFormatException nfe){
                System.out.println("\n O cpf deve ser um numero inteiro");
            }
        }
        e.setTel(Long.parseLong(l.entDados("\nTELEFONE: ")));
        e.setVeiculo(l.entDados("\nVEICULO...: "));
        e.setLocal(l.entDados("\nLOCAL.....: "));

//=================================================================================

//===================================================================================

        System.out.println("\t---------USUARIO---------\t");
        System.out.println("\nNOME....: "+u.getNome());
        System.out.println("\nRG......: "+u.getRg());
        System.out.println("\nCPF.....: "+u.getCpf());
        System.out.println("\nTELEFONE.: "+u.getTel());
        System.out.println("\nORCAMENTO: "+u.getEndereco());
        System.out.println("\nEMAIL....: "+u.getEmail());


        System.out.println("\t---------ENTREGADOR---------\t");
        System.out.println("\nNOME....: "+e.getNome());
        System.out.println("\nRG......: "+e.getRg());
        System.out.println("\nCPF.....: "+e.getCpf());
        System.out.println("\nTELEFONE.: "+e.getTel());
        System.out.println("\nVEICULO.: "+e.getVeiculo());
        System.out.println("\nLOCAL.....: "+e.getLocal());

        System.out.println("\t\nCADASTRO REALIZADO COM SUCESSO");








    }
}

