public class Hash {
    
    final int m = 101;

    public int Funcion(int i, String codigo,int colision,Tareas[] tareas){
        long clave;
        int indice;
        
        clave=transformarId(codigo);
        if(i==1){
            indice=AritmeticaMod(clave);
        }else{
            indice=MetodoMul(clave);
        }

        if(tareas[indice].getId()!=null){

        }
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
    /* seguir con el modular que esta incompleto, seguir con el otro metodo, nos falta caclcular los elementos i
     * ingresados, falta, tener el calculo de h y detalles , 
     */

    /*Tareas tabla[] = new Tareas[101];
    
    int numDeObj;

    double λ = 0.80 ;

    

    

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


    private int AritmeticaMod (String id, int colision){
        int clave = 0 ;
        int indice = 0 ;
        
        clave = IdTanformado(id);

        indice = clave % m;

       return indice;     

    }
*/

    private int transformarId (String id ){
        int clave = 0 ;

        for (int j = 0; j < Math.min(id.length(),10); j++){
         clave = clave * 27 + id.charAt(j);
        }
        return clave;
    } 









}
    

