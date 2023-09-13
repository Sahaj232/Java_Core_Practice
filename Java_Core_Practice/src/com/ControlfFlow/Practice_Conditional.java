package com.ControlfFlow;

import java.util.Scanner;

public class Practice_Conditional {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Please select the question number");
        int questionNumber = sc.nextInt();
        switch (questionNumber){
            case 1: question1();break;
            case 2: question2();break;
            case 3: question3();break;
        }
    }
    static void question1(){
        //Write a Java program to get a number from the user and print whether it is positive or negative.
        Scanner sc = new Scanner(System.in);
        System.out.println("Please enter a number");
        float number = sc.nextFloat();
        if (number > 0){
            System.out.println("Number is Positive");
        }
        else System.out.println("Number is negative");
    }

    static void question2(){
        //Write a Java program to solve quadratic equations (use if, else if and else).
        System.out.println("please enter the values of a , b and c of quadratic equation");
        Scanner sc = new Scanner(System.in);
        double a = sc.nextDouble(), b= sc.nextDouble(), c = sc.nextDouble();
        double d = b*b -(4*a*c);
        if (d>0){
            System.out.println("Euation have real roots");
            double root1 = ((-b)+Math.pow(d,0.5)) / (2*a);
            double root2 = ((-b)-Math.pow(d,0.5)) / (2*a);
            System.out.println("Euation roots are " + root1 +" and "+ root2);
        }
        else if (d==0){
            System.out.println("Euation have real and equalroots");
            double roots = ((-b) /(2.0 *a));
            System.out.println("Euation roots are equal " + roots);
        }
        else System.out.println("roots are imaginary");
    }
    static void question3(){
        //Write a Java program that takes three numbers from the user and prints the greatest number.
        Scanner sc = new Scanner(System.in);
        System.out.println("Input first Number");
        int firstNumber = sc.nextInt();
        System.out.println("Input Second Number");
        int secondNumber = sc.nextInt();
        System.out.println("Input Third Number");
        int thirdNumber = sc.nextInt();
        if (firstNumber > secondNumber && firstNumber > thirdNumber){
            System.out.println( firstNumber +" is grteatest");
        } else if (secondNumber > firstNumber && secondNumber > thirdNumber) {
            System.out.println( secondNumber +" is grteatest");
        }else System.out.println( thirdNumber +" is grteatest");
    }
    static void question4(){
//        Write a Java program that takes a number from the user and generates an integer between 1 and 7. It displays the weekday name.
        Scanner sc = new Scanner(System.in);
        System.out.println("Input Number between 1 to 7");
        int number = sc.nextInt();
        switch (number){
            case 1 : System.out.println("Monday");break;
            case 2 : System.out.println("Tuesday");break;
            case 3 : System.out.println("Wednesday");break;
            case 4 : System.out.println("Thursday");break;
            case 5 : System.out.println("Friday");break;
            case 6 : System.out.println("Saturday");break;
            case 7 : System.out.println("Sunday");break;
            default: System.out.println("enter Number between 1 to 7");
        }

    }
}
