package com.company;

public class Main {

    public static void main(String[] args) {
        int i = 1;
        while (i <= 100) {
            FizzBuzz(i);
            i++;
        }
    }
    public static void FizzBuzz(int i){
        if (i % 5 == 0 && i % 3 == 0){
            System.out.println("FizzBuzz");
        }
        else if (i % 3 == 0){
            System.out.println("Fizz");
        }
        else if (i % 5 == 0){
            System.out.println("Buzz");
        }
        else{
            System.out.println(i);
        }
    }
}
