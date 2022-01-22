package OffiseHours01_22_2022;

public class Question1 {
    String name;
    int numOfTests;

    public void setInfo(String name, int numOfTests){
        this.name=name;
        this.numOfTests=numOfTests;
    }

    @Override
    public String toString() {
        return "{" +
                "name='" + name + '\'' +
                ", numOfTests=" + numOfTests +
                '}';
    }

    public static void main(String[] args) {
        Question1 t = new Question1();
        t.setInfo("smoke test",15);

        System.out.println("t = " + t);

    }
}
