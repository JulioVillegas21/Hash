public class Colision {
    

    public static int ColisionLineal(int indice, Tareas arreglo[] ){
        int x=1;                                                    
       while(arreglo[indice] != null){
            indice = (indice + x);
            x++;
            if(indice >= 100){
                indice = indice%101;
            }
        }
        
        return indice;
    }

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
