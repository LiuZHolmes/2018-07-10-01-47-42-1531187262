package com.thoughtworks.collection;

import sun.reflect.generics.reflectiveObjects.NotImplementedException;

import java.util.ArrayList;
import java.util.IntSummaryStatistics;
import java.util.List;
import java.util.stream.Collector;
import java.util.stream.Collectors;
import java.util.stream.IntStream;

public class Add {
    public int getSumOfEvens(int leftBorder, int rightBorder) {
        int start = Math.min(leftBorder,rightBorder);
        int end = Math.max(leftBorder, rightBorder);
        return IntStream.rangeClosed(start,end).filter(x -> x % 2 == 0 ).sum();
    }

    public int getSumOfOdds(int leftBorder, int rightBorder) {
        int start = Math.min(leftBorder,rightBorder);
        int end = Math.max(leftBorder, rightBorder);
        return IntStream.rangeClosed(start,end).filter(x -> x % 2 != 0).sum();
    }

    public int getSumTripleAndAddTwo(List<Integer> arrayList) {
        return arrayList.stream().mapToInt(x -> x*3+2).sum();
    }

    public List<Integer> getTripleOfOddAndAddTwo(List<Integer> arrayList) {
        return arrayList.stream().map(x -> x % 2 != 0 ? x*3+2 : x).collect(Collectors.toList());

    }

    public int getSumOfProcessedOdds(List<Integer> arrayList) {
        return arrayList.stream().filter(x -> x % 2 != 0).mapToInt(x -> x*3+5).sum();
    }

    public double getMedianOfEven(List<Integer> arrayList) {
        List<Integer> ar = arrayList.stream().filter(x -> x % 2 == 0).collect(Collectors.toList());
        return ar.indexOf(ar.size()/2);

    }

    public double getAverageOfEven(List<Integer> arrayList) {
        throw new NotImplementedException();
    }

    public boolean isIncludedInEvenIndex(List<Integer> arrayList, Integer specialElment) {
        throw new NotImplementedException();
    }

    public List<Integer> getUnrepeatedFromEvenIndex(List<Integer> arrayList) {
        throw new NotImplementedException();
    }

    public List<Integer> sortByEvenAndOdd(List<Integer> arrayList) {
        throw new NotImplementedException();
    }

    public List<Integer> getProcessedList(List<Integer> arrayList) {
        throw new NotImplementedException();
    }
}
