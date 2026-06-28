package ar.edu.unahur.obj2.practicaparcial1.recetas;

import static org.junit.jupiter.api.Assertions.assertFalse;
import static org.junit.jupiter.api.Assertions.assertTrue;

import org.junit.jupiter.api.Test;

public class RecetaTest {
    @Test
    void esTradicionalDevuelveFalseAlSerMenorDe20() {
        IReceta receta = new Receta("Pan","martitegui",1000,10);

        assertFalse(receta.esTradicional());
    }
    @Test
    void esTradicionalDevuelveTrueAlSerMayorDe20() {
        IReceta receta = new Receta("Pan","martitegui",1000,25);

        assertTrue(receta.esTradicional());
    }
}
