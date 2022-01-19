package day33_CustomClassStatic;

public  class Employee {

  // public  static String name;  // when  we declare static  each object will have same name
  public String name;

   public double salary;

   public static boolean isHuman = true;
   public static boolean isAnimal=false;

   public static void eat(){
       System.out.println("I eat");
   }
}

