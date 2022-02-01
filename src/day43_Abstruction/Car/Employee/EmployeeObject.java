package day43_Abstruction.Car.Employee;

public class EmployeeObject {

    public static void main(String[] args) {

         // Person person = new Person; we can not create Object from Abstraction Class
        // Employee employee = new Employee();  we can not create Object from Abstraction Class

        Tester tester = new Tester("Elena",38,'F',"SDET",125000);
        Developer developer = new Developer("Elena",38,'F',"Developer",30000);
        Teacher teacher = new Teacher ("Galina",34,'F',"Math teacher",50000);
        Driver driver = new Driver("Max",45,'M',"Truck Driver",30000);

        System.out.println(tester);
        System.out.println(developer);
        System.out.println(teacher);
        System.out.println(driver);

        System.out.println("------------------------------------------------");

        tester.work();
        tester.sleep();
        tester.bugReport();

        System.out.println("-------------------------------------------------");

        developer.sleep();
        developer.work();
        developer.unitTest();

        System.out.println("--------------------------------------------------");

        teacher.sleep();
        teacher.work();
        teacher.meetings();

        System.out.println("-------------------------------------------------------");

        driver.sleep();
        driver.work();
        driver.drive();


        }




    }

