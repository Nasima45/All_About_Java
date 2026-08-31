package org.example.Stream;

import java.util.Arrays;
import java.util.List;

public class StreamBasic {
    public static void main(String[] args) {

        List<Integer> list= Arrays.asList(13,20,1,3,4);
        List<List<Integer>> list1=Arrays.asList(
                Arrays.asList(11,13,12,20,1,3,4),
                Arrays.asList(3,2,1,30,4)
        );
        list1.stream().flatMap(x->x.stream())
                        .forEach(System.out::println);
        list.stream().filter(x->x>2).
                peek(System.out::println).map(x->x*2).sorted().forEach(System.out::println);
    }
}
