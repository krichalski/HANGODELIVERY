

public class PrincipalProduto{
    public static void main(String arg[]){

        Leitura l = new Leitura();

        Produto p = newProduto();



//=====================================================================================

        p.setNome(l.entDados("\nNOME.....: "));
        p.setId(Integer.parseInt(l.entDados("\nID.: ")));
        p.setTipo(l.entDados("\nTIPO....: "));
        p.setValidade(l.entDados("\nVALIDADE....: "));

//=====================================================================================


        System.out.println("\t---------PRODUTO---------\t");
        System.out.println("\nNOME....: "+p.getNome());
        System.out.println("\nTIPO......: "+p.getTipo());
        System.out.println("\nID.....: "+p.getId());
        System.out.println("\nVALIDADE.: "+p.getValidade());


        System.out.println("\t\nCADASTRO REALIZADO COM SUCESSO");




    }
}
