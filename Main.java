
import java.util.Scanner;
@SuppressWarnings("unused")
public class Main {
    /**
     * @param args
     */
    public static Tareas ingresar(){//Asigna valores a los atributos

        Tareas aux = new Tareas();
        Scanner letra = new Scanner(System.in);
        Scanner num = new Scanner(System.in);
        String fechaf,nombre,descripcion;
        int estado;

        System.out.println("Ingrese el nombre de la tarea");
        nombre = letra.nextLine();
        aux.setNombre(nombre);//Coloca el nombre ingresado

        System.out.println("Ingrese la descripcion de la tarea");
        descripcion = letra.nextLine();
        aux.setDescripcion(descripcion);//Coloca la descripcion ingresada

        System.out.println("Ingrese la fecha de creacion de la tarea(AA-MM-DD)");
        fechaf = letra.nextLine();
        try {//Verifica que la fecha ingresada este en el formato establecido
            aux.setFechaFinal(fechaf);
        } catch (Exception e) {
            System.out.println("Ingrese la fecha en el formado indicado (AA-MM-DD)");
            fechaf = letra.nextLine();
            aux.setFechaFinal(fechaf);
        }

        System.out.println("Ingrese el estado:\n[1].Pendiente\n[2].En curso");   
        estado=num.nextInt();
        aux.setEstado(estado);//Asigna estado de la tarea

        return aux;
    }
    public static int menu(){

        Scanner teclado = new Scanner(System.in);
        int op;
            System.out.println("[1].Ingresar tarea");
            System.out.println("[2].Editar Tarea");
            System.out.println("[3].Eliminar Tarea");
            System.out.println("[4].Salir");
            op = teclado.nextInt();
            while(op<1||op>4){
                System.out.println("Ingrese una opcion valida");
                op = teclado.nextInt();
            }
        return op;
    }
    public static void main(String[]args){
        Scanner letra = new Scanner(System.in);//Variable de entrada para letras
        Scanner num = new Scanner(System.in);//Variable de entrada para numeros
        int hash,colision,opcion;
        Tareas [] tareas= new Tareas[101];
        System.out.println("Ingrese el metodo de asignacion de indice deseado");
        System.out.println("1.Arismetica modular");
        System.out.println("2.Metodo de la multiplicacion");
        hash = num.nextInt();
        while(hash <1 || hash > 2){
            System.out.println("Ingrese un metodo valido");
            hash = num.nextInt();
        }
        System.out.println("Ingrese el metodo de colision deseado");
        System.out.println("1.Lineal");
        System.out.println("2.Cuadratica");
        colision = num.nextInt();
        while(colision <1 || colision > 2){
            System.out.println("Ingrese un metodo valido");
            colision = num.nextInt();
        }
        do{
            opcion=menu();
            switch(opcion){
                case 1:
                     Tareas tarea = new Tareas();
                     tarea=ingresar();
                     tarea.darId();//Asigna un id a la tarea

                    // Aqui se agrega el ingresar que contiene las funciones de la tabla hash y las colisiones

                    


                    break;
                 case 2:
                    // Editar tarea
                    break;
                case 3:
                    // Eliminar tarea
                    break;
                case 4:
                    System.out.println("Saliendo...");
                    break;
                default:
                    System.out.println("Opcion no valida");
                    break;
            }

        }while(opcion!=4);


    }    
}