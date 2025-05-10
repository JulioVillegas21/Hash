import java.util.UUID;
public class Tareas {
    private String id;
    private String nombre;
    private String descripcion;
    private String fechaCreacion;
    private int estado;
    private boolean eliminado;







    
    public Tareas(String nombre, String descripcion, String fechaCreacion, int Estado){
        this.id = UUID.randomUUID().toString();
        this.nombre = nombre;
        this.descripcion = descripcion;
        this.fechaCreacion = fechaCreacion;
        this.estado = estado;
        this.eliminado = false;
    }





    public void Tareas(){

    }

    public String getId() {
        return id;
    }
    public void setId(String id) {
        this.id = id;
    }
    public String getNombre() {
        return nombre;
    }
    public void setNombre(String nombre) {
        this.nombre = nombre;
    }
    public String getDescripcion() {
        return descripcion;
    }
    public void setDescripcion(String descripcion) {
        this.descripcion = descripcion;
    }
    public String getFechaCreacion() {
        return fechaCreacion;
    }
    public void setFechaCreacion(String fechaCreacion) {
        this.fechaCreacion = fechaCreacion;
    }
    public int getEstado() {
        return estado;
    }
    public void setEstado(int estado) {
        this.estado = estado;
    }
    public boolean seteliminado(boolean eliminado) {
        this.eliminado = eliminado;
        return eliminado;
    }
    public boolean geteliminado(){
        return eliminado;
    }






}