package Eceptions;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int s = input.nextInt();

        try {
            System.out.println(100 / s);
        } catch (ArithmeticException q) {
            System.out.println("Du må ikke dele med 0");
        } catch (RuntimeException e) {
            System.out.println("REEEEEEEEEEE");
        }
    }
}
