package ar.edu.unahur.obj2.practicaparcial1.clientes.criterios;

import ar.edu.unahur.obj2.practicaparcial1.recetas.Receta;
import ar.edu.unahur.obj2.practicaparcial1.recetas.ingredientes.Chia;
import ar.edu.unahur.obj2.practicaparcial1.recetas.ingredientes.FrutosSecos;

public class AltoValorNutricional implements Criterio {

    private Integer cantidadMinimaDeCalorias;

    public AltoValorNutricional(Integer cantidadMinimaDeCalorias) {
        this.cantidadMinimaDeCalorias = cantidadMinimaDeCalorias;
    }

    @Override
    public Boolean leGusta(Receta receta) {
        return receta.valorNutricional() > cantidadMinimaDeCalorias;
    }

    @Override
    public Receta personalizar(Receta unaReceta) {
        return new FrutosSecos(new Chia(unaReceta));
    }

}
