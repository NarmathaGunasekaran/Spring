package com.nseit.Spring;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Component;
@Component
public class BinaryaSearchImpl {
    @Autowired
//    @Qualifier("quick")

    private SortAlg quickSort;
//setter

//    public void setSortAlg(SortAlg sortAlg) {
//        this.sortAlg = sortAlg;
//    }
    //Constructor
//    public BinaryaSearchImpl(SortAlg sortAlg) { this.sortAlg = sortAlg;
//    }

    public int binarySearch(int[] numbers, int numberToSearch) {
//        BubbleSortAlg bubbleSortAlg = new BubbleSortAlg();
//        QuickSort quickSort = new QuickSort ();

        int[] sortedNumbers = quickSort.sort(numbers);
        System.out.println(quickSort);
        return 12;
    }
}
