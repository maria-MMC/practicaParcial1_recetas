package ar.edu.unahur.obj2.practicaparcial1.clientes.criterios;

import ar.edu.unahur.obj2.practicaparcial1.recetas.Receta;

public interface Criterio {

    Boolean leGusta(Receta receta);

    Receta personalizar(Receta unaReceta);
}
