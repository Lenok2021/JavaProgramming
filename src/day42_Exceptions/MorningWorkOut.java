package day42_Exceptions;

public class MorningWorkOut {
    public static void main(String[] args) {

        System.out.println("----Push up started-------");

        //  you must handle  checked exception

        for (int i = 1; i <= 30; i++) {
            System.out.println("\rPush up " + i);
            try {
                Thread.sleep(2000);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }

        System.out.println("\n------Push ups completed------- ");


        for (int i = 1; i <= 20; i++) {
            System.out.println("\rPush up " + i);
            try {
                Thread.sleep(1000);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }


    }

    public static void sleep(double seconds) {
        try {
            Thread.sleep((long) (seconds * 1000));

        } catch (InterruptedException e) {
            e.printStackTrace();
        }


    }
}