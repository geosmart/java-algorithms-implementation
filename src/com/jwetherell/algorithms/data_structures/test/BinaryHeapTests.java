package com.jwetherell.algorithms.data_structures.test;

import static org.junit.Assert.*;

import java.util.Collection;

import org.junit.Test;

import com.jwetherell.algorithms.data_structures.BinaryHeap;
import com.jwetherell.algorithms.data_structures.test.common.JavaCollectionTest;
import com.jwetherell.algorithms.data_structures.test.common.HeapTest;
import com.jwetherell.algorithms.data_structures.test.common.Utils;
import com.jwetherell.algorithms.data_structures.test.common.Utils.TestData;
import com.jwetherell.algorithms.data_structures.test.common.Utils.Type;

public class BinaryHeapTests {

    @Test
    public void testMinHeap() {
        TestData data = Utils.generateTestData(1000);

        String aNameMin = "Min-Heap [array]";
        BinaryHeap.BinaryHeapArray<Integer> aHeapMin = new BinaryHeap.BinaryHeapArray<Integer>(BinaryHeap.Type.MIN);
        Collection<Integer> aCollectionMin = aHeapMin.toCollection();
        assertTrue(HeapTest.testHeap(aHeapMin, aNameMin, BinaryHeap.Type.MIN, 
                                     data.unsorted, data.sorted, data.invalid));
        assertTrue(JavaCollectionTest.testCollection(aCollectionMin, Type.Integer, aNameMin,
                                                 data.unsorted, data.sorted));

        String tNameMin = "Min-Heap [tree]";
        BinaryHeap.BinaryHeapTree<Integer> tHeapMin = new BinaryHeap.BinaryHeapTree<Integer>(BinaryHeap.Type.MIN);
        Collection<Integer> tCollectionMin = tHeapMin.toCollection();
        assertTrue(HeapTest.testHeap(tHeapMin, tNameMin, BinaryHeap.Type.MIN,
                                     data.unsorted, data.sorted, data.invalid));
        assertTrue(JavaCollectionTest.testCollection(tCollectionMin, Type.Integer, tNameMin,
                                                 data.unsorted, data.sorted));
    }

    @Test
    public void testMaxHeap() {
        TestData data = Utils.generateTestData(1000);

        String aNameMax = "Max-Heap [array]";
        BinaryHeap.BinaryHeapArray<Integer> aHeapMax = new BinaryHeap.BinaryHeapArray<Integer>(BinaryHeap.Type.MAX);
        Collection<Integer> aCollectionMax = aHeapMax.toCollection();
        assertTrue(HeapTest.testHeap(aHeapMax, aNameMax, BinaryHeap.Type.MAX,
                                     data.unsorted, data.sorted, data.invalid));
        assertTrue(JavaCollectionTest.testCollection(aCollectionMax, Type.Integer, aNameMax,
                                                 data.unsorted, data.sorted));

        String lNameMax = "Max-Heap [tree]";
        BinaryHeap.BinaryHeapTree<Integer> tHeapMax = new BinaryHeap.BinaryHeapTree<Integer>(BinaryHeap.Type.MAX);
        Collection<Integer> tCollectionMax = tHeapMax.toCollection();
        assertTrue(HeapTest.testHeap(tHeapMax, lNameMax, BinaryHeap.Type.MAX,
                                     data.unsorted, data.sorted, data.invalid));
        assertTrue(JavaCollectionTest.testCollection(tCollectionMax, Type.Integer, lNameMax,
                                                 data.unsorted, data.sorted));
    }
}
