package ar.edu.unahur.obj2.practicaparcial1.clientes.criterios;

import ar.edu.unahur.obj2.practicaparcial1.recetas.Receta;

public class ComeTutti implements Criterio{

    @Override
    public Boolean leGusta(Receta receta) {
        return Boolean.TRUE;
    }

    @Override
    public Receta personalizar(Receta unaReceta) {
        return unaReceta;
    }
    

}
