package utilities;

import day40_FinalKeyword.AccessModifiers_Test3;
import day40_FinalKeyword.ProtectedAccessModifier;

public class Test4 extends ProtectedAccessModifier {

    public static void main(String[] args) {

        System.out.println(ProtectedAccessModifier.name2);
        // now protected modifier is visible
        // only time when protected modifier is visible outside the package
        //when in SUBCLASS  ONLY

       ProtectedAccessModifier.method1();
       //

    }
}
