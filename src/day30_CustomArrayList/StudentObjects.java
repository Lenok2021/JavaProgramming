package day30_CustomArrayList;
import java.util.ArrayList;

public class StudentObjects {
   public static void main(String[] args) {

      Student student1 = new Student();
      student1.setInfo("Elena", 'F', 39, 2210, 'A');

      Student student2 = new Student();
      student2.setInfo("Adam", 'M', 34, 2211, 'B');

      Student student3 = new Student();
      student3.setInfo("Anastasia", 'F', 34, 2411, 'C');

      Student student4 = new Student();
      student4.setInfo("Maruya", 'F', 18, 3211, 'D');

      Student student5 = new Student();
      student5.setInfo("Kolya", 'F', 18, 6211, 'A');


      Student[] students = {student1, student2, student3, student4, student5};

      for (Student student : students) {
         System.out.println(student);
      }

      System.out.println("-----------------------------------------------------");

      ArrayList<Student> earlyBirds = new ArrayList<>(); // grade: A
      ArrayList<Student> angryBirds = new ArrayList<>();

      for (Student student : students) {

         if(student.grade == 'A'){
            earlyBirds.add(student);
         }else{
            angryBirds.add(student);
         }

      }

      System.out.println(earlyBirds);

      System.out.println(angryBirds);





   }

}





