package day07_Operators;

public class Short_Hand_Operator {
    public static void main(String[] args) {

        // 1. assignment operator: =  WE HAVE to know the data type, what kind of value can this variable contain when we reassigned it
        int number = 100;

        System.out.println("number = " + number);//100
        number = 200; // we updated the value (data), we reassigned it
        System.out.println("number = " + number); //200
        
        String word = "Java Progarmming";
        System.out.println("word = " + word); // "Java Programming"
        word = "Wooden Spoon";
        System.out.println("word = " + word); // "Wooden Spoon"
        word = "Cydeo";
        System.out.println("word = " + word); // "Cydeo"

        // word = 123  WE cant, because we declared STRING variable

        System.out.println("____________");
        
        // 2. additional assignment operator 
        //help you to increase the value
         int x  = 100;
        System.out.println("x = " + x);
        //x = x+200; // 300
        x += 200;  // "+="  short cot  
        System.out.println("x = " + x);
        
        String str = "Wooden";
        str += " Spoon";
        System.out.println("str = " + str);
                
        double num1 = 2.5;
        System.out.println("num1 = " + num1);
        num1 += 5; // we increased 2.5 by 5
        System.out.println("num1 = " + num1);
        
        double available = 1000.50; // bank account
        System.out.println("available = " + available);
        // deposit 300
        available+=300;
        System.out.println("available = " + available);

        System.out.println("_____________");

        //3. Subtraction assignment operator

        // withdrawing 500$.
        available -= 500; // 1300.3 - 500
        System.out.println("available = " + available);

        // withdrawing 200, then depositing 400
        available -= 200; // balance  = 600.5
        available += 400; // balance = 1000.5
        System.out.println("available = " + available);

        System.out.println("_______________");
        
        // 4. Multiplication assignment operator
        
        double salary = 50000.5;
        System.out.println("salary = " + salary);
        salary *= 2;
        System.out.println("salary = " + salary);
        
        double dodge = 0.00000001;
        System.out.println("dodge = " + dodge);
        dodge *= 1000000;
        System.out.println("dodge = " + dodge);;

        // 5.  Division  operator
        double  num2 = 250000.0;
       // num = num2/2;
        num2 /= 2;

        System.out.println("num2 = " + num2);

        System.out.println("_________");
        
        //6. remainder operator
        
        double num3 = 100;
        num3 %= 3;
        System.out.println("num3 = " + num3);

       //7

        int amount = 127; // cents
        // how many $5, $10  we need to return
        int quarters = amount/25;
        int cent = amount%25;
        System.out.println("quarters = " + quarters);
        System.out.println("cent = " + cent);


        System.out.println("___________");

        int cents2 = 127;
        cents2 %= 25;
        System.out.println("cents2 = " + cents2);

        System.out.println("_______________");
        
        int y = 300;
        y%=16;

        System.out.println("y = " + y);

        System.out.println("__________");
        
        int balance = 3500;
        // you pay ins. every month < fee 153
        balance %= 153;
        System.out.println("balance = " + balance);
        




        







        
        
        
                 




        
        
    }
}
