package com.github.curriculeon.comparators;

import com.github.curriculeon.Item;

import java.util.Comparator;

/**
 * @author leon on 30/01/2019.
 */
public class PriceComparator implements Comparator<Item> {

    @Override
    public int compare(Item item, Item t1) {
        if(item.getPrice() < t1.getPrice()) return -1;
        else if(item.getPrice() > t1.getPrice()) return 1;
        else return 0;
    }
}
