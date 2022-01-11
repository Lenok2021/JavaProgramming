package day06_PrimitiveTypesCastings;

public class Casting {
    

        public static void main(String[] args) {

            // IMPLICIT CASTING!!!!!!!
            byte a = 100;
            short b = a;
            // short b = ()a;
            // (short)a

            int c = (int) b; // implicit casting
            long d = c;
            // (long)c

            float e = d;
            double f = e;


            // EXPLICIT CASTING you are  doing yourself

            System.out.println("__________________");
            int x = 55;
            short y = (short) x;
            System.out.println(x + ":" + y);

            long j = 1_000_000;
            short k = (short) j;
            System.out.println(j + ":" + k);

            double l = 2.5;
            float m = (float) l;
            System.out.println(l + ":" + m);

            double n = 10.8;
            int s = (int) n;
            System.out.println(n + ":" + s);

            double d1 = 20.5;
            short s1 = (short) d1;
            System.out.println(d1 + ":" + s1);





        }

        }
