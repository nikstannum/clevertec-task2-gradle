package ru.clevertec;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertFalse;
import static org.junit.jupiter.api.Assertions.assertTrue;

class UtilsTest {

    @Test
    void checkIsAllPositiveNumbersShouldReturnTrue() {
        String firstPositive = "12";
        String secondPositive = "79";
        assertTrue(Utils.isAllPositiveNumbers(firstPositive, secondPositive));
    }

    @Test
    void checkIsAllPositiveNumbersShouldReturnFalse() {
        String firstPositive = "12";
        String secondPositive = "79";
        String negative = "-1.07";
        assertFalse(Utils.isAllPositiveNumbers(firstPositive, secondPositive, negative));
    }
}
