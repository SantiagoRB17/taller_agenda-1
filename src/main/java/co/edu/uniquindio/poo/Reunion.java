package co.edu.uniquindio.poo;

import java.time.LocalDate;
import java.time.LocalTime;

import java.util.Collection;
import java.util.LinkedList;


/** Clase que representa las reuniones de la agenda */
public class Reunion {
    public String Descripcion;
    public LocalDate Fecha;
    public LocalTime Hora;
    public Collection<Contacto> asistentes;

    /**
     * Metodo constructor de la clase Reunion
     * 
     * @param Descripcion
     * @param Fecha
     * @param Hora
     */
    public Reunion(String Descripcion, LocalDate Fecha, LocalTime Hora) {
        this.Descripcion = Descripcion;
        this.Fecha = Fecha;
        this.Hora = Hora;
        this.asistentes = new LinkedList<>();
    }

    public String getDescripcion() {
        return Descripcion;
    }

    public LocalDate getFecha() {
        return Fecha;
    }

    public LocalTime getHora() {
        return Hora;
    }

    public void setDescripcion(String descripcion) {
        Descripcion = descripcion;
    }

    public void setFecha(LocalDate fecha) {
        Fecha = fecha;
    }

    public void setHora(LocalTime hora) {
        Hora = hora;
    }

    /**
     * Metodo que permite verificar si un contacto es igual a otro
     * 
     * @param nombre   nombre del contacto
     * @param Telefono telefono del contacto
     * @return falso en caso de no estar repetido, verdadero en caso de estar
     *         repetido
     */
    public boolean verificarContactoAsis(String nombre, String Telefono) {
        boolean centinela = false;
        for (Contacto contactos : asistentes) {
            if (contactos.getNombre().equals(nombre) && contactos.getTelefono().equals(Telefono)) {
                centinela = true;
            }
        }
        return centinela;
    }

    /**
     * Metodo que permite asignar un contacto a la lista de asistentes de la reunion
     * 
     * @param contacto objeto contacto
     */
    public void asignarContactoAsis(Contacto contactos) {
        if (!verificarContactoAsis(contactos.getNombre(), contactos.getTelefono())) {
            asistentes.add(contactos);
        }
    }

    /**
     * Metodo que permite eliminar un contacto de la lista de asistentes de la
     * reunion
     * 
     * @param nombre nombre del contacto a eliminar
     */
    public void eliminarContactoAsis(String nombre) {
        for (Contacto contacto : asistentes) {
            if (contacto.getNombre().equals(nombre)) {
                asistentes.remove(contacto);
                break;
            }
        }
    }

    @Override
    /** Metodo to string que organiza los datos de clase reunion en una cadena */
    public String toString() {
        StringBuilder reunionMensaje = new StringBuilder();
        reunionMensaje.append("Reunión [Descripción=").append(Descripcion)
                .append(", Fecha=").append(Fecha)
                .append(", Hora=").append(Hora)
                .append(", \nAsistentes:\n");

        /**Ciclo que recorre la lista de asistentes y los agrega a cada uno en una nueva línea
         * Esto con el fin de darle orden y estetica al mensaje a la hora de mostrarlo
         */
        for (Contacto asistente : asistentes) {
            reunionMensaje.append(asistente.toString()).append("\n");
        }
        return reunionMensaje.toString();
    }

    
}
