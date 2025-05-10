public class Colision {
    

    public static int ColisionLineal(int indice, Tareas arreglo[] ){//paso como parametro el indice calculado por la funcion hash
        int x=1;                                                    //y el arreglo para que busque el siguiente espacio vacio
        while(arreglo[indice] != null){
            indice = (indice + x);
            x++;
            if(indice >= 100){
                indice = 0; // Si el índice supera el tamaño del arreglo, reiniciamos a 0
            }
        }
        
        return indice;
    }
    /*
     * 
     * 
     * 
     * 
     * 
     * 
     * 
     * 
     */
    
    public static int ColisionCuadratica(int indice, Tareas arreglo[] ){
        int x=1;
        while(arreglo[indice] != null){
            indice = (indice + x^2);
            x++;
            if(indice >= 100){
                indice = indice%101;
            }

        }
        
        return indice;
    }
}
