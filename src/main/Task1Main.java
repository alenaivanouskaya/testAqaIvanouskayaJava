package main;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Task1Main {
    public static void main(String[] args) throws IOException {
        System.out.println("Please, enter a number");
        BufferedReader reader = new BufferedReader(
                new InputStreamReader(System.in));
        String value = reader.readLine();
        try {
            if (Double.parseDouble(value) > 7) {
                System.out.println("Привет");
            }
        } catch (NumberFormatException e) {
            System.out.println("Syntax error");
        }
    }
}