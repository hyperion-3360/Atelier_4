
public class exercise303 { 
    public static void main(String[] args) {
        char operateur = '+';
        int a = 14;
        int b = 12;

        switch (operateur) {
            case '+':
                System.out.println(a + b);
                
                break;
            
            case '-':
                System.out.println(a-b);

                break;

            case '*':
                System.out.println(a*b);

                break;


            case '/':
                System.out.println(a/b);

                break;
            
            default:
                break;
        }
    }
    
}
