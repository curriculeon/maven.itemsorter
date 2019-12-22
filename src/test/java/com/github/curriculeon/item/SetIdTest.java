package com.github.curriculeon.item;

import org.junit.Assert;
import org.junit.Test;
import com.github.curriculeon.Item;

/**
 * @author leon on 30/01/2019.
 */
public class SetIdTest {
    @Test
    public void test1() {
        // given
        Long expectedId = 10L;
        Item item = new Item();

        // when
        item.setId(expectedId);
        Long actualId = item.getId();

        // then
        Assert.assertEquals(expectedId, actualId);
    }

    @Test
    public void test2() {
        // given
        Long expectedId = 5L;
        Item item = new Item();

        // when
        item.setId(expectedId);
        Long actualId = item.getId();

        // then
        Assert.assertEquals(expectedId, actualId);
    }


    @Test
    public void test3() {
        // given
        Long expectedId = -1L;
        Item item = new Item();

        // when
        item.setId(expectedId);
        Long actualId = item.getId();

        // then
        Assert.assertEquals(expectedId, actualId);
    }
}
