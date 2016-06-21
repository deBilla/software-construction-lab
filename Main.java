package com.company;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
	// write your code here
        /*System .out.println("Bye Bye, cruel world");
        int day;
        day  = 17;
        System .out.println("Today is Wed, Nov " + day + ".");*/
        Scanner keyboard = new Scanner(System.in);
        //System.out.println("Enter the Amount");
        //name = input.next();
        //int amount = keyboard.nextInt();
        //String name = keyboard.nextLine();
        //String name1 = keyboard.nextLine();
        int pop = keyboard.nextInt();
        String preName = keyboard.nextLine();
        int pop1 = keyboard.nextInt();
        String preAddr = keyboard.nextLine();
        System.out.println("preAddr = " + preAddr);
        System.out.println("preName = " + preName);
        System.out.println("pop = " + pop);
        System.out.println("pop1 = " + pop1);

    }
}
