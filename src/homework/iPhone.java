package homework;

public class iPhone {

    public String model;
    public double price;
    public String color;
    public String size;

    public static String brand = "Samsung";
    public static String  OS = "iOS";
    public static String madeIn = "China";

    public iPhone(String model, double price, String color, String size) {
        this.model = model;
        this.price = price;
        this.color = color;
        this.size = size;
    }

    public void  faceTime(long phoneNumber){
        System.out.println(phoneNumber+ " is calling for Face Time");
    }
public  void faceTime(String eMail){
    System.out.println(eMail+ " is calling for Face Time");
}
    public  void call(long number){
        System.out.println(number+ " is calling");
    }
    public  void text(long number ){
        System.out.println(number+ " is calling for Face Time");
    }

    public String toString() {
        return "iPhone{" +
                "model='" + model + '\'' +
                ", price=" + price +
                ", color='" + color + '\'' +
                ", size='" + size + '\'' +
                ", Brand='" + brand + '\'' +
                ", Operating System='" + OS + '\'' +
                ", Made in='" + madeIn + '\'' +
                               '}';
    }
}


/*
IPhone Task:
		1. Creta a class named IPhone:

				Attributes:
					instance: model, price, color, size
					statics: brand, OS, madeIn
				Add a constructor that can set All the fields (instances)
				Actions:
					faceTime(long phoneNumber)
					faceTime(String email)
					call(long phoneNumber)
					text(long phoneNumber)
					toString()

 */