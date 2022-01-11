package day24_CustomMethod_Return;

public class Breakfast {


    public static void main(String[] args) {
        initials("Elena", "Baidalo");
        System.out.println("============================");
        displaydomain("cross11223@yahoo.com");
        System.out.println("================================");
        numberOfMonth(7);
        System.out.println("==================================");
        dayOfWeek(6);
        System.out.println("=====================================");
        daysOfMonth("January");
        System.out.println("========================================");
        uniqueCharacter("hello");
    }

    // when we use parameter  when we create method??
    // when we need to provide add. inf. which the method must have in order to complete this task
    // creat  method to get initials
    // void - i don't need to return  a data  at the end // no data result
    //  the parameter
    public static void initials(String firstName, String lastName) {
        String initial = firstName.charAt(0) + "." + lastName.charAt(0);
        initial = initial.toUpperCase();
        System.out.println(initial);
    }

    // Create a method that can display the domain of the email
    public static void displaydomain(String eMail) {
        //  without e-mail you cannot  complete the task
        // i need to pass my parameter
        // if you don't give  a right code fragment inside  you method
        String domain = eMail.substring(eMail.indexOf("@"));
        System.out.println(domain);
    }

    //  month
    public static void numberOfMonth(int number) {
        String name = "";

        if (number >= 1 && number <= 12) {

            name = (number == 1) ? "Jan" : (number == 2) ? "Feb" : (number == 3) ? "Mar" : (number == 4) ? "Apr" : (number == 5) ? "May"
                    : (number == 6) ? "Jun" : (number == 7) ? "Jul" : (number == 8) ? "Aug" : (number == 9) ? "Sep" : (number == 10) ? "Oct"
                    : (number == 11) ? "Nov" : "Dec";
        } else {
            name = "Invalid";
        }
        System.out.println("Month name = " + name);

    }


    //Create a method that can print the name of the day based on the given number to the method
    public static void dayOfWeek(int number) {
        String result = " ";
        if (number >= 1 && number <= 7) {
            result = (number == 1) ? "Sunday" : (number == 2) ? "Monday" : (number == 3) ? "Tuesday"
                    : (number == 4) ? "Wednesday" : (number == 5) ? "Thursday" : (number == 6) ? "Friday"
                    : "Saturday";
        } else {
            System.out.println("Invalid number");


        }
        System.out.println(result);

    }

// Create a method that can print how many days a month has

    public static void daysOfMonth(String month) {
        String result = " ";
        if (month.equalsIgnoreCase("January") || month.equalsIgnoreCase("March") || month.equalsIgnoreCase("mMay") ||
                month.equalsIgnoreCase("July") || month.equalsIgnoreCase("August") || month.equalsIgnoreCase("October") ||
                month.equalsIgnoreCase("December")) {
            result = month + " has 31 days";

        } else if (month.equalsIgnoreCase("April") || month.equalsIgnoreCase("June") || month.equalsIgnoreCase("September") ||
                month.equalsIgnoreCase("November")) {
            result = month + " has 30 days";
        } else {
            result = month + " has 28 days";

        }
        System.out.println(result);
    }

    // create a method that can display the unique characters of a string

    public static void uniqueCharacter(String word) {


    }


}



