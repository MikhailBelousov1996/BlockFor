package ru.netology.sqr;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

class SQRServiceTest {

    @Test
    void shouldCalculateNumberSQRT() {
        SQRService sqrService = new SQRService();

        int expected = 3;
        int actual = sqrService.calculateSQRT(200, 300);
        assertEquals(expected, actual);
    }

    @Test
    void shouldCalculateNumberSQRTMinDiapazone() {
        SQRService sqrService = new SQRService();

        int expected = 2;
        int actual = sqrService.calculateSQRT(150, 200);
        assertEquals(expected, actual);
    }

    @Test
    void shouldCalculateNumberSQRTVeryBigDiapazone() {
        SQRService sqrService = new SQRService();

        int expected = 90;
        int actual = sqrService.calculateSQRT(10, 2000000000);
        assertEquals(expected, actual);
    }

    @Test
    void shouldCalculateNumberSQRTNonSQRT() {
        SQRService sqrService = new SQRService();

        int expected = 0;
        int actual = sqrService.calculateSQRT(10, 20);
        assertEquals(expected, actual);
    }

    @Test
    void shouldCalculateNumberSQRTOneSQRT() {
        SQRService sqrService = new SQRService();

        int expected = 1;
        int actual = sqrService.calculateSQRT(10, 100);
        assertEquals(expected, actual);
    }
}
