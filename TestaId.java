import org.junit.jupiter.api.Test;


public class TestaId {
    @Test
    public void VerId(){
       assertAll (() -> {
           return assertEquals(0, PrincipalVerId(0));
       };
    }

}
