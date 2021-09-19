package com.company;
import java.util.Scanner;
public class Exam {
    static Scanner sc = new Scanner(System.in);

    public static void main(String[] args) {
        //Scanner input = new Scanner(System.in);
        System.out.println("Please enter your grade level:");
        String s = sc.next();
        char p = s.charAt(0);
        System.out.println();
        switch(p){
            case 'A':
            case 'B':
            case 'a':
            case 'b':
           System.out.println("Perfect! You are so clever!");
          break;
          case 'C':
          case 'c':
          System.out.println("Good! But You can do better!");
         break;
         case 'D':
            case 'E':
            case 'd':
            case 'e':
         System.out.println("It is not good! You should study!");
         break;
            case 'F':
            case 'f':
                System.out.println("Fail! You need to repeat the exam!");
                break;
                default:
                    System.out.println("Please enter A, B, C, D, E or F");
        }
    }}

