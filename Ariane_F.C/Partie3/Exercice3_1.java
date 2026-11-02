package Partie3;
public class Exercice3_1
{
    public static void main(String []args)
    {
        int jour = 9;

        switch (jour)
        {
            case 1:
            System.out.println("Dimanche");
            break;

            case 2:
            System.out.println("Lundi");
            break;

            case 3:
            System.out.println("Mardi");
            break;

            case 4:
            System.out.println("Mercredi");
            break;

            case 5:
            System.out.println("Jeudi");
            break;

            case 6:
            System.out.println("Vendredi");
            break;

            case 7:
            System.out.println("Samedi");
            break;
            
            default:
            System.out.println("Pas un jour de la semaine!!!");
            
        }
    }
}