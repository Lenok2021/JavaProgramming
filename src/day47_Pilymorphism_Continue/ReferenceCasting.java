package day47_Pilymorphism_Continue;

import day39_Encapsulation_Inherintance_Recap.Shapes.Circle;
import day39_Encapsulation_Inherintance_Recap.Shapes.Shapes;



public class ReferenceCasting {

   public static void main(String[] args) {


      Shapes shape = (Shapes) new Circle(4.5);   // upcasting
      //  we can  assign any data  type to another
      // BC reference casting was done implicitly

      Shapes shape1 = new Circle(5.5);

      //  Since  we  have casting  we can achieve Polymorphism





   }





}
