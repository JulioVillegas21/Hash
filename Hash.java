
public class Hash {

    private final int m = 101;

    private int numElementos = 0;

    private double factorCarga = 0;

    Tareas tabla [] = new Tareas[m];

    public Hash(){
        for ( int i = 0 ; i<m ; i++)
        tabla[i] = new Tareas();
    }


    public boolean Funcion(int i, int colision,Tareas tarea){

        long clave;
        int indice;
        
        clave=transformarId(tarea.getId());
        if(i==1){
            indice=AritmeticaMod(clave);
        }else{
            indice=MetodoMul(clave);
        }

        if(this.tabla[indice].getId() != null){

            if(colision == 1){
                indice = Colision.ColisionLineal(indice, this.tabla);

            }
            else{
                Colision.ColisionCuadratica(indice, this.tabla);
            }
        }

        return (tabla[indice].getEsAlta()) ? true : false;
    }

    private int AritmeticaMod(long clave){
        return (int)(clave % m);
    }

    private int MetodoMul(long clave){
        final double R = 0.618034;
        double aux;
        aux=(R*clave)-Math.floor(R*clave);
        return (int) (aux*m);
    }

    private int transformarId (String id ){
        int clave = 0 ;

        for (int j = 0; j < Math.min(id.length(),10); j++){
         clave = clave * 27 + id.charAt(j);
        }
        return clave;
    } 

}
    

