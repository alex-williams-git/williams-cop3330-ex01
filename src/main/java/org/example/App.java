/*
 *  UCF COP3330 Fall 2021 Assignment 1 Solution
 *  Copyright 2021 Alexander Williams
 */

package org.example;
import java.util.Scanner;

public class App
{
    public static void main( String[] args ){
        Scanner scan = new Scanner(System.in);

        System.out.print("What is your name? ");
        String name_input = scan.nextLine();

        System.out.print("Hello, ");
        System.out.print(name_input);
        System.out.println(", nice to meet you!");
    }
}
