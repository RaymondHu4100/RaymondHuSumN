package com.company;

import java.util.Scanner;

public class Main
{
    public static void main(String[] args)
    {
        Scanner input = new Scanner(System.in);
        System.out.println("Please type in a NUMBER.");
        int n = input.nextInt();
        System.out.println("The sum from 1 to " + n + " is " + SumN.sumN(n) + ".");
    }
}
