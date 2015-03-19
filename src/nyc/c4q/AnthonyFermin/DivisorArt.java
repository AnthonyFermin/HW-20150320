package nyc.c4q.AnthonyFermin;

import java.util.Scanner;

/*
    Anthony Fermin
    Divisor Art program prints a table that's N by N in size with an '@' symbol
    where the row number or column number divides each other
    and a space if neither divides the other
 */

public class DivisorArt {

    public static void main(String[] args) {

        int tableSize;
        Scanner in = new Scanner(System.in);

        //asks user for grid size and saves it to tableSize variable
        System.out.print("Enter a grid size: ");
        tableSize = in.nextInt();
        System.out.println();

        //outer loop iterates through rows
        for(int i = 1; i <= tableSize; i++){

            //inner loop iterates through columns
            for(int j = 1; j <= tableSize; j++){

                //if row divides column number or vice versa then print "@ ", else print two spaces
                if(i % j == 0 || j % i == 0){
                    System.out.print("@ ");
                }else{
                    System.out.print("  ");
                }
            }

            //prints space after each row
            System.out.println("");
        }
    }
}
