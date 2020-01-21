package com.github.curriculeon;

import java.util.Comparator;

/**
 * @author leon on 30/01/2019.
 */
public class ItemSorter {
    private Item[] items;
    public ItemSorter(Item[] items) {
        this.items = items;
    }

    public Item[] sort(Comparator<Item> comparator) {
        Item itemTemp;
        int i;
        for(i=0; i < this.items.length-1; i++)
        {
                 if ((comparator.compare(this.items[i], this.items[i + 1]) == 1) ||
                         (comparator.compare(this.items[i], this.items[i + 1]) > 0)) {
                    itemTemp = this.items[i];
                    this.items[i] = this.items[i + 1];
                    this.items[i + 1] = itemTemp;
                     i=-1;
                }  else if((comparator.compare(this.items[i], this.items[i + 1]) == -1) ||
                         (comparator.compare(this.items[i], this.items[i + 1]) == 0) ||
                         (comparator.compare(this.items[i], this.items[i + 1]) < 0)){
                     continue;
                 }
        }
        return this.items;
    }
}
