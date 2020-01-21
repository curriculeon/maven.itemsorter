package com.github.curriculeon.comparators;

import com.github.curriculeon.Item;

import java.util.Comparator;
import java.util.function.Function;
import java.util.function.ToDoubleFunction;
import java.util.function.ToIntFunction;
import java.util.function.ToLongFunction;

/**
 * @author leon on 30/01/2019.
 */
public class IdComparator implements Comparator<Item> {

    @Override
    public int compare(Item item, Item t1) {
        if(item.getId() < t1.getId()) return -1;
        else if(item.getId() > t1.getId()) return 1;
        else return 0;
    }
}
