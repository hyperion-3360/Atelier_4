package Partie2;
public class Exercice2_4
{
    public static void main(String []args)
    {
        int note = 73;

        if (note >= 90)
        System.out.println("A");
        else if (note < 90 && note >= 80)
        System.out.println("B");
        else if (note < 80 && note >= 70)
        System.out.println("C");
        else if (note < 70 && note >= 60)
        System.out.println("D");
        else if (note < 60)
        System.out.println("F");
    }
}