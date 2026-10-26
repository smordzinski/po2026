package agh.po.lab3;

import static org.junit.Assert.*;

public class CodingBatTest {

    CodingBat obiekt = new CodingBat();

    @org.junit.Test
    public void monkeyTrouble() {
        assertEquals(true, obiekt.monkeyTrouble(true,true));
        assertEquals(true, obiekt.monkeyTrouble(false,false));
        assertEquals(false, obiekt.monkeyTrouble(true,false));
    }

    @org.junit.Test
    public void mixStart() {
        assertEquals(true, obiekt.mixStart("mix snacks"));
        assertEquals(true, obiekt.mixStart("pix snacks"));
        assertEquals(false, obiekt.mixStart("piz snacks"));
    }

    @org.junit.Test
    public void no14() {
        assertEquals(true, obiekt.no14(new int[]{1,2,3}));
        assertEquals(false, obiekt.no14(new int[]{1,2,3,4}));
        assertEquals(false, obiekt.no14(new int[]{2,3,4,1}));
    }

    @org.junit.Test
    public void makeAbba() {
        assertEquals("HiByeByeHi", obiekt.makeAbba("Hi", "Bye"));
        assertEquals("YoAliceAliceYo", obiekt.makeAbba("Yo", "Alice"));
        assertEquals("aaabbbbbbaaa", obiekt.makeAbba("aaa", "bbb"));
    }
}