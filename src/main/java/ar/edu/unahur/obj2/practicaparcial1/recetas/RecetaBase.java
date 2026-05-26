package ar.edu.unahur.obj2.practicaparcial1.recetas;

public class RecetaBase implements Receta {
    protected String nombre;
    protected String autor;
    protected Integer valorNutricionalBase;
    protected Integer aniosDeTradicion;

    public RecetaBase(Integer aniosDeTradicion, String autor, String nombre, Integer valorNutricionalBase) {
        this.aniosDeTradicion = aniosDeTradicion;
        this.autor = autor;
        this.nombre = nombre;
        this.valorNutricionalBase = valorNutricionalBase;
    }

    @Override
    public String nombre() {
        return nombre;
    }

    @Override
    public String autor() {
        return autor;
    }

    @Override
    public Integer valorNutricional() {
        return valorNutricionalBase;
    }

    @Override
    public Boolean esTradicional() {
        return aniosDeTradicion > 20;
    }

    public Integer getAniosDeTradicion() {
        return aniosDeTradicion;
    }
}
