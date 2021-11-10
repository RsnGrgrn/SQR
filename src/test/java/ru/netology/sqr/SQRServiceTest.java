package ru.netology.sqr;

import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.CsvSource;

import static org.junit.jupiter.api.Assertions.assertEquals;

class SQRServiceTest {

    @ParameterizedTest
    @CsvSource(value = {"'taskValue', 200, 300, 3",
                        "'minValue', 100, 100, 1",
                        "'maxValue', 9801, 9801, 1",
                        "'boundaryValues', 100, 9801, 90"
    })
    void shouldMultiplicat(String testName, int minRange, int maxRange, int expected) {
        SQRService sqrService = new SQRService();

        int actual = sqrService.multiplication(minRange, maxRange);

        assertEquals(expected, actual);
    }
}