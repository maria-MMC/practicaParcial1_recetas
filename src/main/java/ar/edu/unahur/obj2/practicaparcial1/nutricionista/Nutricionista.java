package ar.edu.unahur.obj2.practicaparcial1.nutricionista;

import java.util.ArrayList;
import java.util.List;

import ar.edu.unahur.obj2.practicaparcial1.clientes.Cliente;
import ar.edu.unahur.obj2.practicaparcial1.recetas.Receta;
import ar.edu.unahur.obj2.practicaparcial1.recetas.RecetaBase;

public class Nutricionista {

    private List<Receta> disponibles = new ArrayList<>();
    private final String nombre;
    
    public Nutricionista(List<Receta> disponibles, String nombre) {
        this.disponibles = disponibles;
        this.nombre = nombre;
    }

    public List<Receta> getDisponibles() {
        return disponibles;
    }

    public String getNombre() {
        return nombre;
    }

    public void agregarReceta(Receta unaReceta) {
        disponibles.add(unaReceta);
    }

    public void vaciarRecetas() {
        disponibles.clear();
    }

    public void visitarAUnCliente(Cliente unCliente) {

        Receta recetaAEntregar = disponibles.stream()
                .filter(receta -> unCliente.leGustaEstaReceta(receta))
                .findFirst()
                .orElse(new RecetaBase(0, nombre, "batido mágico", 2000));
        
        disponibles.remove(recetaAEntregar);

        recetaAEntregar = unCliente.personalizarReceta(recetaAEntregar);

        unCliente.agregarRecetaALaLista(recetaAEntregar);

    }

}
