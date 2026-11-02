package Partie3;
public class Exercice3_4
{
    public static void main(String []args)
    {
        char note = 'D'; // choisir A, B, C, D ou F

        switch (note)
        {
        case 'A':
        System.out.println("Excellent!");
        break;

        case 'B':
        System.out.println("Bien!");
        break;

        case 'C':
        System.out.println("Passable");
        break;

        case 'D':
        System.out.println("Meh...");
        break;

        case 'F':
        System.out.println("Insuffisant");
        break;

        default:
        System.out.println("Mais d'ou sortez vous cette note?!?!?");
        }

    }
}