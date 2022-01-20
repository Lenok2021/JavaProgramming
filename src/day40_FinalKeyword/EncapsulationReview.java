package day40_FinalKeyword;

import day39_Encapsulation_Inherintance_Recap.Shapes.Circle;

public class EncapsulationReview {

    private Circle circle;

    public Circle getCircle(){
        return circle;
    }

    public void setCircle(Circle circle){
        if(circle.getRadius()<5){
            return; //  i  can put
        }
        this.circle=circle;
    }

}
