package com.company;

import java.io.PrintStream;
import java.nio.charset.StandardCharsets;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        System.setOut(new PrintStream(System.out, true, StandardCharsets.UTF_8));
        Scanner console = new Scanner(System.in);
        System.out.print("Enter anythings:\n");
        String enterConsole = console.nextLine();

        System.out.println(enterConsole);

        char convertStringToChar = enterConsole.charAt(0);
        System.out.println(convertStringToChar);
        System.out.println("Change");

        console.close();
    }
}