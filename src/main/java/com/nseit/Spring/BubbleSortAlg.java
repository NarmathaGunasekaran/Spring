package com.nseit.Spring;

import org.springframework.context.annotation.Primary;
import org.springframework.stereotype.Component;

@Component
//@Primary
public class BubbleSortAlg implements SortAlg{
    public int[] sort(int[] numbers){
        return numbers;
    }
}
