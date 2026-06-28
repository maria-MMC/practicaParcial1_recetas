package ar.edu.unahur.obj2.practicaparcial1.recetas;

public interface IReceta {
    String getNombre();
    String getAutor();
    Integer getValorNutricionalBase(); //se puede Double tambien
    Integer getAniosTradicion();
    Boolean esTradicional();
}
