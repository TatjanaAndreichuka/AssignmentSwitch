package com.company;
import java.util.Scanner;

public class Calc {
    static Scanner sc = new Scanner(System.in);
    public static void main(String[] args) {
    Scanner input = new Scanner(System.in);
        System.out.println("Please enter two numbers:");
    double numOne= input.nextShort();
    double numTwo=input.nextShort();
        System.out.println("Choose a function: ‘+’  for sum;"+
                        "’-’ for subtraction;" +
                        "’/’ for dividing;" +
                        "‘*’ for multiplication;" +
                        "‘%’ to get remainder when the first element is divided by the second element;" +
                        "‘p’ to print out both numbers;" +
                        "‘b’ to verify the bigger one;" +
                        "‘s’ to verify the smaller one;");
        String s = sc.next();
        char p = s.charAt(0);
        System.out.println();
        switch(p){
            case 'p':
                System.out.println("The number you've entered are " + numOne + " and " + numTwo);
                break;
            case '-':
                System.out.println("The result is: " + (numOne-numTwo));
                break;
            case '/':
                System.out.println("The result is: " + (numOne / numTwo));
                break;
            case '*':
                System.out.println("The result is: " + (numOne*numTwo));
                break;
            case '%':
            System.out.println("The result is: " + (numOne%numTwo));
               break;
            case '+':
                System.out.println("The result is: " + (numOne+numTwo));
                break;
            case 'b':
           System.out.println((numOne > numTwo) ? ""+numOne+"" : ""+numTwo+"");
                break;
           case 's':
               System.out.println((numOne < numTwo) ? ""+numOne+"" : ""+numTwo+"");
             break;
            default:
                System.out.println("Use a function from the list above");
}}}

