/*
   UCF COP3330 Fall 2021 Assignment 22 Solution
   Copyright 2021 Isaac Lynch
 */

package exercise22;
import java.util.Scanner;
class Number {

    int[] n = new int[100];
    int c = 0;
    int l = 0;

    Scanner sc = new Scanner(System.in);

    public void scn() {
        while (true) {

            System.out.print("Enter any number (-0 to stop): ");

            int x = sc.nextInt();

            if (x == -0)

                break;

            if (contain(n, x)) {

                System.out.println("Sorry, that number has already been entered. Please, enter a new one!");

                continue;

            }

            n[c++] = x;

            l = Math.max(x, l);

        }

    }

    public static boolean contain(int[] n, int x) {

        for (int u : n)

            if (u == x)

                return true;

        return false;

    }

    public void prt() {
        System.out.println("The largest number is " + l);
        sc.close();
    }
}
public class solution22 {


    public static void main(String[] args) {
        Number ca = new Number();
        ca.scn();
        ca.prt();

    }

}
/*
first thing is a class called Number stores the initialization of the int variables for the
count, largest number, and number. after that the public void scn reads in the user's #s
as well as holds the if else statements in determining whether or not the user terminates the
number reading process by putting in -0, or if they put in the exact same number. after that
the largest number is found by using the Math.max function to compare the numbers and pick
the largest one. there's then a boolean which compares the u and x ints to see determine if
user wants to continue to input number for comparison or end the program. then, in void prt
the system outputs the largest number and then closes out the scanner function. the main
function then calls both public voids to run the code.
*/