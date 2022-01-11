package day35_Encapsulation.encapsulation;

public class Person {

   private String name;  //  interview question  how to generate
   private int age;
   private int groupNumber;

   public String getName(){// return time , no parameters
      return name;
   }

   public void setName(String name){ // void type with parameters
      this.name=name;
   }

   public int getAge(){
      return age;
   }

   public void setAge(int age){
      if(age<=0 || age>150){
         System.err.println("Invalid age");
        System.exit(0);
             }
      this.age=age;
   }

   public int getGroupNumber(){
      return groupNumber;
   }

   public void setGroupNumber(int groupNumber){
      this.groupNumber=groupNumber;
   }

}
