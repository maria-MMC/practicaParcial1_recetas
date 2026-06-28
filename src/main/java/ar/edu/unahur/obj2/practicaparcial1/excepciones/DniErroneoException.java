package ar.edu.unahur.obj2.practicaparcial1.excepciones;

public class DniErroneoException extends RuntimeException{

    public DniErroneoException() {
        super("dni incorrecto");
    }

    public DniErroneoException(String message) {
        super(message);
    }


}
