package Ventanas;

import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import validar.Validacion;

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
    boolean real= Validacion.validarLetras(palabra);
    assertEquals(esperado,real);
    }
}