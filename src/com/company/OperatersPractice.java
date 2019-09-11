package com.company;

public class OperatersPractice {
    public static void main(String[] args) {

        int x = 30;
        if (x > 60) {
            System.out.println("The value is > 60");
        } else if (x > 50) {
            System.out.println("The value is > 50");
        } else {
            System.out.println("The value is <= 50");

        }

        if(x > 50) {
            System.out.println("The value is > 50");
            if(x > 60) {
                System.out.println("The value is > 60");
            }
        } else {
            System.out.println("The value is <= 50");
        }




        //If-Else ladder
        int i = 20;

        if(i == 10)
            System.out.println("i is 10");
        else if(i == 15)
            System.out.println("i is 15");
        else if(i == 20)
            System.out.println("i is 20");
        else
            System.out.println("i not present");



        //Switch Statement
        switch (i) {
            case 10:
                System.out.println("i is 10");
                break;

            case 15:
                System.out.println("i is 15");
                break;

            case 20:
                System.out.println("i is 20");
                break;

            default:
                System.out.println("i is not present");
                break;
        }



        //What else can we do with a switch statement
        int y = 97;
        switch (y) {
            case 100:
            case 99:
            case 98:
                System.out.println("Congrats, you passed!");
                break;

            default:
                System.out.println("You didn't pass!");
                break;
        }


    }
}
