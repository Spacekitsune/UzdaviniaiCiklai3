package UzdaviniaiCiklai3;
//Exercise 2***: TriangularPatternX
//Write 4 programs called TriangularPatternX (X = A, B, C, D)
//that prompts user for the size (a non-negative integer in int);
//and prints each of the patterns as shown:
//Enter the size:8
//(a)
//#
//##
//###
//####
//#####
//######
//#######
//########
//(b)
//########
//#######
//######
//#####
//####
//###
//##
//#
//(c)
//########
// #######
//  ######
//   #####
//    ####
//     ###
//      ##
//       #
//(d)
//       #
//      ##
//     ###
//    ####
//   #####
//  ######
// #######
//########

import java.util.Scanner;

public class CiklaiUzd027 {
    public static void main(String[] args) {
        Scanner reader = new Scanner(System.in);

        int size;

        System.out.println("Enter the size: ");
        size = reader.nextInt();

        System.out.println("A:");
        for (int i = 1; i <= size; i++) {

            for (int j = 1; j <= size; j++) {
                if (j <= i)
                    System.out.print("*");
            }

            System.out.println();
        }

        System.out.println("B:");
        for (int i = 1; i <= size; i++) {

            for (int j = 1; j <= size; j++) {
                if (i <= j)
                    System.out.print("*");
            }

            System.out.println();
        }

        System.out.println("C:");
        for (int i = 1; i <= size; i++) {

            for (int k = 1; k < i; k++) {
                System.out.print(" ");
            }
            for (int j = 1; j <= size; j++) {
                if (i <= j)
                    System.out.print("*");
            }

            System.out.println();
        }

        System.out.println("D:");
        for (int i = 1; i <= size; i++) {

            for (int k = size; k > i; k--) {
                System.out.print(" ");
            }
            for (int j = 1; j <= size; j++) {
                if (j <= i)
                    System.out.print("*");
            }


            System.out.println();
        }
        reader.close();
    }
}
