package com.cathaybk.javaedu.lesson1;

/**
 * <pre>
 * 迴圈－break 
 * </pre>
 */
public class LoopBreak {
    
    public static void main(String[] args) {
        int sick = 5; // 第5堂課請假
        
        for (int i = 1; i <= 8; i++) {
            if (i == sick) {
                System.out.println("身體不適、回家");
                break; // 強制結束任何種類的迴圈(for)
            }
            System.out.println("上完第" + i + "堂課");
        }
    }
    
}
