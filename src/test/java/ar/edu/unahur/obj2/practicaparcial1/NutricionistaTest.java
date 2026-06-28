package ar.edu.unahur.obj2.practicaparcial1;

<<<<<<< HEAD
import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertTrue;
import static org.junit.jupiter.api.DynamicTest.stream;

import java.util.List;

import ar.edu.unahur.obj2.practicaparcial1.recetas.*;

=======
>>>>>>> ca28429bfcdb9d15c00595761ff531dd7bcf19e1
import org.junit.jupiter.api.Test;

public class NutricionistaTest {
    @Test
<<<<<<< HEAD
    void visitarClienteGeneraUnBatidoMagico() {
        Nutricionista nutricionista = Nutricionista.getInstancia();
        Cliente cliente = new Cliente(12345678);

        nutricionista.visitar(cliente);
        IReceta recetaBatido = cliente.getRecetasRecibidas().getFirst();
        assertEquals("Batido Magico",recetaBatido.getNombre());
    }
    @Test
    void agregarReceta_DevuelveEsaRecetaSiendoListaVacia() {
        Nutricionista nutricionista = Nutricionista.getInstancia();
        IReceta receta1 = new Receta("pancho","martitegui",500,10);

        nutricionista.agregarReceta(receta1);
        assertTrue(nutricionista.getRecetasdisponibles().contains(receta1));
=======
    void test() {
        
>>>>>>> ca28429bfcdb9d15c00595761ff531dd7bcf19e1
    }
}
