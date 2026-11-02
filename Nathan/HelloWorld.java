public class HelloWorld
{
    public static void main (String []args)
    {
        //Exercise #1
        System.out.println("- #1");
        int age = 16;
        double taille = 1.72;
        String prenom = "Nathan";
        System.out.println(age + " " + taille + " " + prenom);

        //Exercise #2
        System.out.println("- #2");
        int a = 7;
        int b = 3;
        System.out.println(a+b);
        System.out.println(a-b);
        System.out.println(a*b);
        System.out.println(a/b);

        //Exercise #3
        System.out.println("- #3");
        double prixInitial = 49.99;
        double rabais = 0.20;
        System.out.println(prixInitial-(prixInitial*rabais));

        //Exercise #4
        System.out.println("- #4");
        int x = 5;
        int y = 9;
        int temp = 0;
        System.out.println(x + " " + y);
        temp = x;
        x = y;
        y = temp;
        System.out.println(x + " " + y);

        //Exercise #5
        System.out.println("- #5");
        double celsius = 23.5;
        double F = 0;
        F = celsius * 9/5 + 32;
        System.out.println(F);

        //Exercise #6
        System.out.println("- #6");
        char nomInitiale = 'B';
        int code = nomInitiale;
        System.out.println(nomInitiale + " " + code);

        //Exercise #7
        System.out.println("- #7");
        int total = 7;
        int parts = 2;
        double reponse = (double) total/parts;
        System.out.println(reponse);


        //PARTIE 2
        System.out.println("=== PARTIE 2 ===");

        //Exercise #1
        System.out.println("- #1");
        int nombre = 7;
        
        if (nombre % 2 == 0) {
            System.out.println("Pair");
        } else {
            System.out.println("Impair");
        }

        //Exercise #2
        System.out.println("- #2");
        int f = 3;
        int g = 3;
        if (f > g) {
            System.out.println(f);
        } else if (g > f) {
            System.out.println(g);
        } else {
            System.out.println("egaux");
        }

        //Exercise #3
        System.out.println("- #3");
        int j = 1;
        int k = 2;
        int l = 2;
        int greater = Math.max(Math.max(j, k), l);
        System.out.println(greater);

        //Exercise #4
        System.out.println("- #4");
        int note = 70;
        if (note >= 90) {
            System.out.println("A");
        } else if (note >= 80) {
            System.out.println("B");
        } else if (note >= 70) {
            System.out.println("C");
        } else if (note >= 60) {
            System.out.println("D");
        } else {
            System.out.println("F");
        }

        //Exercise #5
        System.out.println("- #5");
        int annee = 2026;
        if ((annee % 4 == 0) && !(annee % 100 == 0) || (annee % 400 == 0)) {
            System.out.println("bissextile");
        } else {
            System.out.println("pas bissextile");
        }

        //Exercise #6
        System.out.println("- #6");
        int age2 = 15;
        if (age2 < 13) {
            System.out.println("enfant");
        } else if (age2 >= 13 && age2 <= 18) {
            System.out.println("adolescent");
        } else {
            System.out.println("adulte");
        }

        //Exercise #7
        System.out.println("- #7");
        int n = -152;
        if (n >= 0) {
            System.out.println(n);
        } else {
            n = n/-1;
            System.out.println(n);
        }


        //PARTIE 3
        System.out.println("=== PARTIE 3 ===");

        //Exercise #1
        System.out.println("- #1");
        int jour = 7;
        
    }
}

