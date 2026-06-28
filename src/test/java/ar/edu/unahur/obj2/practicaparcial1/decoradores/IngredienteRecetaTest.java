package ar.edu.unahur.obj2.practicaparcial1.decoradores;

import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.api.Test;

import ar.edu.unahur.obj2.practicaparcial1.recetas.IReceta;
import ar.edu.unahur.obj2.practicaparcial1.recetas.Receta;

public class IngredienteRecetaTest {
    @Test
    void recetaBizcochueloConFrutosSecosDevuelveBizcochuelo_con_Frutos_secos() {
        IReceta receta = new FrutosSecos(new Receta("Bizcochuelo","martitegui",1000,10));

        assertEquals("Bizcochuelo con Frutos secos", receta.getNombre());
    }
    @Test
    void recetaTostadaConRodajasDePaltaDevuelveTostada_con_Rodajas_de_palta() {
        IReceta receta = new RodajasDePalta(new Receta("Tostada","martitegui",1000,10));

        assertEquals("Tostada con Rodajas de palta", receta.getNombre());
    }
    @Test
    void recetaPanConSemillasDeChiaDevuelvePan_con_Semillas_de_chia() {
        IReceta receta = new SemillasDeChia(new Receta("Pan","martitegui",1000,10));

        assertEquals("Pan con Semillas de chia", receta.getNombre());
    }
}
