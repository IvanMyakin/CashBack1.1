package ru.netology.service;

import org.testng.annotations.Test;

import org.testng.Assert.*;

import static org.testng.Assert.assertEquals;


public class CashbackHackServiceTest {
    @Test
    public void shouldRemain1000IfAmount0() {
        CashbackHackService service = new CashbackHackService();
        int amount = 0;
        int actual = service.remain(amount);
        int expected = 1000;

        assertEquals(actual, expected);
    }

    @Test
    public void shouldRemain0IfAmount1000() {
        CashbackHackService service = new CashbackHackService();
        int amount = 1000;
        int actual = service.remain(amount);
        int expected = 0;

        assertEquals(actual, expected);
    }

}
