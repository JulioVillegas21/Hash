import java.time.LocalDate;
import java.util.UUID;

public class Tareas {
    private String id = null;
    private String nombre;
    private String descripcion;
    private LocalDate fechaCreacion;
    private LocalDate fechaFinal;
    private String estado;
    private boolean eliminado = false;

    //Constructres
    public Tareas(){

    }

    public Tareas( String nombre, String descripcion, String fechafinal){
        
        this.nombre = nombre;
        this.descripcion = descripcion;
        this.fechaCreacion = LocalDate.now();
        this.estado ="Pendiente" ;
        this.fechaFinal= fechaFinal.parse(fechafinal);
        
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
        return this.fechaCreacion;
    }
    public void setFechaCreacion(String fechai) {
        this.fechaCreacion = fechaCreacion.parse(fechai);
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
    @SuppressWarnings("static-access")
    public void setFechaFinal (String fecha){
        this.fechaFinal = fechaFinal.parse(fecha);
    }
    public LocalDate getFechaFinal (){
        return this.fechaFinal;
    }




}