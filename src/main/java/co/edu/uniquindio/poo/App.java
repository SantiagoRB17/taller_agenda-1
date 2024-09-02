
package co.edu.uniquindio.poo;

import java.sql.Time;
import java.time.LocalDate;
import javax.swing.JOptionPane;
import java.time.format.DateTimeParseException;
import co.edu.uniquindio.poo.Grupo.Categoria;

public class App {
    public static void main(String[] args) {
        if(palabra.equals("grupo")){

        }
        //Lista de reuniones 
        //String ingresarHora= JOptionPane.showInputDialog("Ingrese la hora de la reunión (Hora:Minuto:Segundo):");//Metodo que permite al usuario ingresar la hora de la reunion
        //String ingresarFecha= JOptionPane.showInputDialog("Ingrese la fecha de la reunión (Año-Mes-Día)");//Metodo que permite al usuario ingresar la fecha de la reunion
        //LocalDate fechaReunion= LocalDate.parse(ingresarFecha); //Metodo de tipo LocalDate en el que se declara la fecha de la reunion
        //Time horaReunion=Time.valueOf(ingresarHora);  //Metodo de tipo Time en el que se declara la hora de la reunion
        //Reunion reunion = new Reunion ("clase de crochet", fechaReunion,horaReunion); 
       
        //Lista de grupos
        //String nombreGrupo= JOptionPane.showInputDialog("Ingrese el nombre del grupo: ");
        //Categoria[] categoriasDelGrupo=Categoria.values();//Este metodo permite llamar todos los valores del atributo de tipo enum categoria que se encuentra en la clase de grupo y almacenarlas en un arreglo
        //String[] categoriaGrupo = new String[categoriasDelGrupo.length];//Este metodo permite convertir cada valor a tipo cadena para poder mostrarlo como un botion en el metodo de JOptionPane
        //for (int i = 0; i < categoriasDelGrupo.length; i++) { //Este ciclo recorre todo el arreglo de las categorias para convertir cada posicion en texto, usando el operador name que permite convertir un valor de tipo enum a string
          //   categoriaGrupo[i] = categoriasDelGrupo[i].name();
        //}
        int categoriaSeleccion= JOptionPane.showOptionDialog(null,"Ingrese la categoria del grupo (OFICINA, FIESTA, AMIGOS, FAMILIA;): ", "Categoria", 0, JOptionPane.QUESTION_MESSAGE,null, categoriaGrupo, "");//Metodo que permite al usuario ingresar la categoria del grupo
        Categoria categoriaSeleccionada=null; //Esta variable incializada en null permitira que atravez de un ciclo for esta se pase a tener un valor de tipo enum, esta variable se creo para que al crear un nuevo grupo este recibiera por parametro un valor de tipo enum con el cual puede crear un nuevo objeto en la clase grupo
        if (categoriaSeleccion >= 0 && categoriaSeleccion < categoriasDelGrupo.length) { //Esta condicion crea un rango y dependiendo del valor seleccionado le asigna a la variable vacia de categoriaSeleccionada el valor enum correspondiente
            categoriaSeleccionada= categoriasDelGrupo[categoriaSeleccion];
        }
        Grupo grupo = new Grupo(nombreGrupo,categoriaSeleccionada); 
        
        //Conjunto de contactos
        String nombre = JOptionPane.showInputDialog("Ingrese el nombre del contacto:");
        String alias = JOptionPane.showInputDialog("Ingrese el alias del contacto:");
        String direccion = JOptionPane.showInputDialog("Ingrese la direccion del contacto:");
        String telefono = JOptionPane.showInputDialog("Ingrese el telefono del contacto:");
        String email = JOptionPane.showInputDialog("Ingrese el email del contacto:");
        //crear un nuevo contacto
        Contacto contacto = new Contacto(nombre, alias, direccion, telefono, email);

        JOptionPane.showMessageDialog(null,contacto);

        Contacto contacto1 =  new Contacto("jorge","el celestino","calle4 norte","04682","ibarra@gmail");
        Contacto contacto2 =  new Contacto("santiago","la vara de premio","cra2 sur","9843","santiago@gmail");
        Contacto contacto3 =  new Contacto("veronica","la peligrosa","calle 16 centro","19837","veronica@gmail");
        Contacto contacto4 =  new Contacto("nhjhh","la nk","calle 16 centro","19997","veronica@gmail");
        Contacto contacto5 =  new Contacto("lkk","la oioio","calle 16 centro","198","veronica@gmail");
        Contacto contacto6 =  new Contacto("lll","la oioio","calle 16 centro","1994465","veronica@gmail");
        
        
        //Grupo.agregarContacto();
        grupo.agregarContacto(contacto1);
        grupo.agregarContacto(contacto2);
        grupo.agregarContacto(contacto3);
        grupo.agregarContacto(contacto4);
        grupo.agregarContacto(contacto5);
        grupo.agregarContacto(contacto6);


        JOptionPane.showMessageDialog(null,grupo);

        //verificar
        //reunion.verificarContactoAsis(contacto1);

        //Solicitar descripcion de la reunion

        String descripcion = JOptionPane.showInputDialog("Ingrese la descripción de la reunión:");
        
        // Solicitar la fecha de la reunión con validacion de entradas
        //LocalDate fechaReunion = null;
        while (fechaReunion == null) {
            String fechaIngresada = JOptionPane.showInputDialog("Ingrese la fecha de la reunión (Año-Mes-Día):");
            try {
                fechaReunion = LocalDate.parse(fechaIngresada);
            } catch (DateTimeParseException e) {
                JOptionPane.showMessageDialog(null, "Formato de fecha incorrecto. Ingrese nuevamente (Año-Mes-Día).");
            }
        }
        // Solicitar la hora de la reunión con validacion de entradas
        //Time horaReunion = null;
        while (horaReunion == null) {
            String horaIngresada = JOptionPane.showInputDialog("Ingrese la hora de la reunión (Hora:Minuto:Segundo):");
            try {
                horaReunion = Time.valueOf(horaIngresada);
            } catch (IllegalArgumentException e) {
                JOptionPane.showMessageDialog(null, "Formato de hora incorrecto. Ingrese nuevamente (Hora:Minuto:Segundo).");
            }
        }

        // Crear una nueva reunión con los datos ingresados
         //Reunion reunion = new Reunion(descripcion, fechaReunion, horaReunion);

        JOptionPane.showMessageDialog(null,reunion);
        

        //agregar reunion
        reunion.asignarContactoAsis(contacto1);
        reunion.asignarContactoAsis(contacto2);
        reunion.asignarContactoAsis(contacto3);

        JOptionPane.showMessageDialog(null,reunion);
        
        
    }
}
