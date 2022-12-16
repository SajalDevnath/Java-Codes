package com.javacodes;
import java.util.Scanner;

public class Switch {
    public static void main(String[] args) {
        /*
        Switch: in switch statements, you can jump to various case based on your expression.
        Syntax:
        Switch(expression){
        Cases: cases have to be same type as expressions, must be a constant or literal. (Duplicate case values are not allowed)
        case one:
            do something
           break;   // break uses to terminate the sequence, if break is not used, it will continue to next case.
        case two:
            do something
           break;
        default:  // default will execute when none of the above does, if default is not at the end, put break after it.
            do something
        }
         */
        Scanner sc = new Scanner(System.in);
//        String fruit = sc.next();

        //Old style

//        switch (fruit) {
//            case "Mango":
//                System.out.println("King of fruits");
//                break;
//            case "Apple":
//                System.out.println("A sweet red fruit");
//                break;
//            case "Orange":
//                System.out.println("Round fruit");
//                break;
//            case "Grapes":
//                System.out.println("Small fruit");
//                break;
//            default:
//                System.out.println("Enter a valid fruit");
//                break;
//        }
        int day = sc.nextInt();

        //New style

//        switch(day){
//            case 1 -> System.out.println("Monday");
//            case 2 -> System.out.println("Tuesday");
//            case 3 -> System.out.println("Wednesday");
//            case 4 -> System.out.println("Thursday");
//            case 5 -> System.out.println("Friday");
//            case 6 -> System.out.println("Saturday");
//            case 7 -> System.out.println("Sunday");
//
//        }

        // For Weekdays & weekends

//        switch(day){
//            case 1:
//            case 2:
//            case 3:
//            case 4:
//            case 5:
//                System.out.println("Weekday");
//                break;
//            case 6:
//            case 7 :
//                System.out.println("Weekend");
//                break;
//        }
        switch (day) {
            case 1, 2, 3, 4, 5 -> System.out.println("Weekday");
            case 6, 7 -> System.out.println("Weekend");
        }
    }
}
