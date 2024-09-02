package co.edu.uniquindio.poo;

import java.time.LocalDate;
import java.time.LocalTime;
import java.time.format.DateTimeParseException;

import javax.swing.JOptionPane;

import co.edu.uniquindio.poo.Grupo.Categoria;

public class Interfaces {
    /**
     * Metodo que permite al usuario ingresar la hora de la reunion
     * 
     * @return
     */
    public String ingresarHora() {
        String ingresarHora = JOptionPane.showInputDialog("Ingrese la hora de la reunión (Hora:Minuto:Segundo):");
        return ingresarHora;
    }

    /**
     * Metodo que permite al usuario ingresar la fecha de la reunion
     * 
     * @return
     */
    public String ingresarFecha() {
        String ingresarFecha = JOptionPane.showInputDialog("Ingrese la fecha de la reunión (Año-Mes-Día)");
        return ingresarFecha;
    }

    /**
     * Metodo de tipo LocalDate en el que se declara la fecha de la reunion
     * 
     * @param fecha
     * @return
     */
    public LocalDate declararFecha(String fecha) {
        try {
            // Intenta parsear la cadena de fecha usando LocalDate
            LocalDate fechaReunion = LocalDate.parse(fecha);
            return fechaReunion;
        } catch (DateTimeParseException e) {
            // Maneja la excepción en caso de que la cadena no esté en un formato válido
            System.err.println("Error: La fecha proporcionada no tiene un formato válido.");
            return null; // O podrías lanzar una excepción personalizada si lo prefieres
        }
    }

    /**
     * Metodo de tipo LocalTime en el que se declara la hora de la reunion
     * 
     * @param Hora
     * @return
     */
    public LocalTime declararHora(String Hora) {
        try {
            // Intenta parsear la cadena de hora usando LocalTime
            LocalTime horaReunion = LocalTime.parse(Hora);
            return horaReunion;
        } catch (DateTimeParseException e) {
            // Maneja la excepción en caso de que la cadena no esté en un formato válido
            System.err.println("Error: La hora proporcionada no tiene un formato válido.");
            return null; // O podrías lanzar una excepción personalizada si lo prefieres
        }
    }

    /**
     * Metodo que permite ingresar el nombre del grupo
     * 
     * @return
     */
    public String ingresarNombreGrupo() {
        String nombreGrupo = JOptionPane.showInputDialog("Ingrese el nombre del grupo: ");
        return nombreGrupo;
    }

    public void convertirCategoria() {
        Categoria[] categoriasDelGrupo = Categoria.values();// Este metodo permite llamar todos los valores del atributo
                                                            // de tipo enum categoria que se encuentra en la clase de
                                                            // grupo y almacenarlas en un arreglo
        String[] categoriaGrupo = new String[categoriasDelGrupo.length];// Este metodo permite convertir cada valor a
                                                                        // tipo cadena para poder mostrarlo como un
                                                                        // botion en el metodo de JOptionPane
        for (int i = 0; i < categoriasDelGrupo.length; i++) { // Este ciclo recorre todo el arreglo de las categorias
                                                              // para convertir cada posicion en texto, usando el
                                                              // operador name que permite convertir un valor de tipo
                                                              // enum a string
            categoriaGrupo[i] = categoriasDelGrupo[i].name();
        }

    }

    public static Categoria categoriaSeleccion(Object[] categoriaGrupo) {
        int categoriaSeleccion = JOptionPane.showOptionDialog(null,
                "Ingrese la categoria del grupo (OFICINA, FIESTA, AMIGOS, FAMILIA;): ", "Categoria", 0,
                JOptionPane.QUESTION_MESSAGE, null, categoriaGrupo, "");// Metodo que permite al usuario ingresar la
                                                                        // categoria del grupo
        return categoriaSeleccion(categoriaGrupo);
    }

    public Enum categotiaSeleccionada(Object[] categoriasDelGrupo,Object[] categoriaSeleccion){
        Categoria categoriaSeleccionada=null; //Esta variable incializada en null permitira que atravez de un ciclo for esta se pase a tener un valor de tipo enum, esta variable se creo para que al crear un nuevo grupo este recibiera por parametro un valor de tipo enum con el cual puede crear un nuevo objeto en la clase grupo
        if (categoriaSeleccion >= 0 && categoriaSeleccion < categoriasDelGrupo.length) { //Esta condicion crea un rango y dependiendo del valor seleccionado le asigna a la variable vacia de categoriaSeleccionada el valor enum correspondiente
            categoriaSeleccionada= categoriasDelGrupo[categoriaSeleccion];
        }
    }
}
