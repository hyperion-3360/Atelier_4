package Partie2;
public class Exercice2_6
{
    public static void main(String []args)
    {
        int age = 0;

        if (age >= 0 && age < 13)
        System.out.println("enfant");
        else if (age >= 13 && age < 18)
        System.out.println("adolescent");
        else if (age >= 18)
        System.out.println("adulte");
        else
        System.out.println("impossible");
    }
}