package ar.edu.unahur.obj2.practicaparcial1.criterios;

import static org.junit.jupiter.api.Assertions.assertTrue;

import java.util.ArrayList;
import java.util.List;

import org.junit.jupiter.api.Test;

import ar.edu.unahur.obj2.practicaparcial1.Cliente;
import ar.edu.unahur.obj2.practicaparcial1.recetas.IReceta;
import ar.edu.unahur.obj2.practicaparcial1.recetas.Receta;

public class ICriterioTest {
    @Test
    void leGustaLaRecetaDeAltoValorNutricionalAlCliente() {
        AltoValorNutricional altoValorNutricional = new AltoValorNutricional(37);
        Cliente cliente = new Cliente(12345678,altoValorNutricional);
        IReceta receta = new Receta("Bizcochuelo","martitegui",500,30);

        assertTrue(cliente.leGustaLaReceta(receta));
    }
    @Test
    void leGustaLaRecetaDeComeTuttiAlCliente() {
        Cliente cliente = new Cliente(12345678);
        Receta receta = new Receta("Bizcochuelo","martitegui",500,30);

        assertTrue(cliente.leGustaLaReceta(receta));
    }
    @Test
    void leGustaLaRecetaDePremiumAlCliente() {
        List<String> autores = new ArrayList<>();
        autores.add("martitegui");
        autores.add("julian");
        autores.add("juan");
        Premium premium = new Premium(autores);

        Cliente cliente = new Cliente(12345678,premium);
        Receta receta = new Receta("Bizcochuelo","martitegui",500,30);

        assertTrue(cliente.leGustaLaReceta(receta));
    }
    @Test
    void leGustaLaRecetaDeTradicionalAlCliente() {
        Tradicional tradicional = Tradicional.getInstancia();
        Cliente cliente = new Cliente(12345678,tradicional);
        Receta receta = new Receta("Bizcochuelo","martitegui",500,30);

        assertTrue(cliente.leGustaLaReceta(receta));
    }
}
