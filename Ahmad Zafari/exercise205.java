public class exercise205 {
    public static void main(String[] args) {
        int annee = 2077;

        if ( (annee %4 == 0 && annee %100 == 0 ) || annee % 400 == 0  ){

            System.out.println("The year is a leap");

        }else {
            System.out.println("The year is not a leap");
        }
    }
}
