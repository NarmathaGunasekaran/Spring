package com.nseit.Spring;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Configurable;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.beans.factory.config.ConfigurableBeanFactory;
import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Component;
@Component
@Scope(ConfigurableBeanFactory.SCOPE_PROTOTYPE)
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
