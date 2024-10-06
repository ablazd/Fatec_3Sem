
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;
import Controller.Controller;

public class ExercicioTeste {
    
    @Test
    public void testRegistraEValidaUser() {
        Controller controle = new Controller();
        controle.registraUser("admin", "senha123");

        assertTrue(controle.validaLogin("admin", "senha123"), "O usuario deveria conseguir entrar");
    }

    @Test
    public void testValidaLoginIncorreto() {
        Controller controle = new Controller();
        controle.registraUser("admin", "senha123");

        assertFalse(controle.validaLogin("admin", "senhaSenha"), "O usuario não deveria conseguir entrar");
    }
}
