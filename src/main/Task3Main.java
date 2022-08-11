package main;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

public class Task3Main {
    public static void main(String[] args) throws IOException {
        BufferedReader reader = new BufferedReader(
                new InputStreamReader(System.in));
        System.out.println("Please, enter length of array");
        int arrayLength = Integer.parseInt(reader.readLine());
        List<Integer> array = new ArrayList<>();
        System.out.println("Enter " + arrayLength + " numbers now");
        for (int i = 0; i < arrayLength; i++) {
            array.add(Integer.parseInt(reader.readLine()));
        }
        System.out.println(filter(array));
    }

    public static List<Integer> filter(List<Integer> array) {
        return array.stream().filter(element -> element % 3 == 0).collect(Collectors.toList());
    }

}