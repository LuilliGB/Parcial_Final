package Examen;

public class Datos {

    String nombre;
    String apellidos;
    String Usuario;
    String contraseña;
    String correo;

    public Datos() {
    }

    public Datos(String nombre, String apellidos, String Usuario, String contraseña, String correo) {
        this.nombre = nombre;
        this.apellidos = apellidos;
        this.Usuario = Usuario;
        this.contraseña = contraseña;
        this.correo = correo;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getApellidos() {
        return apellidos;
    }

    public void setApellidos(String apellidos) {
        this.apellidos = apellidos;
    }

    public String getUsuario() {
        return Usuario;
    }

    public void setUsuario(String Usuario) {
        this.Usuario = Usuario;
    }

    public String getContraseña() {
        return contraseña;
    }

    public void setContraseña(String contraseña) {
        this.contraseña = contraseña;
    }

    public String getCorreo() {
        return correo;
    }

    public void setCorreo(String correo) {
        this.correo = correo;
    }

}
