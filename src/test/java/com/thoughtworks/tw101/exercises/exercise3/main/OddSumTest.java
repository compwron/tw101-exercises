package com.thoughtworks.tw101.exercises.exercise3.main;

import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class OddSumTest {

    @Test
    public void shouldDoSomething() {
        OddSum test = new OddSum();
        assertEquals(25, test.of(1, 10));
    }
}