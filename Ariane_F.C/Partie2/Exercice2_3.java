package Partie2;
public class Exercice2_3
{
    public static void main(String []args)
    {
        int a = 14;
        int b = 2;
        int c = 3;

        int [] nombres = {a, b, c};
        int plusGrand = nombres[0];

        for (int n : nombres)
        {
            if (n > plusGrand)
            plusGrand = n;
        }

        System.out.println(plusGrand);
    }
}