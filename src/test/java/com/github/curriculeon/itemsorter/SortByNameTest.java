package com.github.curriculeon.itemsorter;

import org.junit.Assert;
import org.junit.Test;
import com.github.curriculeon.Item;
import com.github.curriculeon.ItemSorter;
import com.github.curriculeon.comparators.NameComparator;

import java.util.Comparator;

/**
 * @author leon on 30/01/2019.
 */
public class SortByNameTest {
    @Test
    public void test1() {
        // given
        Item item3 = new Item(0L, "Apple", 1.0);
        Item item2 = new Item(1L, "Banana", 1.5);
        Item item1 = new Item(2L, "Cherry", 2.0);
        Item[] itemsToSort = {item2, item1, item3};
        Item[] expected = {item3, item2, item1};
        ItemSorter itemSorter = new ItemSorter(itemsToSort);
        Comparator<Item> comparator = (Comparator<Item>) new NameComparator();

        // when
        Item[] actual = itemSorter.sort(comparator);

        // then
        Assert.assertArrayEquals(expected, actual);
    }

    @Test
    public void test2() {
        // given
        Item item3 = new Item(0L, "Razor", 1.0);
        Item item2 = new Item(1L, "Sharp", 1.5);
        Item item1 = new Item(2L, "Tapestry", 2.0);
        Item[] itemsToSort = {item2, item1, item3};
        Item[] expected = {item3, item2, item1};
        ItemSorter itemSorter = new ItemSorter(itemsToSort);
        Comparator<Item> comparator = (Comparator<Item>) new NameComparator();

        // when
        Item[] actual = itemSorter.sort(comparator);

        // then
        Assert.assertArrayEquals(expected, actual);
    }


    @Test
    public void test3() {
        // given
        Item item3 = new Item(0L, "Leon", 1.0);
        Item item2 = new Item(1L, "Nhu", 1.5);
        Item item1 = new Item(2L, "Wilhem", 2.0);
        Item[] itemsToSort = {item2, item1, item3};
        Item[] expected = {item3, item2, item1};
        ItemSorter itemSorter = new ItemSorter(itemsToSort);
        Comparator<Item> comparator = (Comparator<Item>) new NameComparator();

        // when
        Item[] actual = itemSorter.sort(comparator);

        // then
        Assert.assertArrayEquals(expected, actual);
    }
}
