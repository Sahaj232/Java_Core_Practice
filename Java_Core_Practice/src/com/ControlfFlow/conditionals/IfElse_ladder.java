package com.ControlfFlow.conditionals;

import java.util.Scanner;

public class IfElse_ladder {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        if (a<2){
            System.out.println("Number is smaller than 2");
        } else if (a<6) {
            System.out.println("Number is smaller than 6");
        }
        else {
            System.out.println("Number is Greater than 6");
        }
        // Nested if else statement
        if (a<4)
        {
            if(a<2){
                System.out.println("Number is Smaller than 2");
            }
        }
    }
}
