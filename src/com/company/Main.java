package com.company;
import java.util.Scanner;  // imports the Scanner class
//https://isolate.menlosecurity.com/https://corndel.atlassian.net/wiki/spaces/AC/pages/23003252/1+-+FizzBuzz+Java

//STILL TO DO"
// If a number is a multiple of 17, reverse the order in which any fizzes,
// buzzes, bangs etc. are printed. (E.g. 3 * 5 * 17 = 255: "BuzzFizz")

public class Main {

    public static void main(String[] args) {
        System.out.println("Please enter a maximum number: ");
        Scanner scanner = new Scanner(System.in);
        int i = Integer.parseInt(scanner.nextLine());
        int x = 1;
        while (x <= i) {
            FizzBuzz(x);
            x++;
        }
    }
    public static void FizzBuzz(int i){
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
}
