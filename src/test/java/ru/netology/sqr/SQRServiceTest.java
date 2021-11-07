package ru.netology.sqr;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

class SQRServiceTest {

    @Test
    void shouldCalculateNumberSQRT() {
        SQRService sqrService = new SQRService();

        int expected = 3;
        int actual = sqrService.calculateSQRT(200,300);
        assertEquals(expected, actual);
    }
}
