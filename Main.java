import java.util.Scanner;

public class Main {
    /**
     * @param args
     */
    public static void main(String[]args){
        Scanner scanner = new Scanner(System.in);
        int hash,colision,opcion;
        System.out.println("Ingrese el metodo denasignacion de indice deseado");
        System.out.println("1.Arismetica modular");
        System.out.println("2.Metodo de la multiplicacion");
        hash = scanner.nextInt();
        while(hash <1 || hash > 2){
            System.out.println("Ingrese un metodo valido");
            hash = scanner.nextInt();
        }
        System.out.println("Ingrese el metodo de colision deseado");
        System.out.println("1.Lineal");
        System.out.println("2.Cuadratica");
        colision = scanner.nextInt();
        while(colision <1 || colision > 2){
            System.out.println("Ingrese un metodo valido");
            colision = scanner.nextInt();
        }
        do{
            System.out.println("1.Ingresar tarea");
            System.out.println("2.Editar Tarea");
            System.out.println("3.Eliminar Tarea");
            System.out.println("4.Salir");
            opcion = scanner.nextInt();
            switch(opcion){
                case 1:
                    // Ingresar tarea
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