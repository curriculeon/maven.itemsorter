package com.github.curriculeon.comparators.namecomparator;

import org.junit.Assert;
import org.junit.Test;
import com.github.curriculeon.comparators.NameComparator;

import java.util.Comparator;

/**
 * @author leon on 30/01/2019.
 */
public class PolymorphismTest {
    @Test
    public void test1() {
        NameComparator nameComparator = new NameComparator();
        Assert.assertTrue(nameComparator instanceof Comparator);
    }
}
