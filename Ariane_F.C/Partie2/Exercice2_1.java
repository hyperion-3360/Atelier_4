package Partie2;
public class Exercice2_1
{
    public static void main(String []args)
    {
        int nombre = 1016;

        if (nombre % 10 == 0 || nombre % 10 == 2 || nombre % 10 == 4 || nombre % 10 == 6 || nombre % 10 == 8)
        {
        System.out.println("pair");
        }
        else if (nombre % 10 == 1 || nombre % 10 == 3 || nombre % 10 == 5 || nombre % 10 == 7 || nombre % 10 == 9)
        {
        System.out.println("impair");
        }
    }
}