package com.cbfacademy;
import static org.junit.jupiter.api.Assertions.*;
import org.junit.jupiter.api.Test;

class YearTest {

    @Test
    void testLeapYears() {
        assertEquals(true, Year.isLeap(2000));
        assertEquals(true, Year.isLeap(2004));
        assertEquals(true, Year.isLeap(2008));
    }

    @Test
    void testNonLeapYears() {
        assertEquals(false, Year.isLeap(1700));
        assertEquals(false, Year.isLeap(1800));
        assertEquals(false, Year.isLeap(1900));
        assertEquals(false, Year.isLeap(2001));
        assertEquals(false, Year.isLeap(2002));
        assertEquals(false, Year.isLeap(2003));
        assertEquals(false, Year.isLeap(2005));
        assertEquals(false, Year.isLeap(2006));
        assertEquals(false, Year.isLeap(2007));
        assertEquals(false, Year.isLeap(2009));
        assertEquals(false, Year.isLeap(2010));
        assertEquals(false, Year.isLeap(2011));
    }
}

