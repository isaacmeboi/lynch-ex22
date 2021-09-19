package exercise22;
import java.util.Scanner;
class Number {

    int[] n = new int[100];
    int c = 0;
    int l = 0;
    Scanner sc = new Scanner(System.in);

    public void scn() {
        while (true) {

            System.out.print("Enter any number (-1 to stop): ");

            int x = sc.nextInt();

            if (x == -1)

                break;

            if (contain(n, x)) {

                System.out.println("Number already entered. Please Enter a different number!!");

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
