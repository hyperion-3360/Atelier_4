import java.util.Scanner;
public class Exercice1 {
    public static void main (String[]args){
        Scanner scanner = new Scanner(System.in);
        int nombre = 0;
        do{
            System.out.print("Entrer un nombre: ");
            nombre = scanner.nextInt();
        }while (nombre<0);
        scanner.close();
    }
}
