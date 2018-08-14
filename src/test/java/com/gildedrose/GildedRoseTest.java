package com.gildedrose;

import static org.junit.Assert.assertEquals;

import org.junit.Before;
import org.junit.Test;


public class GildedRoseTest {

    @Before
    public void setup() {

    }

    @Test
    public void foo() {
        Item[] items = new Item[] { new Item("foo", 0, 0) };

        GildedRose app = new GildedRose(items);
        app.updateQuality();

        assertEquals("foo", app.items[0].name);
    }

}
