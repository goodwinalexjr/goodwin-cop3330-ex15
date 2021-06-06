/*
 *  UCF COP3330 Summer 2021 Assignment 1 Solution
 *  Copyright 2021 Alex Goodwin
 */

package org.example;

import java.util.Scanner;

public class App {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        //any username for the first test
        System.out.print("What is the Username? ");
        String userName = sc.nextLine();
        //password is abc$123
        System.out.print("What is the password? ");
        String password = sc.nextLine();
        if (password.equals("abc$123")){
            System.out.println("Welcome!");
        }
        else{
            System.out.println("I dont know you.");
        }
    }
}
