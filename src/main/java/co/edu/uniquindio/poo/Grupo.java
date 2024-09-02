package co.edu.uniquindio.poo;

import java.util.Collection;
import java.util.LinkedList;

/**Clase que representa los grupos de la agenda */
public class Grupo {
    public String Nombre;
    public Categoria categoria;
    public Collection<Contacto> contactos;
    
    public enum Categoria {
        OFICINA, FIESTA, AMIGOS, FAMILIA;
    }

    /**
    * Metodo constructor de la clase Grupo
    * 
    * @param Nombre nombre del grupo
    * @param categoria categoria del grupo
    */
    public Grupo(String Nombre, Categoria categoria) {
        this.Nombre = Nombre;
        this.categoria = categoria;
        contactos = new LinkedList<>();

    }

    public String getNombre() {
        return Nombre;
    }

    public void setNombre(String nombre) {
        Nombre = nombre;
    }

    /**
     * Metodo para verificar que el contacto no este repetido en el grupo 
     * @param nombre nombre del contacto
     * @param telefono telefono del contacto
     * @return retorna false en caso de no estar repetido, retorna true en caso de estar repetido
     */
    public boolean verificarContacto(String nombre, String telefono) {
        boolean centinela = false;
        for (Contacto contacto : contactos) {
            if (contacto.getNombre().equals(nombre) && contacto.getTelefono().equals(telefono)) {
                centinela = true;
            }
        }
        return centinela;
    }
    
    /**
     * Metodo que permite agregar un contacto al grupo
     * @param contacto objeto contacto perteneciente a la coleccion de contactos
     */
    public void agregarContacto(Contacto contacto) {
        if (!verificarContacto(contacto.getNombre(),contacto.getTelefono())) {
            if (contactos.size() < 5) {
                contactos.add(contacto);
            }
        }

    }
    
    /**
     * Metodo que permite eliminar un contacto del grupo
     * @param nombre nombre del contacto
     */
    public void eliminarContacto(String nombre) {
        for (Contacto contacto : contactos) {
            if (contacto.getNombre().equals(nombre)) {
                contactos.remove(contacto);
                break;
            }
        }
    }

    @Override
       public String toString() {
        StringBuilder grupoMensaje = new StringBuilder();
        grupoMensaje.append("Grupo [Nombre=").append(Nombre)
                .append(", Categoria=").append(categoria)
                .append(", \nContactos:\n");

        /**Ciclo que recorre la lista de contactos y los agrega a cada uno en una nueva línea
         * Esto con el fin de darle orden y estetica al mensaje a la hora de mostrarlo
         */
        for (Contacto contacto : contactos) {
            grupoMensaje.append(contacto.toString()).append("\n");
        }
        return grupoMensaje.toString();
    }

   
}
