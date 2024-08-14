/*
 * This source file was generated by the Gradle 'init' task
 */
package org.example.list;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

import java.util.concurrent.TimeUnit;

class LinkedList11Test {
    @Test void testConstructor() {
        LinkedList list = new LinkedList();
        assertEquals(0, list.size());
    }

    @Test void testAdd() throws InterruptedException {
        LinkedList list = new LinkedList();
        TimeUnit.SECONDS.sleep(10);
   
        list.add("one");
        assertEquals(1, list.size());
        assertEquals("one", list.get(0));

        TimeUnit.SECONDS.sleep(10);

        list.add("two");

        TimeUnit.SECONDS.sleep(10);

        assertEquals(2, list.size());
        assertEquals("two", list.get(1));
    }

    @Test void testRemove() throws InterruptedException {
        LinkedList list = new LinkedList();

        list.add("one");
        list.add("two");

        TimeUnit.SECONDS.sleep(10);

        assertTrue(list.remove("one"));

        TimeUnit.SECONDS.sleep(10);

        assertEquals(1, list.size());
        assertEquals("two", list.get(0));

        TimeUnit.SECONDS.sleep(10);

        assertTrue(list.remove("two"));
        assertEquals(0, list.size());
    }

    @Test public void testRemoveMissing() throws InterruptedException {
        LinkedList list = new LinkedList();

        TimeUnit.SECONDS.sleep(10);

        list.add("one");
        list.add("two");
        
        TimeUnit.SECONDS.sleep(10);
        assertFalse(list.remove("three"));

        TimeUnit.SECONDS.sleep(10);
        assertEquals(2, list.size());
    }
}
