package ar.edu.unahur.obj2.practicaparcial1.decoradores;

import ar.edu.unahur.obj2.practicaparcial1.recetas.IReceta;

public class FrutosSecos extends IngredienteReceta {

    public FrutosSecos(IReceta receta) {
        super(receta);
    }

    @Override
    protected String getNombreIngrediente() {
        return "Frutos secos";
    }

    @Override
    protected Integer getValorNutricionalAdicional() {
        return 594;
    }
    
}
