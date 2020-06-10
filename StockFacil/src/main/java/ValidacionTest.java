import org.junit.AfterClass;
import org.junit.BeforeClass;
import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import java.util.Scanner;

import static org.junit.jupiter.api.Assertions.*;

class ValidacionTest {


@BeforeEach
    void setUp() {
    }

    @AfterEach
    void tearDown() {
    }

    @Test
    void validarLetras() {
    String palabra="hola1";
    boolean esperado=false;
    boolean real=Validacion.validarLetras(palabra);
    assertEquals(esperado,real);
    }
}