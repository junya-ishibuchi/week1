package week1.keyboardinput;

import java.util.Scanner;

public class AgeInFiveYears {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        System.out.println("Hello.  What is your name?");
        String name = scanner.next();

        System.out.println();
        System.out.println("Hi, " + name + "! How old are you?");
        int age = scanner.nextInt();

        System.out.println();
        System.out.println("Did you know that in five years you will be " + (age + 5) + " years old?");
        System.out.println("And five years ago you were " + (age - 5) + "! Imagine that!");
    }
}
