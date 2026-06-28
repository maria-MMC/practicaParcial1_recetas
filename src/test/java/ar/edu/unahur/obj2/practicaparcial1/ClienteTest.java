package ar.edu.unahur.obj2.practicaparcial1;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertTrue;

import java.util.List;

import org.junit.jupiter.api.Test;

import ar.edu.unahur.obj2.practicaparcial1.criterios.AltoValorNutricional;
import ar.edu.unahur.obj2.practicaparcial1.criterios.ComeTutti;
import ar.edu.unahur.obj2.practicaparcial1.criterios.Premium;
import ar.edu.unahur.obj2.practicaparcial1.recetas.IReceta;
import ar.edu.unahur.obj2.practicaparcial1.recetas.Receta;

public class ClienteTest {
    @Test
    void leGustaLaReceta_DevuelveTrueSiLaAcepta() {
        Cliente cliente = new Cliente(12345678);
        IReceta receta1 = new Receta("pancho","martitegui",500,10);

        cliente.recibirReceta(receta1);
        assertTrue(cliente.leGustaLaReceta(receta1));
    }
    @Test
    void elValorTotalDeRecetasEs1500() {
        IReceta receta1 = new Receta("pancho","martitegui",500,10);

        Cliente cliente = new Cliente(12345678);
        cliente.recibirReceta(receta1);

        assertEquals(500, cliente.valorTotalRecetas(receta1));
    }
    //GETTERS Y SETTERS
    @Test
    void getterDni_Devuelve12345678() {
        Cliente cliente = new Cliente(12345678);

        assertEquals(12345678, cliente.getDni());
    }
    @Test
    void setterCriterioComeTutti_DevuelveComeTutti() {
        Cliente cliente = new Cliente(12345678);
        ComeTutti comeTutti = new ComeTutti();
        cliente.setCriterio(comeTutti);

        assertEquals(comeTutti, cliente.getCriterio());
    }
    @Test
    void setterCriterioPremium_DevuelvePremium() {
        Cliente cliente = new Cliente(12345678);
        Premium premium = new Premium(List.of("martitegui", "julian", "juan"));
        cliente.setCriterio(premium);

        assertEquals(premium, cliente.getCriterio());
    }
    @Test
    void setterCriterioAltoValorNutricional_DevuelveAltoValorNutricional() {
        AltoValorNutricional altoValorNutricional = new AltoValorNutricional(500);
        Cliente cliente = new Cliente(12345678,altoValorNutricional);

        assertEquals(altoValorNutricional, cliente.getCriterio());
    }
    
}
