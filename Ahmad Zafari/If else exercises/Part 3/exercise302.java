public class exercise302 {
    public static void main(String[] args) {
        int mois = 9;

        switch (mois) {
            case 12:
             case 1:
             case 2:
             System.out.println("hiver");
            break;
            
            case 3:
             case 4:
             case 5:
             System.out.println("printemp");
            break;

            case 6:
             case 7:
             case 8:
             System.out.println("ete");
            break;

            case 9:
             case 10:
             case 11:
             System.out.println("automn");
            break;
        
            default:
                break;
        }
    }
}
