package main.java;

import java.util.Scanner;

public class Reader {
    private final Scanner scanner = new Scanner(System.in);

    public double getDouble() {
        return scanner.nextDouble();
    }

    public char getChar() {
        return scanner.next().charAt(0);
    }

    public int getInt() {
        return scanner.nextInt();
    }
}
