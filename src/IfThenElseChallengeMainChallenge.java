public class IfThenElseChallengeMainChallenge {
    public static void main(String[] args) {

        boolean gameOver = true;
        int score = 800;//5000 / 4000 / 800
        int levelCompleted = 5; //5
        int bonus = 100; //100

//        if (score == 5000) {
//            System.out.println("Your score was 5000");

//        if (score < 5000) {
//            System.out.println("Your score was less than 5000");
//        } else {
//            System.out.println("Got here");
//          }
//        if (score <= 5000) {
//            System.out.println("Your score was less than or equal to 5000");
//        } else {
//            System.out.println("Got here");
//        }

       int finalScore = score;

       if (gameOver) {
           finalScore += (levelCompleted * bonus);
           finalScore += 1000;
           System.out.println("Your final score was " + finalScore);
       }
//        boolean newGameOver = true;
//        int newScore = 10000;
//        int newLevelCompleted = 8;
//        int newBonus = 200;
//
//        int newFinalScore = newScore;
//
//        if (newGameOver) {
//            newFinalScore += (newLevelCompleted * newBonus);
//            System.out.println("Your final score was " + newFinalScore);
//        }

        score = 10000;
        levelCompleted = 8;
        bonus = 200;

        finalScore = score;

        if (gameOver) {
            finalScore += (levelCompleted * bonus);
            System.out.println("Your final score was " + finalScore);
        }
    }
}
