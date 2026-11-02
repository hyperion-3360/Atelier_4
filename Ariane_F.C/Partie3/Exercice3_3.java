package Partie3;
public class Exercice3_3
{
    public static void main(String []args)
    {
        char operateur = '/';  // choisir +, -, * ou /
        double a = 2;
        double b = 3;

        switch (operateur)
        {
        case '+':
        System.out.println(a + b);
        break;

        case '-':
        System.out.println(a - b);
        break;

        case '*':
        System.out.println(a * b);
        break;

        case '/':
        System.out.println(a / b);
        break;

        default:
        System.out.println("Pas un operateur!!!");
        }
    }
}