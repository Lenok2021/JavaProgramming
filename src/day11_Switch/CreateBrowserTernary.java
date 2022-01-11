package day11_Switch;

public class CreateBrowserTernary {
    public static void main(String[] args) {
         /*
        Create a class called Browser. Write a program that can
        display the name of selected browser:
        1. declare a String variable named browserName
        2. Assume that the valid browsers are: chrome, firefox,
        opera, safari, edge.
        3. if the browser name does not match with the valid
         browser names, out put should be: Invalid Browser Name
        Ex:           String browser = "chrome";
        Output:       Chrome Browser is selected

        Note: MUST use nested if
         */

        String browser = "Chrome";

        if(browser == "Chrome" || browser == "Opera" || browser == "Safari" || browser == "Firefox"  || browser == "Edge"){
            String result = (browser == "Chrome")? "Chrome" : (browser == "Opera")? "Opera" : (browser == "Firefox")? "Firefox":
                    (browser == "Safari")? "Safari" : "Edge";


        }else{
            System.out.println("Invalid browser");

        }

        System.out.println(browser);

    }

}
