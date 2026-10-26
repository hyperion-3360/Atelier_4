public class Exercice4
{
    public static void main(String []args)
    {
        int x = 5;
        int y = 9;
        int z = 1;

        System.out.println(x + " " + y);

        z = x;
        x = y;
        y = z;

        System.out.println(x + " " + y);
    }
}