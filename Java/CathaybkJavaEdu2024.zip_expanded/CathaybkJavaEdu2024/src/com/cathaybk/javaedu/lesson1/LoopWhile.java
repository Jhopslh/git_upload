package com.cathaybk.javaedu.lesson1;

/**
 * <pre>
 * 迴圈－while
 * </pre>
 */
public class LoopWhile {

    public static void main(String[] args) {
        int j = 0;
        boolean isRun = true;
        
        while (isRun) {
            System.out.println(j);
            j++;
            if (50 < 60) {
                isRun = false;
            }
        }
    }

}
