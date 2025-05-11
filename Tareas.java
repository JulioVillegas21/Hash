import java.time.LocalDate;
import java.util.UUID;
@SuppressWarnings("static-access")
public class Tareas {
    private String id = null;
    private String nombre;
    private String descripcion;
    private LocalDate fechaInicio;
    private LocalDate fechaFin;
    private String estado;
    private boolean eliminado = false;

    //Constructres
    public Tareas(){

    }

    public Tareas( String nombre, String descripcion, String fechafinal){
        
        this.nombre = nombre;
        this.descripcion = descripcion;
        this.fechaInicio = LocalDate.now();
        this.estado ="Pendiente" ;
        this.fechaFin= fechaFin.parse(fechafinal);
        
    }
    //Getters y Setters
    public void setId(String id) {
        this.id = id;
    }

    public String getId() {
        return this.id;
    }

    public void darId() {
        this.id = UUID.randomUUID().toString();
    }

    public String getNombre() {
        return this.nombre;
    }
    public void setNombre(String nombre) {
        this.nombre = nombre;
    }
    public String getDescripcion() {
        return this.descripcion;
    }
    public void setDescripcion(String descripcion) {
        this.descripcion = descripcion;
    }
    public LocalDate getFechaCreacion() {
        return this.fechaInicio;
    }
    public void setFechaCreacion(String fechai) {
        this.fechaInicio = fechaInicio.parse(fechai);
    }
    public String getEstado() {
        return this.estado;
    }
    public void setEstado(int estado) {
        switch (estado) {
            case 1:
                this.estado="En curso";
                break;
            case 2:
                this.estado="Terminada";
                break;
            default:
                this.estado="Pendiente";
                break;
        }
        
    }
    public boolean setEliminado(boolean eliminado) {
        this.eliminado = eliminado;
        return this.eliminado;
    }
    public boolean getEliminado(){
        return this.eliminado;
    }
    
    public void setFechaFinal (String fecha){
        this.fechaFin = fechaFin.parse(fecha);
    }
    public LocalDate getFechaFinal (){
        return this.fechaFin;
    }

    //Metodos
    @Override
    public String toString() {
    return "Tarea [" +
    "Código=" + id +
    ", Nombre='" + nombre + '\'' +
    ", Descripción='" + descripcion + '\'' +
    ", Estado=" + estado +
    ", fechaInicio=" + fechaInicio +
    ", fechaFin=" + fechaFin +
    ", esAlta=" + eliminado +
    ']';
    }



}