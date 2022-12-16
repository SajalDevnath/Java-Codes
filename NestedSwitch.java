package com.javacodes;
import java.util.Scanner;

public class NestedSwitch {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int empID = sc.nextInt();
        String department = sc.next();

//        switch(empID){
//            case 1:
//                System.out.println("Sajal Devnath");
//                break;
//            case 2:
//                System.out.println("Vickey Mandal");
//                break;
//            case 3:
//                System.out.println("Ranak Devnath");
//                break;
//            case 4:
//                System.out.println("Emp number 4");
//                switch(department){
//                    case "IT":
//                        System.out.println("IT Department");
//                        break;
//                    case "Transformation":
//                        System.out.println("Transformation Department");
//                        break;
//                    case "Archive":
//                        System.out.println("Archive department");
//                        break;
//                    default:
//                        System.out.println("Please enter a valid department");
//                }
//                break;
//            default:
//                System.out.println("Enter Correct empID");
//        }
        // enhanced way to do
        switch (empID) {
            case 1 -> System.out.println("Sajal Devnath");
            case 2 -> System.out.println("Vickey Mandal");
            case 3 -> System.out.println("Ranak Devnath");
            case 4 -> {
                System.out.println("Emp number 4");
                switch (department) {
                    case "IT" -> System.out.println("IT Department");
                    case "Transformation" -> System.out.println("Transformation Department");
                    case "Archive" -> System.out.println("Archive department");
                    default -> System.out.println("Please enter a valid department");
                }
            }
            default -> System.out.println("Enter Correct empID");
        }
    }
}
