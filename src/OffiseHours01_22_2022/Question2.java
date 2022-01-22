package OffiseHours01_22_2022;

public class Question2 {

    boolean canBounce;  //  this  we have instance variable
    String color;

    public static void main(String[] args) {

        Question2 obj = new Question2();
        String color; //  here  String color ic local variable
        color = "red";
        System.out.println(obj.color); // null
        System.out.println(color);  // red
    }
}
