package day11_Switch;

public class NumberOfDays {

    /*
       28  days: 2;
       30  days:  4, 6, 9,11
       31  days: 1,3,5,7,10,12


     */
    public static void main(String[] args) {
        int year = 2000;
        int number = 2;

        String result = "";
        if (number >= 1 && number <= 12) {
            switch (number) {
                case 2:
                    if (year % 4 == 0) {
                        System.out.println("29 days");
                    } else {
                        System.out.println("28 days");
                    }
                    break;
                case 4:
                case 6:
                case 9:
                case 11:
                    System.out.println("30 days");
                    break;

                default: //1,3,5,7,10,12
                    System.out.println("31 days");

            }

        } else {

            System.out.println("Invalid");
        }


    }


}