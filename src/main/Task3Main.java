package main;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Task3Main {
    public static void main(String[] args) throws IOException {
        int arrayLength = 100;
        int[] array = new int[arrayLength];
        BufferedReader reader = new BufferedReader(
                new InputStreamReader(System.in));
        System.out.println("Please, enter length of array");
        arrayLength = Integer.parseInt(reader.readLine());
        System.out.println("Enter " + arrayLength + " numbers now");
        for (int i = 1; i <= arrayLength; i++) {
            array[i] = Integer.parseInt(reader.readLine());
        }
        for (int i = 1; i <= arrayLength; i++) {
            if (array[i] % 3 == 0) {
                System.out.println(array[i]);
            }
        }
    }
}