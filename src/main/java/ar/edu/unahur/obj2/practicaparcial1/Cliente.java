package ar.edu.unahur.obj2.practicaparcial1;

import java.util.ArrayList;
import java.util.List;

import ar.edu.unahur.obj2.practicaparcial1.criterios.*;
import ar.edu.unahur.obj2.practicaparcial1.recetas.*;

public class Cliente {
    private final Integer dni;
    //se inicializa porque empieza por default como Come Tutti
    private ICriterio criterio = new ComeTutti();
    private List<IReceta> recetasRecibidas = new ArrayList<IReceta>();

    //no pone la lista en el constructor porque:
    //1- en la variable ya la inicializa vacia
    //2- nos evita crear una lista nueva
    public Cliente(Integer dni, ICriterio criterio) {
        this.dni = dni;
        this.criterio = criterio;
    }

    //lo mismo con el criterio
    //lo inicializa por default como Come Tutti
    public Cliente(Integer dni) {
        this.dni = dni;
    }

    public Integer getDni() {
        return dni;
    }

    public ICriterio getCriterio() {
        return criterio;
    }

    public List<IReceta> getRecetasRecibidas() {
        return recetasRecibidas;
    }

    public void recibirReceta(IReceta receta) {
        recetasRecibidas.add(receta);
    }

    public void setCriterio(ICriterio criterio) {
        this.criterio = criterio;
    }

    public Integer valorTotalRecetas(IReceta receta) {
        return receta.getValorNutricionalBase();
    }

    public Boolean leGustaLaReceta(IReceta receta) {
        return Boolean.valueOf(criterio.leGusta(receta));
    }
}
