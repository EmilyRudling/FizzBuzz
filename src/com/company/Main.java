package com.company;
import java.util.*;
import java.util.Scanner;  // imports the Scanner class
//https://isolate.menlosecurity.com/https://corndel.atlassian.net/wiki/spaces/AC/pages/23003252/1+-+FizzBuzz+Java

public class Main {
    public static void main(String[] args) {
        System.out.println("Please enter a maximum number: ");
        Scanner scanner = new Scanner(System.in);
        int i = Integer.parseInt(scanner.nextLine());
        int x = 1;
        while (x <= i) {
            FizzBuzz2(x);
            x++;
        }
    }

    public static void FizzBuzz(int i){ //BAD BAD BAD - VERSION 1
        if (i % 5 == 0 || i % 3 == 0 || i % 11 == 0 || i % 7 == 0 || i % 13 == 0){
            //all of the numbers that should be replaced are checked above
            if (i % 11 == 0){
                System.out.print("Bong"); //INSTEAD of the number
            }
            else{
                if (i % 7 == 0 && i % 13 == 0 && i % 5 != 0){
                    System.out.print("Fezz"); //in front of the first thing beginning with B, or at the end
                }
                if (i % 7 == 0){
                    System.out.print("Bang"); //bang before others
                }
                if (i % 3 == 0){
                    System.out.print("Fizz"); //with others
                }
                if (i % 7 != 0 && i % 13 == 0 && i % 5 == 0){
                    System.out.print("Fezz"); //in front of the first thing beginning with B, or at the end
                }
                if (i % 5 == 0){
                    System.out.print("Buzz"); //with others
                }
                if (i % 7 != 0 && i % 13 == 0 && i % 5 != 0){
                    System.out.print("Fezz"); //in front of the first thing beginning with B, or at the end
                }
            }
            System.out.println();
        }
        else{
            System.out.println(i);
        }
    }

    public static void FizzBuzz2(int i) { //nice and nice -- VERSION 2
        List outputArray = new ArrayList();
        if (i % 3 == 0){
            outputArray.add("Fizz");
        }
        if (i % 5 == 0){
            outputArray.add("Buzz");
        }
        if (i % 7 == 0){
            outputArray.add("Bang");
        }
        if (i % 11 == 0){
            outputArray.clear();
            outputArray.add("Bong");
        }
        if (i % 17 == 0){
            Collections.reverse(outputArray);
        }
        if (outputArray.isEmpty()){
            outputArray.add(Integer.toString(i));
        }
        for(Object val : outputArray) {
            System.out.print(val);
        }
        System.out.println("");
    }
}
