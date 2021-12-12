
package Examen;

public class Tareas {
    private String fecha;
    private String nombretarea;
    private String encargado;

    public Tareas() {
    }

    public Tareas(String fecha, String nombretarea, String encargado) {
        this.fecha = fecha;
        this.nombretarea = nombretarea;
        this.encargado = encargado;
    }

    public String getEncargado() {
        return encargado;
    }

    public void setEncargado(String encargado) {
        this.encargado = encargado;
    }

    public String getFecha() {
        return fecha;
    }

    public void setFecha(String fecha) {
        this.fecha = fecha;
    }

    public String getNombretarea() {
        return nombretarea;
    }

    public void setNombretarea(String nombretarea) {
        this.nombretarea = nombretarea;
    }
    
    
}
