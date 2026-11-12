public class Capybara {
    public static void main (String[]args)
    {
        //Boucles
        
        //PARTIE 1
        System.out.println("=== PARTIE 1 ===");
        
        //Exercise #1
        System.out.println("- #1");
        for (int i = 1; i < 11; i++) {
            System.out.println(i);
        }

        //Exercise #2
        System.out.println("- #2");
        for (int i =2; i <= 20; i = i + 2) {
            System.out.println(i);
        }

        //Exercise #3
        System.out.println("- #3");
        int big = 0;
        for (int i = 1; i <= 100; i++) {
            big = big + i;
        }
        System.out.println(big);

        
        //PARTIE 2
        System.out.println("=== PARTIE 2 ===");
        
        //Exercise #1
        System.out.println("-- #1");
        int a = 1;
        while (a <= 10) {
            System.out.println(a);
            a = a + 1;
        }

        //Exercise #2
        System.out.println("-- #2");
        int b = 10;
        while (b > 0) {
            System.out.println(b);
            b = b - 1;
        }
        System.out.println("Decollage!");

        
        //PARTIE 3
        System.out.println("=== PARTIE 3 ===");

        //Exercise #1
        System.out.println("--- #1");
        int c = -65;
        do {
            c = c + 1;
        } while (c < 0);
        System.out.println(c);

        //Exercise #2
        System.out.println("--- #2");
        for (int i = 1; i <= 5; i++) {
            System.out.println("1 - " + i);
        }
        System.out.println();
        int d = 1;
        while (d <= 5) {
            System.out.println("2 - " + d);
            d = d + 1;
        }
        System.out.println();
        int e = 1;
        do {
            System.out.println("3 - " + e);
            e = e + 1;
        } while (e <= 5);


        //PARTIE 4
        System.out.println("=== PARTIE 4 ===");

        //Exercise #1
        System.out.println("---- #1");
        for (int i = 1; i <= 20; i++) {
            if (i % 7 == 0){
                System.out.println(i);
                break;
            }
        }

        //Exercise #2
        System.out.println("---- #2");
        for (int i = 1; i <= 20; i++) {
            if (i % 3 == 0) {
                continue;
            }
        System.out.println(i);
        }

        //Exercise #3
        System.out.println("---- #3");
        for (int i = 1; i <= 30; i++) {
            if (i % 2 == 0) {
                continue;
            }
        System.out.println(i);
        }
    }
}
