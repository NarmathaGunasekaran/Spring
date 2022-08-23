package com.nseit.Spring;

import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.context.annotation.Primary;
import org.springframework.stereotype.Component;

@Component
//@Qualifier("quick")
//@Primary
public class QuickSort implements SortAlg{
    public int[] sort(int[] numbers) {
        return numbers;
    }
}

