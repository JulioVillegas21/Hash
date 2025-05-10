import java.util.UUID;

public class Tareas {
    private String id = null;
    private String nombre;
    private String descripcion;
    private String fechaCreacion;
    private String fechaFinal;
    private int estado;
    private boolean eliminado = false;








    public Tareas(String id, String nombre, String descripcion, String fechaCreacion, int Estado){
        this.id = id;
        this.nombre = nombre;
        this.descripcion = descripcion;
        this.fechaCreacion = fechaCreacion;
        this.estado = estado;
        
    }

    public void setId(String id) {
        this.id = id;
    }



    public Tareas(){
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
    public String getFechaCreacion() {
        return this.fechaCreacion;
    }
    public void setFechaCreacion(String fechaCreacion) {
        this.fechaCreacion = fechaCreacion;
    }
    public int getEstado() {
        return this.estado;
    }
    public void setEstado(int estado) {
        this.estado = estado;
    }
    public boolean seteliminado(boolean eliminado) {
        this.eliminado = eliminado;
        return this.eliminado;
    }
    public boolean geteliminado(){
        return this.eliminado;
    }
    public void setFechaFinal (String fecha){
        this.fechaFinal = fecha;
    }
    public String setFechaFinal (){
        return this.fechaFinal;
    }




}