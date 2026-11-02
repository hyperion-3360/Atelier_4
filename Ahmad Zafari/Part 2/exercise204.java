public class exercise204 {
    public static void main (String[]args){

        int note = 99;

        if (note > 90){

            System.out.println("good , you have an A");

        }else if (note > 80 && note < 89){
            
            System.out.println("not bad. you got a B . You did study i guess...");

        }else if (note >70 && note < 79){

            System.out.println("You got a C . don't worry , study next time");

        }else if (note > 60 && note < 69){

            System.out.println("D is what you got buddy.");

        }else if (note < 60){

            System.out.println("Did you even care about the evaluation?  (you got a F if that's what you are asking yourself) ");
        }

    }
}
