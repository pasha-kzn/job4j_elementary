package ru.job4j.condition;

import org.junit.Test;

import static org.junit.Assert.*;

import org.junit.Assert;
import org.junit.Test;

public class PointTest {
    @Test
    public void when00to20then2() {
        double expected = 2;
        Point a = new Point(0, 0);
        Point b = new Point(2, 0);
        double out = a.distance(b);
        Assert.assertEquals(expected, out, 0.01);
    }

    @Test
    public void when00to34then5() {
        double expected = 5;
        Point a = new Point(0, 0);
        Point b = new Point(3, 4);
        double out = a.distance(b);
        Assert.assertEquals(expected, out, 0.01);
    }

    @Test
    public void when11to54then5() {
        double expected = 5;
        Point a = new Point(1, 1);
        Point b = new Point(5, 4);
        double out = a.distance(b);
        Assert.assertEquals(expected, out, 0.01);
    }

    @Test
    public void when84to57then4dot24() {
        double expected = 4.24;
        Point a = new Point(8, 4);
        Point b = new Point(5, 7);
        double out = a.distance(b);
        Assert.assertEquals(expected, out, 0.01);
    }
}