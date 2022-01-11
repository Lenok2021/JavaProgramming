package day11_Switch;

public class Calculator {
    public static void main(String[] args) {
       /*

       given  2 var.  n1, n2  and char var.
       use switch stat.  to calculate n1 & n2  based on given operator

       valid  oper: -, +, *, /

        */
        double n1 = 200.5;
        double n2 = 10.5;
        char operator = '-';
        boolean valid = operator == '+' || operator == '-'
                || operator == '*' || operator == '/';
        if (valid) { //  operator : +, -, *, /.
            switch (operator) {
                case '+':
                    System.out.println(n1+n2);
                    break;
                case '-':
                    System.out.println(n1 - n2);
                    break;
                case '*':
                    System.out.println(n1 * n2);
                    break;
                default:
                    System.out.println(n1 / n2);


            }


        } else {
            System.err.println("Invalid");


        }

    }


}
