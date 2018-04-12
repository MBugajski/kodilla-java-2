package com.kodilla.testing.collection;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

public class OddNumberDalek {
    public boolean isOdd(Integer number){
        return number%2 !=0;
    }
    public List<Integer> exterminate(ArrayList<Integer> numbers){
        return numbers.stream().filter(i -> (i%2 == 0)).collect(Collectors.<Integer>toList());
    }
}
