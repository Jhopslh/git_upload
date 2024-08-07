package com.cathaybk.javaedu.lesson1;

/**
 * <pre>
 * 成員變數與區域變數
 * </pre>
 */
public class HelloWorld {

    // DEMO
    private static String memberVariableString; // 成員變數

    private static int memberVariableInt; // 成員變數

    public static void main(String[] args) {
        String localVariablesString=""; // 區域變數

        System.out.println(memberVariableString);
        System.out.println(memberVariableInt);
        System.out.println(localVariablesString);
    }

    // DEMO
    //    private static String i;
    //
    //    private static int b;
    //
    //    public static void main(String[] args) {
    //        String j;
    //
    //        if (b == 0) {
    //            j = "123";
    //        } else if (b != 0) {
    //            j = "456";
    //        }
    //
    //        System.out.println(i);
    //        System.out.println(b);
    //        //        System.out.println(j);
    //    }

}
