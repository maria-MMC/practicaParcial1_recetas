package ar.edu.unahur.obj2.practicaparcial1.clientes.criterios;

import java.util.List;

import ar.edu.unahur.obj2.practicaparcial1.recetas.Receta;

public class Premium implements Criterio{

    private List<String> autoresPreferidos;

    public Premium(List<String> autoresPreferidos) {
        this.autoresPreferidos = autoresPreferidos;
    }

    @Override
    public Boolean leGusta(Receta receta) {
        return autoresPreferidos.contains(receta.autor());
    }

    @Override
    public Receta personalizar(Receta unaReceta) {
        return unaReceta;
    }

}
