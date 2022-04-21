package restaurant;

import java.util.Scanner;

public class Restaurant {
    public static void main(String[] args) {
        //create a new instance
        Menu menuoutput = new Menu();
        //updated entire menu on screen
        System.out.println(menuoutput.toString());

        //updated individual menu on screen

        Scanner input = new Scanner(System.in);
        System.out.println("Enter  \n1: for Appetizers \n2: for Main Dishes \n3: for Desserts");
        boolean valid = false;
        try {
            while (!valid) {

                int in = input.nextInt();

                if (in == 1) {
                    System.out.println(menuoutput.getAllAppetizers());
                    valid = true;
                    break;
                } else if (in == 2) {
                    valid = true;
                    System.out.println(menuoutput.getAllMainDishes());
                    break;
                } else if (in == 3) {
                    valid = true;
                    System.out.println(menuoutput.getAllDesserts());
                    break;
                } else {
                    valid = false;
                    System.out.println("Enter a number 1 , 2, or 3");
                }

            } //end of while
        } catch (Exception e){
            System.out.println("Invalid input");
        }

    }
}

/*
codes for getting input from user
        GetInput input = new GetInput();
         int in = input.getGetUserInput();
*/


