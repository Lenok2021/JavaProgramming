package day42_Exceptions;

import com.sun.jdi.InternalException;

public class Test {

    public static void main(String[] args) {






                try {

                    badMethod();

                    System.out.print("A");

                } catch (RuntimeException ex) /* Line 10 */ {

                    System.out.print("B");

                } catch (Exception ex1) {

                    System.out.print("C");

                } finally {

                    System.out.print("D");

                }

                System.out.print("E");

            }

            public static void badMethod() throws RuntimeException {



            }

        }

