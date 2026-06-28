package ar.edu.unahur.obj2.practicaparcial1.criterios;

import ar.edu.unahur.obj2.practicaparcial1.recetas.IReceta;

public class Tradicional implements ICriterio {
    //SINGLETON
    //variable STATIC de la unica instancia
    private static Tradicional instancia = new Tradicional();
    
    //constructor privado que no hace nada
    //(para que no se cree mas de una instancia)
    private Tradicional() {}

    //getter de la instancia
    public static Tradicional getInstancia() {
        return instancia;
    }

    @Override
    public Boolean leGusta(IReceta receta) {
        return Boolean.valueOf(receta.esTradicional());
    }
}
