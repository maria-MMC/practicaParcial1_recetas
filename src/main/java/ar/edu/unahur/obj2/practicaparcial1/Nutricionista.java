package ar.edu.unahur.obj2.practicaparcial1;

import java.util.ArrayList;
import java.util.List;
import ar.edu.unahur.obj2.practicaparcial1.recetas.*;

public class Nutricionista {
    //SINGLETON
    //siempre que es singleton va a tener todo static
    private static Nutricionista instancia = new Nutricionista();
    private static final List<IReceta> recetasDisponibles = new ArrayList<>();
    private static String nombre = "Lic.Escofier";

    private Nutricionista() {}
    
    public static Nutricionista getInstancia() {
        return instancia;
    }

    public static String getNombre() {
        return nombre;
    }

    public static void setNombre(String nombre) {
        Nutricionista.nombre = nombre;
    }

    public void agregarReceta(IReceta receta) {
        recetasDisponibles.add(receta);
    }

    public void visitar(Cliente cliente) {
        //findFirst() busca la primera receta que cumpla con la condicion
        IReceta recetaAEntregar = recetasDisponibles.stream().filter(r -> cliente.leGustaLaReceta(r))
                .findFirst().orElse(new Receta("Batido Magico", nombre, 2000, 0));
        cliente.recibirReceta(recetaAEntregar);
    }//cuando se hace new va una clase (Receta), NO interfaz (IReceta)

    public List<IReceta> getRecetasdisponibles() {
        return recetasDisponibles;
    }


}
