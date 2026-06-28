package ar.edu.unahur.obj2.practicaparcial1.recetas;

public abstract class IngredienteDecorator implements Receta{

    protected Receta decorado;

    public IngredienteDecorator(Receta decorado) {
        this.decorado = decorado;
    }

    @Override
    public String nombre() {
        return decorado.nombre();
    }

    @Override
    public String autor() {
        return decorado.autor();
    }

    @Override
    public Boolean esTradicional() {
        return decorado.esTradicional();
    }
}
