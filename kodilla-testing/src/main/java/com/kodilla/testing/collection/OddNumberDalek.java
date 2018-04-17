package com.kodilla.testing.collection;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collector;
import java.util.stream.Collectors;


public class OddNumberDalek {

    public static <T> Collector<T, ?, ArrayList<T>> toArrayList() {
        return Collectors.toCollection(ArrayList::new);
    }

    public ArrayList<Integer> exterminate(ArrayList<Integer> numbers) {
        return numbers.stream().filter(i -> i%2 != 0).collect(toArrayList());
    }
//    public ArrayList<Integer> exterminate(ArrayList<Integer> numbers){
//        return numbers.stream().filter(i -> i%2 != 0).collect(Collectors.toCollection(ArrayList::new));
//    }

}
