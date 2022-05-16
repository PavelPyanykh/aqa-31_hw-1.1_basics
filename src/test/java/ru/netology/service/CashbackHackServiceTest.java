package ru.netology.service;

import org.junit.Test;

import static org.junit.Assert.*;

public class CashbackHackServiceTest {

    @Test
    public void shouldRemindUnder1000() {
        CashbackHackService service = new CashbackHackService();

        int amount = 900;

        int expected = 100;
        int actual = service.remain(amount);

        assertEquals(expected, actual);
    }

    @Test
    public void shouldRemindEqual1000() {
        CashbackHackService service = new CashbackHackService();

        int amount = 1000;

        int expected = 0;
        int actual = service.remain(amount);

        assertEquals(expected, actual);
    }

    @Test
    public void shouldRemindOver1000() {
        CashbackHackService service = new CashbackHackService();

        int amount = 1001;

        int expected = 999;
        int actual = service.remain(amount);


        assertEquals(expected, actual);
    }
}
