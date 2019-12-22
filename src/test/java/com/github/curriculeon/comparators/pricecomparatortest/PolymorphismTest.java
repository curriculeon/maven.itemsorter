package com.github.curriculeon.comparators.pricecomparatortest;

import org.junit.Assert;
import org.junit.Test;
import com.github.curriculeon.comparators.PriceComparator;

import java.util.Comparator;

/**
 * @author leon on 30/01/2019.
 */
public class PolymorphismTest {
    @Test
    public void test1() {
        PriceComparator priceComparator = new PriceComparator();
        Assert.assertTrue(priceComparator instanceof Comparator);
    }
}
