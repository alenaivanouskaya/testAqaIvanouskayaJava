package main;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Objects;

public class Task2Main {
    public static void main(String[] args) throws IOException {
        System.out.println("Please, enter a name");
        BufferedReader reader = new BufferedReader(
                new InputStreamReader(System.in));
        String value = reader.readLine();
        String expectedValue = "Вячеслав";
        if (Objects.equals(value, expectedValue)) {
            System.out.println("Привет, Вячеслав");
        } else {
            System.out.println("Нет такого имени");
        }
    }
}