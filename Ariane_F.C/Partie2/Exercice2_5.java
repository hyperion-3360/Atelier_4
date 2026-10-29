package Partie2;
public class Exercice2_5
{
    public static void main(String []args)
    {
        int annee = 2019;

        int x = annee % 4;
        int y = annee % 100;
        int z = annee % 400;

        if (x != 0)
        System.out.println("pas bissextile");
        else if (x == 0)
        {
            if (y != 0)
            System.out.println("pas bissextile");
            else if (y == 0)
            {
                if (z != 0)
                System.out.println("pas bissextile");
                else if (z == 0)
                System.out.println("bissextile");
            }
        }

    }
}