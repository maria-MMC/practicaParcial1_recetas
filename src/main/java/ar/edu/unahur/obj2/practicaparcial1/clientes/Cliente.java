package ar.edu.unahur.obj2.practicaparcial1.clientes;

import java.util.ArrayList;
import java.util.List;

import ar.edu.unahur.obj2.practicaparcial1.clientes.criterios.Criterio;
import ar.edu.unahur.obj2.practicaparcial1.excepciones.DniErroneoException;
import ar.edu.unahur.obj2.practicaparcial1.recetas.Receta;

public class Cliente {
    private final Integer DNI;
    private Criterio criterio;
    private List<Receta> recetasRecibidas = new ArrayList<>();

    public Cliente(Integer DNI, Criterio criterio) {
        this.DNI = validarDni(DNI);
        this.criterio = criterio;
    }

    private Integer validarDni(Integer dni){
        if (dni < 1000) {
            throw new DniErroneoException();
        }
        return dni;
    }

    public Integer getDNI() {
        return DNI;
    }

    public Criterio getCriterio() {
        return criterio;
    }

    public void setCriterio(Criterio criterio) {
        this.criterio = criterio;
    }

    public void agregarRecetaALaLista(Receta unaReceta){
        recetasRecibidas.add(unaReceta);
    }

    public List<Receta> getRecetasRecibidas() {
        return recetasRecibidas;
    }

    public Boolean leGustaEstaReceta(Receta unaReceta){
        return criterio.leGusta(unaReceta);
    }

    public Receta personalizarReceta(Receta unaReceta){
        return criterio.personalizar(unaReceta);
    }

}
