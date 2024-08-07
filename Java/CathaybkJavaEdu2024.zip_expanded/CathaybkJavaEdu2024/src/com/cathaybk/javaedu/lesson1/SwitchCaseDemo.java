package com.cathaybk.javaedu.lesson1;

/**
 * <pre>
 * switch 條件式
 * </pre>
 */
public class SwitchCaseDemo {

    public static void main(String[] args) {
        int rank = 2;
        switch (rank) {
            case 1:
                System.out.println("第1名，獎學金10000元");
                break;
            case 2:
                System.out.println("第2名，獎學金5000元");
                break;
            case 3:
                System.out.println("第3名，獎學金2000元");
                break;
            default:
                System.out.println("加油唄！");
                break;
        }
    }

}
