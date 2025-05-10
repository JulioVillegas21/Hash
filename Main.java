import java.util.Scanner;

public class Main {
    /**
     * @param args
     */
    public static void main(String[]args){
        Scanner scanner = new Scanner(System.in);
        System.out.println("Ingrese el metodo denasignacion de indice deseado");
        System.out.println("1.Arismetica modular");
        System.out.println("2.Metodo de la multiplicacion");
        int hash = scanner.nextInt();
        while(hash <1 || hash > 2){
            System.out.println("Ingrese un metodo valido");
            hash = scanner.nextInt();
        }
        System.out.println("Ingrese el metodo de colision deseado");
        System.out.println("1.Lineal");
        System.out.println("2.Cuadratica");
        int colision = scanner.nextInt();
        


    }

    
}