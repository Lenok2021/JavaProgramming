package day13_2_String;

public class ReplitMassege {
    public static void main(String[] args) {


        
// Sender:<Mike Smith>. From Number:[202-123-3456]. Message:{I love programing and problem solving}
        //String sender;
       // String phoneNumber;
        String messageBody;
        String message = "<Mike Smith>. From Number:[202-123-3456]. Message:{I love programing and problem solving}";
       // sender = message.substring(0, message.indexOf(".")+1);
       // phoneNumber = message.substring(message.indexOf("["), message.indexOf("].")+2);
        messageBody = message.substring(message.indexOf("{")+1);

       // System.out.println("Sender: " + sender);
       // System.out.println("Phone Number: " + phoneNumber);
        System.out.println("Message body: " + message);


    }
}
