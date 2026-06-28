package ar.edu.unahur.obj2.practicaparcial1.criterios;

import ar.edu.unahur.obj2.practicaparcial1.recetas.IReceta;

public interface ICriterio {
    //LA PARTE DE CRITERIO ES STRATEGY
    Boolean leGusta(IReceta receta);
}
