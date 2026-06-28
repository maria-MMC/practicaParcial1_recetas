package ar.edu.unahur.obj2.practicaparcial1.recetas.ingredientes;

import ar.edu.unahur.obj2.practicaparcial1.recetas.IngredienteDecorator;
import ar.edu.unahur.obj2.practicaparcial1.recetas.Receta;

public class FrutosSecos extends IngredienteDecorator{

    public FrutosSecos(Receta decorado) {
        super(decorado);
    }

    @Override
    public Integer valorNutricional() {
        return decorado.valorNutricional() + 594;
    }

}
