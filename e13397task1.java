package com.company;

import java.util.Scanner;

/**
 * Created by e13397 on 6/21/16.
 */
public class task1 {

    public static void main(String[] args) {
        Scanner keyboard = new Scanner(System.in);
//declaring variables
        int number,x1,x2,x3,x4;
        System.out.println("Enter a number: ");
        num = keyboard.nextInt();

        x1=number%15; //to check whether it is divisible by 15
        x2=number%5; //to check whether it is divisible by 5
        x3=num%6; //to check whether it is divisible by 6
        x4=num%18; //to check whether it is divisible by 18

//check whether the number is divisible by 15 and greater than 999
        if ((x1==0) && (num>999))
        {

//check whether the number is weird
            if ((x2==0) && (x3==0) && (x4!=0))
            {
                System.out.println(+num+ " is special,big,weird and scary.");
            }
            else //not weird
            {
                System.out.println(+num+ " is special,big and scary but not weird.");
            }
        }

//check whether the number is divisible by 15 and lesser than 999
        if((x1==0) && (num<999))
        {
            if ((x2==0) && (x3==0) && (x4!=0))
            {
                System.out.println(+num+ " is special,weird and scary but not big.");
            }
            else
            {
                System.out.println(+num+ " is special but not scary.");
            }
        }

//check whether the number is not divisible by 15 but it is greater than 999
        if((x1!=0) && (num>999))
        {
            if ((x2==0) && (x3==0) && (x4!=0))
            {
                System.out.println(+num+ " is big,weird and scary.");
            }
            else
            {
                System.out.println(+num+ " is not special, big and scary but not weird.");
            }
        }

//check whether the number is not divisible by 15 and lesser than 999
        if((x1!=0) && (num<999))
        {
            if ((x2==0) && (x3==0) && (x4!=0))
            {
                System.out.println(+num+ " is weird and scary.");
            }
            else
            {
                System.out.println(+num+ " is not special or not scary.");
            }
        }
    }
}
