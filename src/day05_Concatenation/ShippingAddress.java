package day05_Concatenation;

public class ShippingAddress {

    /*
     Create a class called ShippingAddress.java
 Declare the following variables:
 name
 buildingNumber
 streetName
 city
 state
 zipCode

 Use concatenation to print the full shipping address
     */
    public static void main(String[] args) {
       String name = "Elena Baidalo",
               buildingNumber = "11821B",
               streetName = "Neptune avenue",
               city = "Brooklyn",
               state = "NY",
               zipCode = "11224A";
/*
        System.out.println("name = " + name);
        System.out.println("buildingNumber = " + buildingNumber);
        System.out.println("streetName = " + streetName);
        System.out.println("city = " + city);
        System.out.println("state = " + state);
        System.out.println("zipCode = " + zipCode);


 */
        // use concatenation  for printing address

       // System.out.println(name + "\n" + buildingNumber + " " + streetName + "\n" + city + ", " + state + " " + zipCode);
String address = name + "\n" + buildingNumber + " " + streetName + "\n" + city + ", " + state + " " + zipCode;
        System.out.println(address);



}
    }
