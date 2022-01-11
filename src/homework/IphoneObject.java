package homework;

public class IphoneObject {
    public static void main(String[] args) {

        iPhone iPhone1 = new iPhone("Iphone 5", 2000.0, "Black", "Small");
        iPhone iPhone2 = new iPhone("Iphone 7", 3000.0, "White", "Medium");
        iPhone iPhone3 = new iPhone("Iphone 10", 5000.0, "Purple", "Large");
        iPhone iPhone4 = new iPhone("Iphone 12",7000.0,"Pink","Extra Large");
        iPhone1.faceTime(1111233333);
        iPhone2.faceTime("cross@yahoo.com");
        iPhone3.call(555667787);
        iPhone4.text(1122334);
        System.out.println(iPhone1);
        System.out.println(iPhone2);
        System.out.println(iPhone3);
        System.out.println(iPhone4);

    }
}
