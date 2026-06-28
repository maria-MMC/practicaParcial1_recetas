package ar.edu.unahur.obj2.practicaparcial1.decoradores;

import ar.edu.unahur.obj2.practicaparcial1.recetas.IReceta;

public class RodajasDePalta extends IngredienteReceta{

    public RodajasDePalta(IReceta receta) {
        super(receta);
    }

    @Override
    protected String getNombreIngrediente() {
        return "Rodajas de palta";
    }

    @Override
    protected Integer getValorNutricionalAdicional() {
        return 160;
    }

}
