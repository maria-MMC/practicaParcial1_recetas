package ar.edu.unahur.obj2.practicaparcial1.decoradores;

import ar.edu.unahur.obj2.practicaparcial1.recetas.*;

public class SemillasDeChia extends IngredienteReceta {

    public SemillasDeChia(IReceta receta) {
        super(receta);
    }

    @Override
    protected String getNombreIngrediente() {
        return "Semillas de chia";
    }

    @Override
    protected Integer getValorNutricionalAdicional() {
        return 490;
    }

}
