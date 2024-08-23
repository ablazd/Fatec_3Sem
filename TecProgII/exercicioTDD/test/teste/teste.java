/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/UnitTests/JUnit5TestClass.java to edit this template
 */
package teste;

import exerciciotdd.Controller.Controller;
import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.AfterAll;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

/**
 *
 * @author Alunos
 */
public class teste {
    
    @Test
    public void testRegistraUser() {
        Controller controle = new Controller();
        controle.registraUser("admin", "123");

        assertTrue(controle.validaLogin("admin", "123"), "O usuario deveria conseguir entrar");
    }
    
    @Test
    public void testValidaLoginIncorreto() {
        Controller controle = new Controller();
        controle.registraUser("admin", "senha123");

        assertFalse(controle.validaLogin("admin", "senhaSenha"), "O usuario não deveria conseguir entrar");
    }
    
}
