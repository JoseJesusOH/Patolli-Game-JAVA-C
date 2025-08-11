package entidades;

import java.io.Serializable;

/**
 * Clase que representa el dinero del jugador.
 */
public class Dinero implements Serializable{

    /**
     * Cantidad de dinero
     */
    private double cantidad;

    /**
     * Constructor vacio
     */
    public Dinero() {
    }

    /**
     * constructor que iniciliaza la cantidad.
     *
     * @param cantidad
     */
    public Dinero(double cantidad) {
        this.cantidad = cantidad;
    }

///Metodos get, set y toString
    public double getCantidad() {
        return cantidad;
    }

    public void setCantidad(double cantidad) {
        this.cantidad = cantidad;
    }
//Metodo ToString
    @Override
    public String toString() {
        return "Dinero{" + "cantidad=" + cantidad + '}';
    }

}
