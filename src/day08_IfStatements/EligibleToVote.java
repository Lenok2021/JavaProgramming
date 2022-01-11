package day08_IfStatements;

public class EligibleToVote {

    public static void main(String[] args) {
        // task is the member eligible to vote
String name  = "Elena";
int age = 12;
String citizen = "UK";
// ELIGIBLE

        boolean isEligible = age>= 21 && citizen =="USA";
        if(isEligible){
            System.out.println(name + " is eligible to vote: " + isEligible);

        }
// no eligible
        if(!isEligible){
            System.out.println(name + " is not eligible  " + !isEligible);
        }

        System.out.println("____________________");
        
        int n = 10;
        String tt  = "Elena";
        if(n% 5== 0){
            System.out.println("tt = " + tt);
        }

int a = 10;
        int b = 2;
        int c = b+a *3%b + 3;
        System.out.println("c = " + c);
        float d = 100.78F;
        short f = (byte)d;
        byte k = (byte) f;
        byte v = (byte)f;
        System.out.println("k = " + k);


    }
}
