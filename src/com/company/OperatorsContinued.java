package com.company;

public class OperatorsContinued {
    public static void main(String[] args) {

   /*     int x = -4;

        //Conditional Operator: ?
        x = (x > 0) ? 100 : (x > -10) ? (x > -3) ? -2 : 6 : -5;

        if(x > 0) {
            x = 100;
        } else if(x > -10) {
            if(x > -3) {
            }
        } else {
            x = -2;
        }



        x += (x > 0) ? 100 : -100;
        System.out.print(x);
*/

      //Logical Operators
//        boolean a = false;
//        boolean b = false;
//        boolean c = true;
//        boolean d = true;
//
//       // boolean result = !((!a && b) || !(c || d) && (!(a || d) ^ !b ^ !a));
//        boolean result = c && d;
//        System.out.println("The result is: " + result);
//
//        int y = 113;
//        int z = 211;
//        int intResult = y | z;
//        System.out.println("The new intResult is: " + intResult);

//Oddity of String
//        String s1 = "hi";
//        String s2 = "Hi";
//        String s3 = new String("Hi");
//        String s4 = "Hi";
//        boolean stringsAreTheSame = s1 == s2;
//        boolean sTwoAndThreeAreTheSame = s2 == s3;
//        boolean sTwoAndFourAreTheSame = s2 == s4;
//
//        System.out.println("s1 is the same as s2: " + stringsAreTheSame);
//        System.out.println("s2 is the same as s3: " + sTwoAndThreeAreTheSame);
//        System.out.println("s2 is the same as s4: " + sTwoAndFourAreTheSame);
//
//        System.out.println("My strings are: " + s1 + " " + s2 + " " + s3 + " " + s4);
//
//        boolean correctComparison = s1.equals(s3);
//
//        System.out.println("s1 is the same as s3: " + correctComparison);


//Postfix and Prefix Operator
//        int w = 0;
//        w += 1;
//
//        w = 0;
//        System.out.println("The value of w is: " + w ++);
//        System.out.println("The value of w now is: " + w);
//


        //For Loops
        int i = 0, runs = 0;
        for(i = 10; i < 23; i = i + 3)
        {
            if(i % 2 == 0) {
                System.out.println("Hey");
            }
            runs++;
        }
        System.out.println("i: " + i + " runs: "+ runs);


        //While Loops
        boolean expression = true;
        int counter = 0;
        while (expression)
        {
            int integerInsideWhile = 10;
            counter++;

            if (counter == 5)
            {
                expression = false;
               // break;
            }
        }
        System.out.println("We are done with the loop and counter is: " + counter);




    }
}
