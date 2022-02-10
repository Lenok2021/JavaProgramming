package day46_Polimorphizm;

import day39_Encapsulation_Inherintance_Recap.Shapes.Circle;

public class Intro {

    String str = "Wooden Spoon";
    Integer n1 = 2;
    Double b2 = 5.6;
    Boolean r1 = true;

    //  what if I want to  store them in one place
    // I can  give common parent


    Object[] array = {str, n1, b2, r1, new Circle(4.5)};

    // Object is a parent Class,  and it can be string,
    // integer, boolean, double, Circle



}
