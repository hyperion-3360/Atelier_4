public class Wow {

    static void afficherMessage () {
        System.out.println("Bienvenue au cours de Java!");
    }

    static void afficherLigne () {
        System.out.println("--------------------");
    }

    //PARTIE 2

    static void direBonjour(String prenom) {
        System.out.println("Bonjour " + prenom + "!");
    }

    static void afficherCarre(int n) {
        n = n * n;
        System.out.println(n);
    }

    static void afficherSomme(int a, int b) {
        System.out.println(a + b);
    }

    public static void main (String []args)
    {


        //PARTIE 1
        System.out.println("=== PARTIE 1 ===");

        //Exercise #1
        System.out.println("- #1");
        afficherMessage();

        //Exercise #2
        System.out.println("- #2");
        afficherLigne();
        afficherLigne();
        afficherLigne();


        //PARTIE 2
        System.out.println("=== PARTIE 2 ===");

        //Exercise #1
        System.out.println("- #1");
        direBonjour("Nathan");
        direBonjour("Elio");
        direBonjour("Lecteur");

        //Exercise #2
        System.out.println("- #2");
        afficherCarre(3);
        afficherCarre(7);
        afficherCarre(10);

        //Exercise #3
        System.out.println("- #3");
        afficherSomme(7, 3);
    }
}
