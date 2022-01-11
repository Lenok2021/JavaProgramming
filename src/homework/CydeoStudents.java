package homework;

public class CydeoStudents {

    public String name;
    public int age,id, batchNumber, groupNumber;
    public char gender,  grade;

    public static String schoolName = "Cydeo school";
    public static String programmingLanguage = "Java";

    public CydeoStudents(String name, int age, int id, int batchNumber, int groupNumber, char gender, char grade) {
        this.name = name;
        this.age = age;
        this.id = id;
        this.batchNumber = batchNumber;
        this.groupNumber = groupNumber;
        this.gender = gender;
        this.grade = grade;
    }

    public void study(){
        System.out.println(name+ " is studying");
    }

    public void attendClass(){
        System.out.println(name+ " is attending");
    }

    @Override
    public String toString() {
        return "CydeoStudents{" +
                "name='" + name + '\'' +
                ", age=" + age +
                ", id=" + id +
                ", batchNumber=" + batchNumber +
                ", groupNumber=" + groupNumber +
                ", gender=" + gender +
                ", grade=" + grade +
                ", schoolName=" + schoolName +
                ", programmingLanguage="+programmingLanguage+
                '}';
    }
}


/*
Create a class named CydeoStudent:

				Attributes:
					instances: name, age, gender, id, grade, batchNumber, groupNumber
					statics: schoolName, programmingLanguage

				Add a constructor that can set All the fields (instances)

				Actions:
					study()
					attendClass()
					printSchoolName(): displays the school name
					printProgLanguage(): displays the name of programming language
					toString()


 */