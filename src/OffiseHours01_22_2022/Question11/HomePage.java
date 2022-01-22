package OffiseHours01_22_2022.Question11;

public class HomePage extends BasePage{

    public HomePage() {
        //super()  we have it here.  it is hidden
        //  we don't need to pass super()  because we have default Constructor
        // if  I  have a parameterized Constructor in Base page
        // I  have super(String name)
        System.out.println("I am in Home Page");
    }
}
