package day38_Inheritance.carTask_Overidding;

public class Toyota extends Car{
    public Toyota(String model, int year, double price, String color, int miles) {
        super("Toyota", model, year, price, color, miles);

    }

    public void reliable(){
        System.out.println(brand+ " "+model+ " is reliable");
    }
    //@Override  you  can put  and chack if it's overrided!!!!!!!!!!!!!!
    public void start(){  //  since in class Car public modifier, I can give public but NOT LESS
     System.out.println("Twist the key to ignition to start "+ brand+ " "+model);
    }
    //  if  I  have protected mod.  I can give protected or public
    //  if I have private modifier in Car Class  the method can not be overrided
    // now we have ONE method with diff. implement. in memory
    // how to we know which method wil get executed
    // By Object!!!!!!!!!!
    // we overriding if  different implementation is needed
    // Shortcuts= right click -> override-> Intelej is asking you which methods are you going to Override
    // we MUST  check Car Class




}
// toyota extra methods   reliable()