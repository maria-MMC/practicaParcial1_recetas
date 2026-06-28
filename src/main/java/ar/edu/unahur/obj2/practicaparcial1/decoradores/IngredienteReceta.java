package ar.edu.unahur.obj2.practicaparcial1.decoradores;

import ar.edu.unahur.obj2.practicaparcial1.recetas.IReceta;

public abstract class IngredienteReceta implements IReceta {
    private final IReceta receta;

    public IngredienteReceta(IReceta receta) {
        this.receta = receta;
    }

    @Override
    public Integer getAniosTradicion() {
        return receta.getAniosTradicion();
    }

    @Override
    public String getAutor() {
        return receta.getAutor();
    }

    @Override
    public Boolean esTradicional() {
        return receta.getAniosTradicion() >= 20;
    }

    @Override
    public String getNombre() {
        return receta.getNombre() + " con " + getNombreIngrediente();
    }

    protected abstract String getNombreIngrediente();

    @Override
    public Integer getValorNutricionalBase() {
        return getValorNutricionalBase() + getValorNutricionalAdicional();
    }

    protected abstract Integer getValorNutricionalAdicional();
}
