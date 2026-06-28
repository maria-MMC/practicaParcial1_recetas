package ar.edu.unahur.obj2.practicaparcial1.clientes;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertFalse;
import static org.junit.jupiter.api.Assertions.assertThrows;
import static org.junit.jupiter.api.Assertions.assertTrue;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import ar.edu.unahur.obj2.practicaparcial1.clientes.criterios.AltoValorNutricional;
import ar.edu.unahur.obj2.practicaparcial1.clientes.criterios.ComeTutti;
import ar.edu.unahur.obj2.practicaparcial1.clientes.criterios.Criterio;
import ar.edu.unahur.obj2.practicaparcial1.excepciones.DniErroneoException;
import ar.edu.unahur.obj2.practicaparcial1.recetas.Receta;
import ar.edu.unahur.obj2.practicaparcial1.recetas.RecetaBase;

public class ClienteTest {

    @Test
    @DisplayName("Que se guarde correctamente el criterio del cliente")
    void test() {
        Criterio criterio = new ComeTutti();

        Cliente c = new Cliente(1234, criterio);

        assertEquals(criterio, c.getCriterio());

    }

    @Test
    @DisplayName("Probar si le gusta una receta basica")
    void testLeGustaEstaReceta() {
        Criterio criterio = new AltoValorNutricional(150);
        Cliente c = new Cliente(1234, criterio);
        Receta unaReceta = new RecetaBase(2, "Pepe", "fideos con manteca", 200);
        Receta otraReceta = new RecetaBase(1, "Pepe", "fideos con queso", 100);

        assertTrue(c.leGustaEstaReceta(unaReceta));
        assertFalse(c.leGustaEstaReceta(otraReceta));
    }

    @Test
    @DisplayName("Probar excepcion de dni")
    void validarDni() {

        assertThrows(DniErroneoException.class, () -> {
            Cliente c = new Cliente(123, new ComeTutti());
        }
    );

    }
}
