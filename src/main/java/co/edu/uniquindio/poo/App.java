
package co.edu.uniquindio.poo;

import java.time.LocalDate;
import java.time.LocalTime;

import javax.swing.JOptionPane;

import co.edu.uniquindio.poo.Grupo.Categoria;

public class App {
    public static void main(String[] args) {

        // Conjunto de contactos
        String nombre = Interfaces.ingresarNombre();
        String alias = Interfaces.ingresarAlias();
        String direccion = Interfaces.ingresarDireccion();
        String telefono = Interfaces.ingresarTelefono();
        String email = Interfaces.ingresarEmail();
        // crear un nuevo contacto
        Contacto contacto = new Contacto(nombre, alias, direccion, telefono, email);
        Contacto contacto1 =  new Contacto("jorge","el celestino","calle4 norte","04682","ibarra@gmail");
        Contacto contacto2 =  new Contacto("santiago","la vara de premio","cra2 sur","9843","santiago@gmail");
        Contacto contacto3 =  new Contacto("veronica","la peligrosa","calle 16 centro","19837","veronica@gmail");
        Contacto contacto4 =  new Contacto("nhjhh","la nk","calle 16 centro","19997","veronica@gmail");
        Contacto contacto5 =  new Contacto("lkk","la oioio","calle 16 centro","198","veronica@gmail");
        Contacto contacto6 =  new Contacto("lll","la oioio","calle 16 centro","1994465","veronica@gmail");
        JOptionPane.showMessageDialog(null,contacto);


        //Lista de reuniones 
        String ingresarHora= Interfaces.ingresarHora();//Metodo que permite al usuario ingresar la hora de la reunion
        LocalTime horaReunion= Interfaces.declararHora(ingresarHora);  //Metodo de tipo Time en el que se declara la hora de la reunion
        String ingresarFecha= Interfaces.ingresarFecha();//Metodo que permite al usuario ingresar la fecha de la reunion
        LocalDate fechaReunion= Interfaces.declararFecha(ingresarFecha); //Metodo de tipo LocalDate en el que se declara la fecha de la reunion
        String descripcion = Interfaces.descripcionReunion(); //Metodo que permite al ususario ingresar la descripcion de la reunion
        // Crear una nueva reunión con los datos ingresados
        Reunion reunion = new Reunion (descripcion, fechaReunion,horaReunion); 
        //asignar contacto asistente a la reunion
        reunion.asignarContactoAsis(contacto1);
        reunion.asignarContactoAsis(contacto2);
        reunion.asignarContactoAsis(contacto3);
        JOptionPane.showMessageDialog(null,reunion);



       
        //Lista de grupos
        String nombreGrupo= Interfaces.ingresarNombreGrupo(); //Metodo que permite ingresar el nombre del grupo
        Categoria categoriaSeleccionada= Interfaces.generarInterfazCategoriaDelGrupo(); //Metodo que permite seleccionar la categoria del grupo
        //Crear nuevo contacto
        Grupo grupo = new Grupo(nombreGrupo,categoriaSeleccionada); 
        //Agregar contacto al grupo
        grupo.agregarContacto(contacto1);
        grupo.agregarContacto(contacto2);
        grupo.agregarContacto(contacto3);
        grupo.agregarContacto(contacto4);
        grupo.agregarContacto(contacto5);
        grupo.agregarContacto(contacto6);
        JOptionPane.showMessageDialog(null,grupo);
    }
}
