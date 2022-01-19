package day32_ConstructorOverloading;

public class Test {


    public Test(){ 
        System.out.println("A");  
    }
    public Test(int a){   // AB
        this();//  sec cont call  first//  
        System.out.println("B");
    }

    public Test(double a){    //ABC
        this(10);//
        System.out.println("C");
    }

    public Test(String str){    //ABC
        this(2.5);//    
        System.out.println("D"); // ABCD
    }



    public static void main(String[] args) {
        
          Test test1 = new Test("Elena");
          System.out.println(test1);


        
    }
    
}
