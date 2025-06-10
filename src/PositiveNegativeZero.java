public class PositiveNegativeZero {
    public static void main(String[] args) {
        checkNumber(0);
    }
    public static void checkNumber(int number) {

        System.out.println((number >0) ? "positive" : ((number < 0) ? "negative" : "zero"));

//        if (number > 0) {
//            System.out.println("positive");
//        } else if (number < 0) {
//            System.out.println("negative");
//        } else {
//            System.out.println("The number was zero");
//        }
    }
}
