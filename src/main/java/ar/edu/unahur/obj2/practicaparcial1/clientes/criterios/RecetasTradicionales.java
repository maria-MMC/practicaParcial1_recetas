package ar.edu.unahur.obj2.practicaparcial1.clientes.criterios;

import ar.edu.unahur.obj2.practicaparcial1.recetas.Receta;
import ar.edu.unahur.obj2.practicaparcial1.recetas.ingredientes.Palta;

public class RecetasTradicionales implements Criterio {

    @Override
    public Boolean leGusta(Receta receta) {
        return receta.esTradicional();
    }

    @Override
    public Receta personalizar(Receta unaReceta) {
        return new Palta(unaReceta);
    }

}
