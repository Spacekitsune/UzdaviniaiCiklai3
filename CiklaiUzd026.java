package UzdaviniaiCiklai3;
//Exercise 1: CheckerPattern
//Write a program called CheckerPattern that prompts user for the size
//(a non-negative integer in int); and prints the following checkerboard pattern
//Enter the size:7
//# # # # # # #
// # # # # # # #
//# # # # # # #
// # # # # # # #
//# # # # # # #
// # # # # # # #
//# # # # # # #
//HINT:
//for (int col = 1; col <= size; col++) {  // col = 1, 2, 3, ..., size
//if ((row % 2) == 0) {   // row 2, 4, 6, ...
//......
//}
import java.util.Scanner;
public class CiklaiUzd026 {
    public static void main(String[] args) {
        Scanner reader = new Scanner(System.in);

        int size, col, row;

        System.out.println("Enter the size: ");
        size = reader.nextInt();

        row = size;

        for (int i=1; i<=row; i++) {

            if ((i % 2) == 0) {
                System.out.print(" ");
            }

            for (col = 1; col <= size; col++) {
                System.out.print("# ");
            }

            System.out.println();
        }

        reader.close();
    }
}
