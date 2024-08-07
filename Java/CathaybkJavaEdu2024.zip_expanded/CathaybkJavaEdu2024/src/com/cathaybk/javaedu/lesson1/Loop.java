package com.cathaybk.javaedu.lesson1;

/**
 * <pre>
 * 迴圈－for
 * 迴圈－while
 * </pre>
 */
public class Loop {

    public static void main(String[] args) {
        // DEMO : for ----------
        for (int i = 0; i < 10; i++) {
            System.out.println(i);
        }

        // DEMO : while ----------
        int j = 0;
        while (j < 10) {
        	System.out.println(j);
        	j++;
        //        }

        // DEMO : do...while ----------
        //        int k = 0;
        //        do {
        //            System.out.print(k);
        //            k++;
        //        } while (k < 10);

        // DEMO : 比較while、do...while ----------
        //        int j = 11;
        //        while (j < 10) {
        //            System.out.print("while執行");
        //            j++;
        //        }
        //
        //        int k = 11;
        //        do {
        //            System.out.print("do...while執行");
        //            k++;
        //        } while (k < 10);
    }

}
