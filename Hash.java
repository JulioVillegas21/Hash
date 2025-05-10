public class Hash {



    /* seguir con el modular que esta incompleto, seguir con el otro metodo, nos falta caclcular los elementos i
     * ingresados, falta, tener el calculo de h y detalles , 
     */

    Tareas tabla[] = new Tareas[101];
    
    int numDeObj;

    double factorDeCarga = 0.80 ;

    final int m = 101;

    final double R = 0.618034;

    int elementosCargados=0;
    
    
    public int GetElementos(){

        return elementosCargados;
    }


    public Hash (){
        for (int i = 0 ; i<100 ; i++){
            tabla[i] = new Tareas();
        }
    } 
    
    
    public boolean Insertar (Tareas objeto , int hash , int colision) {
        
        int indice = 0;

        if ( hash == 1){ // hash 1 = metodo modular , hash 2 = metodo multiplicacion

            indice=MetodoModular(objeto.getId(), colision);

            if(tabla[indice].getId() == null){

                tabla[indice].setId(objeto.getId()); 




                
            }




        }
        else {

        }






        return (objeto.geteliminado() == true ) ? true : false;
    }


    private int MetodoModular (String id, int colision){
        int clave = 0 ;
        int indice = 0 ;
        
        clave = IdTanformado(id);

        indice = clave % m;

       return indice;     

    }


    private int IdTanformado (String id ){
        int clave = 0 ;

        for (int j = 0; j < Math.min(id.length(),10); j++){
        clave = clave * 27 + id.charAt(j);
    }
        return clave;
    } 









}
    

