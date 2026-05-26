package ar.edu.unahur.obj2.practicaparcial1.clientes;

import static org.junit.jupiter.api.Assertions.assertEquals;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import ar.edu.unahur.obj2.practicaparcial1.clientes.criterios.ComeTutti;
import ar.edu.unahur.obj2.practicaparcial1.clientes.criterios.Criterio;

public class ClienteTest {

    @Test
    @DisplayName("Que se guarde correctamente el criterio del cliente")
    void test() {
        Criterio criterio = new ComeTutti();

        Cliente c = new Cliente(1234, criterio);

        assertEquals(criterio, c.getCriterio());

    }
}
