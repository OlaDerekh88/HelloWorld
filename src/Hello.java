public class Hello {

    public static void main (String[] args) {
        System.out.println("Hello, Ola!");

//        boolean isAlien = true;
//        if (isAlien == false)
//            System.out.println("It is not an alien!");
//        System.out.println("And I am scared of aliens");


        boolean isAlien = false;
        if (isAlien == false) {
            System.out.println("It is not an alien!");
            System.out.println("And I am scared of aliens");
        }

//        int topScore = 100;
//        if (topScore == 100) {
//            System.out.println("You got the high score!");
//        }

        //ne riwnyj 100, not = 100 use !=
//        int topScore = 100;
//        if (topScore != 100) {
//            System.out.println("You got the high score!");
//        }

    // jakszo umowa >=100 printyje You....
//        int topScore = 100;
//        if (topScore >= 100) {
//            System.out.println("You got the high score!");
//        }

        int topScore = 80;
        if (topScore < 100) {
            System.out.println("You got the high score!");
        }

        // && - i, oznacza e 2 warunki maja byc spelnione
        int secondTopScore = 81;
        if ((topScore > secondTopScore) && (topScore < 100)) {
            System.out.println("Greater than second top score and less than 100");
        }

        // or - ||

        if ((topScore > 90) || (secondTopScore <= 90)) {
            System.out.println("Either or both of the conditions are true");
        }

    // przyklad kiedu nie spelniaja sie tych dwa kryteria topScore ne jest >95 i nie jest <90 mamu 2 false i nie printuje

//        int topScore = 80;
//        if (topScore < 100) {
//            System.out.println("You got the high score!");
//        }
//
//        int secondTopScore = 95;
//        if ((topScore > secondTopScore) && (topScore < 100)) {
//            System.out.println("Greater than second top score and less than 100");
//        }
//        if ((topScore > 90) || (secondTopScore <= 90)) {
//            System.out.println("Either or both of the conditions are true");
//        }
    }
}
