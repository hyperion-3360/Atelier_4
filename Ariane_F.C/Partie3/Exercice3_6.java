package Partie3;
public class Exercice3_6
{
    public static void main(String []args)
    {
        int choixMenu = 1;

        switch (choixMenu)
        {
            case 1:
            System.out.println("Afficher la date");
            break;

            case 2:
            System.out.println("Afficher l'heure");
            break;

            case 3:
            System.out.println("Quitter");
            break;

            case 4:
            System.out.println("Rien faire");
            break;

            default:
            System.out.println("Choix invalide");
        }
    }
}