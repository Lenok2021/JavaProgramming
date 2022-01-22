package OffiseHours01_22_2022;

public class Question3 {
    int count;

    public void m() {
        count++;
    }

    public void m(int n) {
        count *= n;
    }

    public static void main(String[] args) {
        Question3 obj = new Question3();
        obj.m(5); //0
        obj.m(); //1
        obj.count += 10;
        obj.m(2);
        System.out.println(obj.count); // 22

    }


}
