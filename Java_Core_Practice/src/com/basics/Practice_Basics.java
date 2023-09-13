package com.basics;

import java.util.Scanner;

public class Practice_Basics {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Please enter the question number");
        int choice = sc.nextInt();
        switch (choice){
            case 1: question1();break;
            case 2: question2();break;
            case 3: question3();break;
            case 4: question4();break;
            case 5: question5();break;
            case 6: question6();break;
            case 7: question7();break;
            case 8: question8();break;
            case 9: question9();break;
            case 10: question1();break;
            case 11: question2();break;
            case 12: question3();break;

        }
    }
    static void question1(){
//        Write a Java program that takes two numbers as input and displays the product of two numbers.
        Scanner sc = new Scanner(System.in);
        System.out.println("Please enter two numbers");
        int a = sc.nextInt();
        int b = sc.nextInt();
        int c = a*b;
        System.out.println("Product of two number is "+c);
    }

    static void question2(){
        // table
//        Write a Java program that takes a number as input and prints its multiplication table up to 10.
        Scanner sc = new Scanner(System.in);
        System.out.println("Please enter a number");
        int a = sc.nextInt();
        for (int i = 1; i <=10 ; i++) {
            System.out.println(a+" * "+i+" = "+a*i);
        }
    }
    static void question3(){
//     Write a Java program to convert temperature from Fahrenheit to Celsius degrees..
        Scanner sc = new Scanner(System.in);
        System.out.println("Please enter the temperature in fahrenheit");
        float a = sc.nextFloat();
        float c = (a-32f)/1.8f;
        System.out.println("Temperature in C is "+c);
    }
    static void question4(){
//     Write a Java program that reads a number in inches and converts it to meters
        Scanner sc = new Scanner(System.in);
        System.out.println("Please enter the value of number in inch");
        float inch = sc.nextFloat();
        float meter = 0.0254f * inch;
        System.out.println("Value in Meter is "+meter);
    }
    static void question5(){
//     Write a Java program that reads an integer between 0 and 1000 and adds all the digits in the integer.
        Scanner sc = new Scanner(System.in);
        System.out.println("Please enter a integer between 0 and 1000");
        int number = sc.nextInt();
        if (number >1000 || number <0){
            System.out.println("please enter the number between 0 to 1000");
        }
        else {
            int sum =0;
            while (number >0){
                int digit = number%10;
                sum = sum + digit;
                number /= 10;
            }
            System.out.println("digits Added is equal " + sum);
        }
    }
    static void question6(){
//     Write a Java program to convert minutes into years and days.
        Scanner sc = new Scanner(System.in);
        System.out.println("Please enter a minutes");
        int minutes = sc.nextInt();
        int days = minutes/1440;
        int years = days/365;
        System.out.println(minutes + "minutes conveted to  " + days + " days and " + years + "  years ");
    }
    static void question7(){
        long time = System.currentTimeMillis();
        System.out.println(time);
    //not completed yet
    }
    static void question8(){
        // Write a Java program to compute the body mass index (BMI).
        Scanner sc = new Scanner(System.in);
        System.out.println("please enter weight in kg");
        float mass = sc.nextFloat();
        System.out.println("please enter height in m");
        float height=sc.nextFloat();
        float bmi= mass/(height*height);
        System.out.println("BMI of the person is" + bmi);
    }

    static void question9() {
// Write a Java program to break an integer into a sequence of digits.
        Scanner sc = new Scanner(System.in);
        System.out.println("Please enter an Integer");
        int a = sc.nextInt();
        while(a>0){

        }

    }


}