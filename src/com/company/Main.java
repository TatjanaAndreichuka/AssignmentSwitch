package com.company;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Please enter the number of the day:");
        int num = input.nextInt();
        switch(num)
            {
                case 1:
                case 2:
                case 3:
                case 4:
                case 5:
                    System.out.println("It is a working day!");
                    break;
                case 6:
                case 7:
                    System.out.println("It is holiday!");
                    break;
                default:
                    System.out.println("Days can be from 1 to 7");
            }
        }

    }

