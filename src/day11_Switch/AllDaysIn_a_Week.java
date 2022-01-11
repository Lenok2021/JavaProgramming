package day11_Switch;

public class AllDaysIn_a_Week {

    public static void main(String[] args) {

        //long, float, double, boolean = NOT  use  !!!!!!!!!!!

        // we can use  CHAR,  when use  char  in switch  case  value = '  single  char character'
        // we can you:  string,
        // we can you  data type for integer  numbers



        int number = 5;

        switch (number) { // 1,2,3,4,5,6,7  ==   only  this operator we can you
            case 1:// case  #  must bee unique every  time
                System.out.println("Monday");
                break; // is not a mandatory  but,  if you do not put  bellow cases will be executed

            case 2:
                System.out.println("Tuesday");
                break; // exits  the switch  after  executing the case block
            case 3:
                System.out.println("Wednesday");
                break;// exits  the switch  after  executing the case block
            case 4://
                System.out.println("Thursday");
                break; // exits  the switch  after  executing the case block
            case 5:
                System.out.println("Friday");
                break; // exits  the switch  after  executing the case block
            case 6:
                System.out.println("Saturday");
                break; //  exits  the switch  after  executing the case block
            case 7:
                System.out.println("Sunday"); // exits  the switch  after  executing the case block

            default:
                System.out.println("Invalid");
                break;  //  is  a not  a mandatory,  we have } in the last
        }

        System.out.println(100%5);



    }

}
