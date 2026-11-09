package agh.po.lab3;

import java.util.HashMap;
import java.util.Map;

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

    @org.junit.Test
    public void mapAB() {
        assertEquals(Map.of("a","Hi","b","There", "ab", "HiThere"), obiekt.mapAB(new HashMap<>(Map.of("a","Hi","b","There"))));
        assertEquals(Map.of("b","AGH","c","KRAKÓW"), obiekt.mapAB(new HashMap<>(Map.of("b","AGH", "c", "KRAKÓW"))));
        assertEquals(Map.of("a","a", "bb", "bb", "c", "c", "ddd", "ddd"), obiekt.mapAB(new HashMap<>(Map.of("a","a", "bb", "bb", "c", "c", "ddd", "ddd"))));
    }

    @org.junit.Test
    public void wordLen() {
        assertEquals(Map.of("herbata", 7,"krakow", 6, "kot", 3), obiekt.wordLen(new String[]{"herbata","kot","krakow"}));
        assertEquals(Map.of("qń", 2,"",0), obiekt.wordLen(new String[]{"qń", ""}));
        assertEquals(Map.of("kamil", 5, "ślimak", 6, "   ", 3), obiekt.wordLen(new String[]{"kamil","ślimak","   "}));
    }

}