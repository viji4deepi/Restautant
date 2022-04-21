package restaurant;

import java.util.Scanner;

public class GetInput {


    public int getGetUserInput() {
        Scanner input = new Scanner(System.in);
        int getUserInput = input.nextInt();
        input.close();
        return getUserInput;
    }
}
