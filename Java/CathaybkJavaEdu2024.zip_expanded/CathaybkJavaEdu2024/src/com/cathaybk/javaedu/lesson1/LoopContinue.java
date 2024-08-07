package com.cathaybk.javaedu.lesson1;

/**
 * <pre>
 * 迴圈－continue
 * </pre>
 */
public class LoopContinue {

    public static void main(String[] args) {
        int absent = 5; // 第5堂課蹺課

        for (int i = 1; i <= 8; i++) {
            if (i == absent) {
                System.out.println("蹺課出去玩，不上課了");
                continue; // 代表強制跳過1次迴圈的執行，但不會影響之後的迴圈執行，所以不像break直接結束整個迴圈。
            }
            System.out.println("上完第" + i + "堂課了");
        }
    }

}
