package com.github.curriculeon.comparators.idcomparator;

import org.junit.Assert;
import org.junit.Test;
import com.github.curriculeon.comparators.IdComparator;

import java.util.Comparator;

/**
 * @author leon on 30/01/2019.
 */
public class PolymorphismTest {
    @Test
    public void test1() {
        IdComparator nameComparator = new IdComparator();
        Assert.assertTrue(nameComparator instanceof Comparator);
    }
}
