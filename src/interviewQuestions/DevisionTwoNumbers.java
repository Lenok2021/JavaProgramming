package interviewQuestions;

public class DevisionTwoNumbers {

        public static void main(String[] args) {

            int a = 50; //a =30-7=23-7=16 -7 =9 - 7 = 2
            int b = 9;

            int count = 0; // count = 1+1=2+1 = 3+1 =4

            while (a >= b) {
                a -= b;
                count++;
            }


            System.out.println(count + " with a remainder of " + a);

            int number = 3;
            if(++number<4){
                number+=1;
            }

            System.out.println(number);

        }
    }

