public class exercise305 {
    public static void main(String[] args) {
         int jour = 3;

        switch (jour) {
            case 1, 2, 3, 4, 5 ->

                System.out.println("Jour de semaine");

            case 6, 7 ->

                System.out.println("Fin de semaine");

            default ->
            
                System.out.println("Jour invalide");
        }
    }
}
