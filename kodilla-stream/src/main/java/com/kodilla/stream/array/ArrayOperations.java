package com.kodilla.stream.array;

import java.util.stream.IntStream;

public interface ArrayOperations {
    static double getAverage(int[] numbers) {
        IntStream.range(0, numbers.length).forEach(i -> System.out.print(numbers[i]));
        double average = IntStream.range(0, numbers.length)
                .map(i -> numbers[i])
                .average()
                .getAsDouble();
        return average;
    }
}
