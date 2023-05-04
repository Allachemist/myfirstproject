public class Main1 {
    public static void main(String[] args) {
        System.out.println("Hello world");
        //       Логічні оператори та умови
        boolean isWorkingDayToday = true;
        int temperature = 8;
        System.out.println("temperature");

        if (temperature < 10 && isWorkingDayToday) {
            System.out.println("Train inside");
            System.out.println("Wear summer cloth");
        } else {
            System.out.println("Train inside");
        }

        if (temperature < 10) {
            System.out.println("Train inside");
            if (isWorkingDayToday) {
                System.out.println("Wear office cloth");
            } else {
                System.out.println("Wear weekend cloth");
                if (temperature < 1) {
                    System.out.println("Wear weekend cloth");
                }
            }
        } else {
            System.out.println("Train outside");
        }


        int temperature8 = 8;
        boolean isTemperatureLowerThan10 = temperature8 < 10;
        boolean isFriday = true;
        boolean isMonday = false;
        boolean isSummer = false;

        if (!isTemperatureLowerThan10 && !isFriday) {
            System.out.println("Condition is Working");
        } else {
            System.out.println("Condition is NOT working");
        }

     }
 }

