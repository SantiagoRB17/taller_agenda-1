package co.edu.uniquindio.poo;
/**Clase que representa los contactos de la agenda */
public class Contacto {
    public String Nombre;
    public String Alias;
    public String Direccion;
    public String Telefono;
    public String Email;

    /**
     * Metodo constructor de la clase contacto
     * @param Nombre nombre del contacto
     * @param Alias alias del contacto
     * @param Direccion direccion del contacto
     * @param Telefono telefono del contacto
     * @param Email email del contacto 
     */
    public Contacto(String Nombre, String Alias, String Direccion, String Telefono, String Email){
        this.Nombre=Nombre;
        this.Alias=Alias;
        this.Direccion=Direccion;
        this.Telefono=Telefono;
        this.Email=Email;
    }

    public String getNombre() {
        return Nombre;
    }

    public void setNombre(String nombre) {
        Nombre = nombre;
    }

    public String getAlias() {
        return Alias;
    }

    public void setAlias(String alias) {
        Alias = alias;
    }

    public String getDireccion() {
        return Direccion;
    }

    public void setDireccion(String direccion) {
        Direccion = direccion;
    }

    public String getTelefono() {
        return Telefono;
    }

    public void setTelefono(String telefono) {
        Telefono = telefono;
    }

    public String getEmail() {
        return Email;
    }

    public void setEmail(String email) {
        Email = email;
    }

    @Override
    public String toString() {
        return "Contacto [Nombre=" + Nombre + ", Alias=" + Alias + ", Direccion=" + Direccion + ", Telefono=" + Telefono
                + ", Email=" + Email + "]";
    }
    
}
