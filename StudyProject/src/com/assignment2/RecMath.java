package com.assignment2;

public class RecMath {
    public void recursiveOutput (int a, int b) {
        if (a == b) System.out.println(a);
        else if (a > b) {
            System.out.print(a + " ");
            recursiveOutput(a - 1, b);
        }
        else if (a < b) {
            System.out.print(a + " ");
            recursiveOutput(a + 1, b);
        }
    }
}
