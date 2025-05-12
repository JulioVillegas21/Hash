public class Hash {

    private final int m = 101;

    private int numElementos = 0;

    private double factorCarga = 0;

    Tareas tabla [] = new Tareas[m];

    public Hash(){
        for ( int i = 0 ; i<m ; i++)
        tabla[i] = new Tareas();
    }


    public boolean Insertar(int i, int colision,Tareas tarea){

        long clave;
        int indice;
        
        clave=TransformarId(tarea.getId().substring(0, 10));
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

        this.tabla[indice]=tarea;
        tabla[indice].setesAlta(true);

        numElementos++;
        factorCarga = (double) numElementos / m;
        if (factorCarga > 0.5) {
            System.out.println("El factor de carga ha superado el 50%, considere aumentar el tamaño de la tabla.");
        }
        return (tabla[indice].getesAlta()) ? true : false;
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

    private int TransformarId (String id ){ 
        int clave = 0 ;

        for (int j = 0; j < Math.min(id.length(),10); j++){
         clave = clave * 5 + id.charAt(j);
        }
        return clave;
    } 


    public void MostrarId(){ // metodo que muestra los id existentes 
        
        System.out.println("---------------------------------------------------------------");

        for (int i = 0 ; i<m ; i++){
            if (this.tabla[i].getesAlta()!=false){
                System.out.println(i+")"+tabla[i].MostrarId());
            }
        } 
        System.out.println("---------------------------------------------------------------");
        System.out.println("\n");

    }

    public String Buscar(String clave , int hash, int colision ){ //metodo buscar

        int x = 1; // es para calcular coliciones 
       
        int indice; // su nombre da su funcionalidad xd

        long claveTransformada = TransformarId(clave); // Ya que la funcion hash tanforma el indice en un numero cualquiera, necesito hacer lo mismo con lo que ingrese el usuario
                                                       // y guardar ese cambio para poder usarlo en los metodos 

        if (hash==1){
            indice=AritmeticaMod(claveTransformada);

        }
        else{
            indice=MetodoMul(claveTransformada);
        }

        if(tabla[indice].getId() == null || tabla[indice].getesAlta() == false){

            return "El articulo que desea buscar no exite o ha sido eliminado";
        }
        else{

            while(tabla[indice] != null && tabla[indice].getesAlta()){

                if (tabla[indice].getId().substring(0, 10).equals(clave)){
                    
                    return tabla[indice].toString();
                }

                if (colision == 1) {
                indice = Colision.ColisionSimpleMod(indice,x);
             } else {
                indice = Colision.ColisionSimpleMul(indice,x);
                }


            }
            
        }

        return "La tarea no fue encontrada o fue eliminada.";
    }


    public void Eliminar(String clave,int hash, int colision){ //metodo eliminar
        int indice;
        long claveTransformada = TransformarId(clave);
        int x=1; // es para calcular coliciones

        if (clave.length() > 10){
            clave = clave.substring(0, 10);
        }

        if (clave.length() < 10){
            System.out.println("El id ingresado no es valido");
            return;
        }
        if (hash==1){
            indice=AritmeticaMod(claveTransformada);
            
        }
        else{
            indice=MetodoMul(claveTransformada);
        }
        while(tabla[indice] != null && tabla[indice].getesAlta()){

                if (tabla[indice].getId().substring(0, 10).equals(clave)){
                    
                    this.tabla[indice].setesAlta(false);
                    return;
                }

                if (colision == 1) {
                indice = Colision.ColisionSimpleMod(indice,x);
             } else {
                indice = Colision.ColisionSimpleMul(indice,x);
                }


            }

        
        
    }


   
}