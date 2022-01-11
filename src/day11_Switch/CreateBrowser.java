package day11_Switch;

public class CreateBrowser {
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
        String browserName = "Chrome";
        String result = "";
        boolean validName = browserName == "Chrome" || browserName == "Firefox"
                || browserName == "Opera" || browserName == "Safari" || browserName == "Edge";
        if (validName){
            if(browserName == "Chrome"){
                result = "Chrome";
            }else if (browserName == "Firefox"){
                result = "Firefox";
            }else if (browserName == "Opera"){
                result = "Opera";
            }else if(browserName == "Safari"){
                result = "Safari";
            }else{
                result = "Edge";
            }


                   }else{
            System.out.println("Invalid browser");
        }
        System.out.println(result);
    }

}
