package com.thoughtworks.collection;

import sun.reflect.generics.reflectiveObjects.NotImplementedException;

import java.util.List;
import java.util.stream.Collectors;

public class Add {
    public int getSumOfEvens(int leftBorder, int rightBorder) {
        throw new NotImplementedException();
    }

    public int getSumOfOdds(int leftBorder, int rightBorder) {
        throw new NotImplementedException();
    }

    public int getSumTripleAndAddTwo(List<Integer> arrayList) {
        return arrayList.stream().map(item -> item * 3 + 2).reduce(0,(a,b) -> a + b);
       // return  arrayList.stream().mapToInt(i -> i * 3 + 2)
    }

    public List<Integer> getTripleOfOddAndAddTwo(List<Integer> arrayList) {
        /*ArrayList<Integer> result = new ArrayList<>();
        for(int i = 0; i < arrayList.size(); i++){
            int temp = arrayList.get(i);
            if(temp % 2 != 0){
                result.add(3 * temp + 2);
            }
            else {
                result.add(temp);
            }
        }

        return result;*/
        return arrayList.stream().map((item) -> {
            return  item % 2 == 0 ? item : item *3 + 2;
        }).collect(Collectors.toList());
        //throw new NotImplementedException();
    }

    public int getSumOfProcessedOdds(List<Integer> arrayList) {
        return arrayList.stream().filter(item -> item % 2 == 1).map(item -> item * 3 + 5).reduce(0,(a,b) -> a+b);
//        throw new NotImplementedException();
    }

    public double getMedianOfEven(List<Integer> arrayList) {
        throw new NotImplementedException();
    }

    public double getAverageOfEven(List<Integer> arrayList) {
        return arrayList.stream().filter(i -> i % 2 == 0).mapToDouble(i -> i).average().orElse(0);

        //throw new NotImplementedException();
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
