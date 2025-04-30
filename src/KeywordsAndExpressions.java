public class KeywordsAndExpressions {
    public static void main(String[] args) {
        double kilometers = (100 * 1.609344);

        int highScore = 50;  // expression

        if (highScore > 25) {
            highScore = 1000 + highScore;  // add bonus points
        }

        int health = 100;
        if ((health < 25) && (highScore > 1000)) {
            highScore = highScore - 1000;
        }
        // 6 total health = 100 / health < 25 / highScore > 1000 / (health < 25) && (highScore > 1000) /
        // highScore - 1000 / highScore = highScore - 1000 - expressions
    }
}

