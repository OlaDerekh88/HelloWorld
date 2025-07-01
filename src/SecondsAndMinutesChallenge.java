public class SecondsAndMinutesChallenge {

    public static void main(String[] args) {

        System.out.println(getDurationString(3945)); //This is the first case
        System.out.println(getDurationString(65, 45)); //This is the second test case
    }

    public static String getDurationString(int seconds) {

// Two step approach to get hours
        int minutes = seconds / 60;
        return getDurationString(minutes, seconds);
    }
//        int hours = minutes / 60;
//        System.out.println("hours = " + hours);

//        //One step approach to get hours
//        int hours1 = seconds / 3600;
//        System.out.println("hours1 = " + hours1);
//        return "";
//    }
//        int remainingMinutes = minutes % 60;
//        System.out.println("minutes = " + minutes);
//        System.out.println("remainingMinutes = " + remainingMinutes);

//        int remainingSeconds = seconds % 60;
//        System.out.println("remainingSeconds = " + remainingSeconds);

//        return hours + "h " + remainingMinutes + "m " + remainingSeconds + "s";
//}

    public static String getDurationString(int minutes, int seconds) {

        int hours = minutes / 60;
        int remainingMinutes = minutes % 60;
        int remainingSeconds = seconds % 60;

        return hours + "h " + remainingMinutes + "m " + remainingSeconds + "s";
    }
}
